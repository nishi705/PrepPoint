package main.Advance.Arrays;
/*
Problem Description
Given an array, A of integers of size N. Find the maximum value of j - i such that A[i] <= A[j].



Problem Constraints
1 <= N <= 105

-109 <= A[i] <= 109



Input Format
First argument is an integer array A of size N.



Output Format
Return an integer denoting the maximum value of j - i.



Example Input
Input 1:

A = [3, 5, 4, 2]
Input 2:

A = [4, 1, 3, 0]


Example Output
Output 1:

2
Output 2:

1


Example Explanation
Explanation 1:

For A[0] = 3 and A[2] = 4, the ans is (2 - 0) = 2.
Explanation 2:

For A[1] = 1 and A[2] = 3, the ans is (2 - 1) = 1.
 */
public class Max_Distance {
}
/*
public class Solution {
    public int maximumGap(final int[] A) {
      //array
      //A[i]<=A[j]
      //j-i;

      int[] temp = new int[A.length];
      int n = A.length;
      temp[n-1] = A[n-1];

      for(int i=n-2;i>=0;i--){
          temp[i] = Math.max(temp[i+1],A[i]);
      }


      int i=0;
      int j=0;
      int max = Integer.MIN_VALUE;
      while(i<n && j<n){
          if(temp[j]>=A[i]){
              max = Math.max(max,j-i);
              j++;
          }else{
              i++;
          }

      }
      return max;

    }
}

 */