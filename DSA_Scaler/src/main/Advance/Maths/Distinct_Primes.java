package main.Advance.Maths;
/*
You have given an array A having N integers. Let say G is the product of all elements of A.

You have to find the number of distinct prime divisors of G.



Input Format

The first argument given is an Array A, having N integers.
Output Format

Return an Integer, i.e number of distinct prime divisors of G.
Constraints

1 <= N <= 1e5
1 <= A[i] <= 1e5
For Example

Input:
    A = [1, 2, 3, 4]
Output:
     2

Explanation:
    here G = 1 * 2 * 3 * 4 = 24
    and distinct prime divisors of G are [2, 3]
 */
public class Distinct_Primes {
}
/*
public class Solution {
    public int solve(ArrayList<Integer> A) {
        int g=0;
        int mod=1000000007;
        for(int i=0;i<A.size();i++){
           g = Math.max(g,A.get(i));
         }



         int[] spf =new int[g+1];

         for(int i=0;i<spf.length;i++){
             spf[i] =i;
         }

         for(int i=2;i*i<=g;i++){
              for(int j=i*i;j<=g;j+=i){
                    if(spf[j] == j){
                        spf[j]=i;
                    }
              }
         }

         HashSet<Integer> set = new HashSet<Integer>();
         for(int i=0;i<A.size();i++){
            if(A.get(i) <2) continue;
            int element = A.get(i);
            while(element>1){
                set.add(spf[element]);
                element= element/spf[element];

            }
         }

         return set.size();

    }
}

 */