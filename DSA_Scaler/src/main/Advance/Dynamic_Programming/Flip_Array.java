package main.Advance.Dynamic_Programming;
/*
Problem Description

Given an array A of positive elements, you have to flip the sign of some of its elements such that the resultant sum of the elements of array should be minimum non-negative(as close to zero as possible).

Return the minimum number of elements whose sign needs to be flipped such that the resultant sum is minimum non-negative.



Problem Constraints

1 <= length of(A) <= 100

Sum of all the elements will not exceed 10,000.



Input Format

First and only argument is an integer array A.



Output Format

Return an integer denoting the minimum number of elements whose sign needs to be flipped.



Example Input

Input 1:

 A = [15, 10, 6]
Input 2:

 A = [14, 10, 4]


Example Output

Output 1:

 1
Output 2:

 1


Example Explanation

Explanation 1:

 Here, we will flip the sign of 15 and the resultant sum will be 1.
Explanation 2:

 Here, we will flip the sign of 14 and the resultant sum will be 0.
 Note that flipping the sign of 10 and 4 also gives the resultant sum 0 but flippings there sign are not minimum.
 */
public class Flip_Array {
}
/*
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[] A) {
        int sum = 0, n = A.length;
        for(int num: A) sum+=num;
        sum = sum/2;
        int[][] dp1 = new int[n][sum+1];
        for(int[] arr: dp1) Arrays.fill(arr,-1);
        int maxSum = getMaxSum(n-1,sum,A,dp1);
        int[][] dp2 = new int[n][maxSum+1];
        for(int[] arr: dp2) Arrays.fill(arr,-1);
        return getMinCount(n-1, maxSum, A, dp2);
    }
    private int getMaxSum(int i, int sum, int[] given, int[][] dp) {
        if(sum==0) return 0;
        if(i==0) {
            if(given[i]<=sum) return given[i];
            else return 0;
        }
        if(dp[i][sum]!=-1) return dp[i][sum];
        int notFlip = getMaxSum(i-1,sum,given,dp);
        if(given[i]<=sum) {
            dp[i][sum] = Math.max(notFlip, given[i]+getMaxSum(i-1, sum-given[i], given, dp));
        }else {
            dp[i][sum] = notFlip;
        }
        return dp[i][sum];
    }
    private int getMinCount(int i, int sum, int[] given, int[][] dp) {
        if(sum==0) return 0;
        if(i==0) {
            if(given[0]==sum) return 1;
            else return 101;//since the length range of the given arrays is 1-100
        }
        if(dp[i][sum]!=-1) return dp[i][sum];
        int notTake = getMinCount(i-1,sum,given,dp);
        if(given[i]<=sum) {
            dp[i][sum] = Math.min(notTake, 1+getMinCount(i-1, sum-given[i], given, dp));
        }else {
            dp[i][sum] = notTake;
        }
        return dp[i][sum];
    }
}
 */
