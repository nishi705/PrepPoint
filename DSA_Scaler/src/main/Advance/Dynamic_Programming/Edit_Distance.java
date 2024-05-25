package main.Advance.Dynamic_Programming;
/*
Problem Description
Given two strings A and B, find the minimum number of steps required to convert A to B. (each operation is counted as 1 step.)

You have the following 3 operations permitted on a word:

Insert a character
Delete a character
Replace a character


Problem Constraints
1 <= length(A), length(B) <= 450



Input Format
The first argument of input contains a string, A.
The second argument of input contains a string, B.



Output Format
Return an integer, representing the minimum number of steps required.



Example Input
Input 1:

 A = "abad"
 B = "abac"
Input 2:

 A = "Anshuman"
 B = "Antihuman


Example Output
Output 1:

 1
Output 2:

 2


Example Explanation
Exlanation 1:

 A = "abad" and B = "abac"
 After applying operation: Replace d with c. We get A = B.

Explanation 2:

 A = "Anshuman" and B = "Antihuman"
 After applying operations: Replace s with t and insert i before h. We get A = B.

 */
public class Edit_Distance {
}
/*
public class Solution {
    public int minDistance(String A, String B) {
        int i=A.length()-1;
        int j=B.length()-1;

        int[][] dp = new int[A.length()][B.length()];
        for(int[] k:dp){
            Arrays.fill(k,-1);
        }

        return editdistance(A,B,dp,i,j);
    }
    int editdistance(String A,String B,int[][] dp,int i,int j){
        if(i<0 && j<0)return 0;
        if(i<0)return j+1;
        if(j<0)return i+1;

        if(dp[i][j]==-1){
            if(A.charAt(i) == B.charAt(j)){
            dp[i][j]=editdistance(A,B,dp,i-1,j-1);
            }
            else{
                int a1 = 1+(editdistance(A,B,dp,i,j-1));
                int a2 = 1+(editdistance(A,B,dp,i-1,j-1));
                int a3 = 1+(editdistance(A,B,dp,i-1,j));
                dp[i][j] = min(a1,a2,a3);
            }
        }

        return dp[i][j];
    }
    int min(int a,int b,int c){
        if(a<b && a<c)return a;
        else if(b<c)return b;
        else return c;
    }
}

 */