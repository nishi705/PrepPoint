package main.Advance.Dynamic_Programming;
/*
Problem Description
Given a string A. Find the longest palindromic subsequence (A subsequence which does not need to be contiguous and is a palindrome).

You need to return the length of longest palindromic subsequence.



Problem Constraints
1 <= length of(A) <= 103



Input Format
First and only integer is a string A.



Output Format
Return an integer denoting the length of longest palindromic subsequence.



Example Input
Input 1:

 A = "bebeeed"
Input 2:

 A = "aedsead"


Example Output
Output 1:

 4
Output 2:

 5


Example Explanation
Explanation 1:

 The longest palindromic subsequence is "eeee", which has a length of 4.
Explanation 2:

 The longest palindromic subsequence is "aedea", which has a length of 5.
 */

public class Longest_Palindromic_Subsequence {
}
/*
public class Solution {
    public int solve(String A) {
        int n = A.length();
        String B ="";
        for(int i=n-1; i>=0; i--){
            char ch = A.charAt(i);
            B = B + ch;
        }
        return twoS(A, B);
    }
    public int dp[][];
    public int twoS(String A, String B) {
        int n = A.length();
        int m = A.length();

        dp = new int[n][m];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        return lcs(A, B, n-1, m-1);
    }
    public int lcs(String A, String B, int i, int j){

        // base case
        if(i < 0 || j < 0){
            return 0;
        }
        // when call is repeated
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        // main logic
        int ans = 0;
        if( A.charAt(i) == B.charAt(j)){
            ans = lcs(A, B, i-1, j-1) + 1;
        }
        else{
            int l1 = lcs(A,B,i-1, j);
            int l2 = lcs(A,B,i, j-1);
            ans = Math.max( l1 , l2);
        }
        return dp[i][j] = ans;
    }
}
 */