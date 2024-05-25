package main.Advance.Greedy_algo;
/*

 */
public class Flipkart_Challenge_in_Effective_Inventory_Management {
}
/*
public class Solution {
    class Pair{
        int time;
        int profit;

        Pair(int time,int profit){
            this.time = time;
            this.profit = profit;
        }
    }

    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        ArrayList<Pair> al = new ArrayList<Pair>();
        int mod = 1000000007;
        for(int i=0;i<A.size();i++){
           // ArrayList<Pair> p = new ArrayList<Pair>();
            al.add(new Pair(A.get(i),B.get(i)));
            //al.add(p);
        }


        Collections.sort(al, (a,b)->{
            if(a.time < b.time){
                return -1;
            }else{
                return 1;
            }

        });


        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        int ans =0;
        int timer=0;
        for(Pair p:al){
            if(timer<p.time){
            timer++;
            minheap.add(p.profit);
            ans+=p.profit;
            ans=ans%mod;
        }else{
            if(p.profit > minheap.peek()){
                int min = minheap.poll();
                ans-=min;
                minheap.add(p.profit);
                ans+=p.profit;
                ans=ans%mod;
            }
        }
        }
        return ans%mod;

    }
}

 */