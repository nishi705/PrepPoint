import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Client {



    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", +500);
        map.put("B", -200);
        map.put("C", +600);
        map.put("D", -400);
        map.put("E", -300);
        map.put("F", -500);
        map.put("G", +400);
        map.put("H", -400);
        map.put("I", +300);

        List<Transaction> trans = calculateTransaction(map);
        System.out.println(trans);
    }

    private static List<Transaction> calculateTransaction(HashMap<String, Integer> balMap){
        PriorityQueue<UserForPQ> paidLess = new PriorityQueue<>();
        PriorityQueue<UserForPQ> paidMore = new PriorityQueue<>();

        for(String userName: balMap.keySet()){
            int amount = balMap.get(userName);

            if(amount < 0){
                UserForPQ user = new UserForPQ();
                user.name = userName;
                user.val = -amount;
                paidLess.add(user);
            } else {
                UserForPQ user = new UserForPQ();
                user.name = userName;
                user.val = amount;
                paidMore.add(user);
            }
        }

        List<Transaction> res = new ArrayList<>();
        while(paidLess.size() > 0 && paidMore.size() > 0){
            UserForPQ from = paidLess.remove();
            UserForPQ to = paidMore.remove();
            int amount = Math.min(from.val, to.val);

            Transaction transaction = new Transaction();
            transaction.from = from.name;
            transaction.to = to.name;
            transaction.amount = amount;
            res.add(transaction);

            from.val -= amount;
            to.val -= amount;

            if(from.val > 0){
                paidLess.add(from);
            }

            if(to.val > 0){
              paidMore.add(to);
            }
        }

        return res;
    }
}

// GC -> GS
// EPRep
// ESRep
// HM<User, Integer>
// Get transactions from calculateTransaction
