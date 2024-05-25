package main.Advance.Dynamic_Programming;
/*
Problem Description

Given sum A, number of ways you can get that sum with dice roll[1-6].

As the number of ways can be large return its modulo by 1e9 + 7.



Problem Constraints

1 <= A <= 10 2


Input Format

The first argument is the integer A.


Output Format

Return an integer .


Example Input

Input 1:
A = 3
Input 2:

A = 4


Example Output

Output 1:
4
Output 2:

8
 */
public class Dice_throw {
}
/*
public class Solution {
    public static final int mod = (int)Math.pow(10,9) + 7;
    public int diceThrow(int n,int [] dp){
        //n represents the state at it’s value will >= 0 so we can use an array for dp
        //diceThrow(N) represents no. of ways we can get sum n with dice throw
        //Base Case
        /**
         * Here base case is one because
         * let’s take an example
         * n = 1 ways will be (1)
         * n = 2 (1,1)(2) ways will be 2
         * n = 3 (1,1,1)(2,1)(1,2) (3) so if we check older dependency from n-1 to n-6 (in this case n-2) we
         * will see that we will miss out a dice roll with just 3 so we need to take 1 for the base case and go till n-3
         * for n = 3
         * Also, we can use base case as if(n == 0) ret 0; in that case we have to add 1 in case n<=6 to don’t miss
         * out that single move
         *
        if(n == 0){
                return 1;
                }
                if(dp[n] != -1){
                return dp[n];
                }
                int noThrows = 0;
                for(int i = 1 ; i <= 6 && n-i >= 0 ; ++i){
                noThrows = (noThrows + diceThrow(n-i,dp))%mod;
                }
                dp[n] = noThrows;
                return noThrows;
                }
public int diceRollIterative(int n){
        //We know that the dependency will be on last 6 moves only so we can take an array of size 7
        int [] dp = new int[7];
        dp[0] = 1;
        for(int i = 1 ; i <= n ; ++i){
        int noThrows = 0;
        for(int j = 1 ; j <= 6 && i-j >= 0 ; ++j){
        noThrows = (noThrows + dp[(i-j+7)%7]) % mod;
        }
        dp[i%7] = noThrows;
        }
        return dp[n%7];
        }

public int solve(int n){
        return diceRollIterative(n);
        }
        }
 */