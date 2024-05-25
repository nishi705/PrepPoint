package main.Advance.Dynamic_Programming;
/*
Problem Description
Given a string A, partition A such that every substring of the partition is a palindrome.

Return the minimum cuts needed for a palindrome partitioning of A.



Problem Constraints
1 <= length(A) <= 501



Input Format
The first and the only argument contains the string A.



Output Format
Return an integer, representing the minimum cuts needed.



Example Input
Input 1:

 A = "aba"
Input 2:

 A = "aab"


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 "aba" is already a palindrome, so no cuts are needed.
Explanation 2:

 Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.
 */
public class Palindrome_Partitioning_two {
}
/*
public class Solution {
    public int minCut(String A) {

        int n = A.length();
        //palindromeDP[i][j] = store if it is palindrome or not from index i to j
        int[][] palindromeDP = new int[n][n];
        for(int[] col : palindromeDP) Arrays.fill(col,-1);

        fillPalindromicDP(A,palindromeDP); // Checking palindrome for each substring

        //dpCuts[i][j] = stores min cuts required from i to j
        int[][] dpCuts = new int[n][n];
        for(int[] col : dpCuts) Arrays.fill(col,-1);

        return minCuts(palindromeDP,dpCuts,0,n-1);
    }


    int minCuts(int[][] dp,int[][] dpCuts,int s, int e){
        if(dp[s][e] == 1){
            dpCuts[s][e] = 0;
            return dpCuts[s][e];
        }

        if(dpCuts[s][e] != -1) return dpCuts[s][e];

        int min = Integer.MAX_VALUE;
        for(int cut = s ; cut<=e ; cut++){
            if(dp[s][cut] == 1){ //left side is palindrome
                int x = minCuts(dp,dpCuts,cut+1,e);
                min = Math.min(min,x);
            }
        }
        dpCuts[s][e] =  1 + min;
        return dpCuts[s][e];

    }

    void fillPalindromicDP(String A, int[][] dp){
       int len = A.length();
       for(int i= 0 ; i<len ; i++){
           for(int j = i ; j<len;j++){
                if(dp[i][j] == -1){
                    int x = checkPalindrome(A,dp,i,j);
                }
            }
       }
    }

    //This code can be optimized using tabulation - see comment
    int checkPalindrome(String A, int[][] dp, int i, int j){
        if(j<i){
            return 1;
        }
        if(i == j){
            dp[i][j] = 1;
            return dp[i][j];
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(A.charAt(i) != A.charAt(j)){
             dp[i][j] = 0;
        }else{
            dp[i][j] = checkPalindrome(A,dp,i+1,j-1);
        }
        return dp[i][j];
    }
}
 */