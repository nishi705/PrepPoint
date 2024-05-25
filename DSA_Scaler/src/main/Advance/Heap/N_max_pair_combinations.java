package main.Advance.Heap;
/*
Problem Description
Given two integers arrays, A and B, of size N each.

Find the maximum N elements from the sum combinations (Ai + Bj) formed from elements in arrays A and B.



Problem Constraints
1 <= N <= 2 * 105

-1000 <= A[i], B[i] <= 1000



Input Format
The first argument is an integer array A.
The second argument is an integer array B.



Output Format
Return an integer array denoting the N maximum element in descending order.



Example Input
Input 1:

 A = [1, 4, 2, 3]
 B = [2, 5, 1, 6]
Input 2:

 A = [2, 4, 1, 1]
 B = [-2, -3, 2, 4]


Example Output
Output 1:

 [10, 9, 9, 8]
Output 2:

 [8, 6, 6, 5]


Example Explanation
Explanation 1:

 4 maximum elements are 10(6+4), 9(6+3), 9(5+4), 8(6+2).
Explanation 2:

 4 maximum elements are 8(4+4), 6(4+2), 6(4+2), 5(4+1).
 */
public class N_max_pair_combinations {
}
/*
public class Solution {

    class Pair{
        int val;
        int x;
        int y;

        Pair(int val,int x,int y){
            this.val=val;
            this.x = x;
            this.y=y;

        }
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> b.val-a.val);
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

        Collections.sort(A);
        Collections.sort(B);
     //  pq.add(new Pair(A.get(size-1)+B.get(size-1) ,size-1,size-1));
        pq.add(new Pair(A.get(A.size()-1)+B.get(B.size()-1),A.size()-1,B.size()-1));


        while(!pq.isEmpty()){
            Pair p = pq.poll();
            al.add(p.val);
            int a = p.x;
            int b = p.y;



             String s1 = (a-1)+"+"+b;
             String s2 =a+"+"+(b-1);


             if(a-1>-1 && !set.contains(s1)){
               pq.add(new Pair(A.get(a-1)+B.get(b),a-1,b));
               set.add(s1);
             }

             if(b-1>-1 && !set.contains(s2)){
                 pq.add(new Pair(A.get(a)+B.get(b-1),a,b-1));
                 set.add(s2);
             }

             if(al.size()==A.size())break;

        }

        return al;



    }
}

 */