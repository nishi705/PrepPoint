package main.Advance.Maths;
/*
Given an array A having N positive numbers. You have to find the number of Prime subsequences of A.

A Prime subsequence is one that has only prime numbers, for example [2, 3], [5] are the Prime subsequences where [2, 4] and [1, 2, 3, 4] are not.



Input Format

The first argument given is an Array A, having N integers.
Output Format

Return an integer X, i.e number of Prime subsequences.
As X can be very large print X % (1000000007), here % is modulus operator.
Constraints

1 <= N <= 1e3
1 <= A[i] <= 1e6
For Example

Input:
    A = [1, 2, 3]
Output:
     3

Explanation:
    no. Subsequences      Prime subsequences
    1.  [1]                     No
    2.  [1, 2]                  No
    3.  [1, 3]                  No
    4.  [1, 2, 3]               No
    5.  [2]                     Yes
    6.  [2, 3]                  Yes
    7.  [3]                     Yes
    8.  []                      No

    here we have 3 subsequences(5, 6, 7) those have only prime number(s).
 */
public class Prime_Subsequences {
}
/*
public class Solution {
    public int solve(ArrayList<Integer> A) {
         int maxNum= 0;
        for(int i=0;i<A.size();i++){
          //  if((A.get(i) % 2) ==0) continue;
            maxNum = Math.max(maxNum,A.get(i));
        }

        int[] spf = new int[maxNum+1];

        for(int i=0;i<spf.length;i++){
            spf[i] =i;
        }

        for(int i=2;i*i<=maxNum;i++){
             for(int j=i*i;j<=maxNum;j+=i){
                 if(spf[j] == j){
                     spf[j] =i;
                 }
             }
        }

       long count=0L;int mod=1000000007;
       long num=1L;

        for(int i=0;i<A.size();i++){
            if(A.get(i) < 2 ) continue;
            if(spf[A.get(i)] == A.get(i)){
              // System.out.println(spf[A.get(i)] );
                count = ((count%mod)+(num%mod))%mod;
                num = (num*2)%mod; //this line is important
            }
        }
         //System.out.println(numOfPrimeNumbers);
        return (int)count;
    }
}

 */