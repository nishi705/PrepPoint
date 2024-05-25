package main.Advance.Dynamic_Programming;
/*
Problem Description
Given a 2 x N grid of integers, A, your task is to choose numbers from the grid such that sum of these numbers is maximized.
However, you cannot choose two numbers that are adjacent horizontally, vertically, or diagonally.

Return the maximum possible sum.

Note: You are allowed to choose more than 2 numbers from the grid.


Problem Constraints
1 <= N <= 20000
1 <= A[i] <= 2000


Input Format
The first and the only argument of input contains a 2d matrix, A.


Output Format
Return an integer, representing the maximum possible sum.


Example Input
Input 1:

 A = [
        [1]
        [2]
     ]
Input 2:

 A = [
        [1, 2, 3, 4]
        [2, 3, 4, 5]
     ]


Example Output
Output 1:

 2
Output 2:

 8
 */
public class Max_Sum_Without_Adjacent_Elements {
}
/*
public class Solution {
    int[] dp;
    public int adjacent(int[][] A) {
        dp = new int[A[0].length];
        Arrays.fill(dp,-1);
        return maxNoAdjacent(A,A[0].length-1);
    }

    public int maxNoAdjacent(int[][] mat,int i){
        if(i < 0){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int inc = maxNoAdjacent(mat,i-2) + Math.max(mat[0][i], mat[1][i]);
        int exc = maxNoAdjacent(mat,i-1);
        int ans = Math.max(inc, exc);
        dp[i] = ans;
        return ans;
    }
}


 */