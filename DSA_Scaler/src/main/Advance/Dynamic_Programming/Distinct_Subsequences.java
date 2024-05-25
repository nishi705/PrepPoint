package main.Advance.Dynamic_Programming;
/*
Problem Description
Given two sequences A and B, count number of unique ways in sequence A, to form a subsequence that is identical to the sequence B.

Subsequence : A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).



Problem Constraints
1 <= length(A), length(B) <= 700



Input Format
The first argument of input contains a string A.
The second argument of input contains a string B.



Output Format
Return an integer representing the answer as described in the problem statement.



Example Input
Input 1:

 A = "abc"
 B = "abc"
Input 2:

 A = "rabbbit"
 B = "rabbit"


Example Output
Output 1:

 1
Output 2:

 3


Example Explanation
Explanation 1:

 Both the strings are equal.
Explanation 2:

 These are the possible removals of characters:
    => A = "ra_bbit"
    => A = "rab_bit"
    => A = "rabb_it"

 Note: "_" marks the removed character.
 */
public class Distinct_Subsequences {
}
///top-down approach
/*
public class Solution {
    int[][] dp;
    public int numDistinct(String A, String B) {
        dp=new int[A.length()+1][B.length()+1];
        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }
        return helper(A,0,0,B);
    }
    private int helper(String A, int posI,int posJ,String B){

        if(posJ>=B.length()) return 1;

        if(posI>=A.length()){
            return 0;
        }

        if(dp[posI][posJ]!=-1) return dp[posI][posJ];

        if(A.charAt(posI)!=B.charAt(posJ)){// ignore if characters are not same
            return helper(A,posI+1,posJ,B);
        }

        int a=helper(A,posI+1,posJ+1,B);// take
        int b=helper(A,posI+1,posJ,B);//not take
        dp[posI][posJ]=a+b;
        return dp[posI][posJ];
    }
}
 */