package main.Advance.Maths;
/*
Problem Description
Given an array of integers A, find and return the count of divisors of each element of the array.

NOTE: The order of the resultant array should be the same as the input array.



Problem Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 106



Input Format
The only argument given is the integer array A.



Output Format
Return the count of divisors of each element of the array in the form of an array.



Example Input
Input 1:

 A = [2, 3, 4, 5]
Input 2:

 A = [8, 9, 10]


Example Output
Output 1:

 [2, 2, 3, 2]
Output 1:

 [4, 3, 4]


Example Explanation
Explanation 1:

 The number of divisors of 2 : [1, 2], 3 : [1, 3], 4 : [1, 2, 4], 5 : [1, 5]
 So the count will be [2, 2, 3, 2].
Explanation 2:

 The number of divisors of 8 : [1, 2, 4, 8], 9 : [1, 3, 9], 10 : [1, 2, 5, 10]
 So the count will be [4, 3, 4].
 */
public class Count_of_divisors {
}
/*
public class Solution {
    public int[] solve(int[] A) {

        int[] N = new int[A.length];

        for(int i=0;i<A.length;i++){
            int divisor = 1;

            int c = A[i];
            while(c>1){
                int x = spf(c);
                int power = 1;

                while(c%x==0){

                    c=c/x;
                    power++;
                }
                divisor = divisor * (power);
            }
            N[i] = divisor;
        }
        return N;

    }

    static int spf(int n){

        for(int i=2;i*i<=n;i++){
          if(n%i==0){
              return i;
          }

        }
        return n;
    }
}

 */