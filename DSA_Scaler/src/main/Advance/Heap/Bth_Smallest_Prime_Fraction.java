package main.Advance.Heap;
/*
Problem Description
Given a sorted array of integers A which contains 1 and some number of primes.
Then, for every p < q in the list, we consider the fraction p / q.

What is the B-th smallest fraction considered?

Return your answer as an array of integers, where answer[0] = p and answer[1] = q.



Problem Constraints
1 <= length(A) <= 2000
1 <= A[i] <= 30000
1 <= B <= length(A)*(length(A) - 1)/2



Input Format
The first argument of input contains the integer array, A.
The second argument of input contains an integer B.



Output Format
Return an array of two integers, where answer[0] = p and answer[1] = q.



Example Input
Input 1:

 A = [1, 2, 3, 5]
 B = 3
Input 2:

 A = [1, 7]
 B = 1


Example Output
Output 1:

 [2, 5]
Output 2:

 [1, 7]


Example Explanation
Explanation 1:

 The fractions to be considered in sorted order are:
 [1/5, 1/3, 2/5, 1/2, 3/5, 2/3]
 The third fraction is 2/5.
Explanation 2:

 The fractions to be considered in sorted order are:
 [1/7]
 The first fraction is 1/7.
 */
public class Bth_Smallest_Prime_Fraction {
}
/*

public class Solution {

    class Pair{
    Float ratio;
    int x;
    int y;

    Pair(float ratio,int x,int y){
        this.ratio = ratio;
        this.x = x;
        this.y = y;
    }
}
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparing(x-> x.ratio));

        float a = (float)A.get(A.size()-1);
        int n = A.size();

        for(int i=0;i<A.size()-1;i++){
              pq.add(new Pair(A.get(i)/a,i,n-1));
        }

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=1;i<B;i++){
            Pair p = pq.poll();

            if((p.y-1)>(p.x)){
    // priorityQueue.add(new Tuple((float) (input.get(top.x)/(0.0+input.get(top.y-1))),top.x,top.y-1));
                pq.add(new Pair((float)(A.get(p.x)/(0.0+A.get(p.y-1))),p.x,p.y-1));
            }
        }

        Pair p1 = pq.poll();
        al.add(A.get(p1.x));
        al.add(A.get(p1.y));

        return al;
    }
}

 */