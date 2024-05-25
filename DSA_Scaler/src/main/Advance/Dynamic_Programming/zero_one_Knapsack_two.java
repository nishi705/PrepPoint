package main.Advance.Dynamic_Programming;
/*
Problem Description
Given two integer arrays A and B of size N each which represent values and weights associated with N items respectively.

Also given an integer C which represents knapsack capacity.

Find out the maximum value subset of A such that sum of the weights of this subset is smaller than or equal to C.

NOTE: You cannot break an item, either pick the complete item, or don’t pick it (0-1 property).



Problem Constraints
1 <= N <= 500

1 <= C, B[i] <= 106

1 <= A[i] <= 50



Input Format
First argument is an integer array A of size N denoting the values on N items.

Second argument is an integer array B of size N denoting the weights on N items.

Third argument is an integer C denoting the knapsack capacity.



Output Format
Return a single integer denoting the maximum value subset of A such that sum of the weights of this subset is smaller than or equal to C.



Example Input
Input 1:

 A = [6, 10, 12]
 B = [10, 20, 30]
 C = 50
Input 2:

 A = [1, 3, 2, 4]
 B = [12, 13, 15, 19]
 C = 10


Example Output
Output 1:

 22
Output 2:

 0


Example Explanation
Explanation 1:

 Taking items with weight 20 and 30 will give us the maximum value i.e 10 + 12 = 22
Explanation 2:

 Knapsack capacity is 10 but each item has weight greater than 10 so no items can be considered in the knapsack therefore answer is 0.

 */
public class zero_one_Knapsack_two {
}
/*
public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {

        int N = B.size();
        int[] dp = new int[C+1];

        for(int i = 1; i < 1+ N; i++){
            for(int j = C; j >= 0; j–){
                if(B.get(i-1) <= j){
                    dp[j] = Math.max(dp[j], A.get(i-1) + dp[j - B.get(i-1)]);
                }
            }
        }
        return dp[C];
    }
}




public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {

        int N = B.size();
        int[][] dp = new int[N+1][C+1];


        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= C; j++){
                int rem = j - B.get(i-1);
                if(rem >= 0) dp[i][j] = Math.max(dp[i-1][j], A.get(i-1) + dp[i-1][rem]);
                else dp[i][j] = dp[i-1][j];
            }
        }

        return dp[N][C];

    }

}
/
 */