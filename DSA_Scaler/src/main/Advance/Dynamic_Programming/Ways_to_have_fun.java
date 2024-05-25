package main.Advance.Dynamic_Programming;
/*
Problem Description

Find the number of ways you can have fun in A days, given you can sleep every day, Pizza can be eaten every alternate day and you can watch Tv shows every two days.

Since the answer could be large, return answer % 109 + 7.



Problem Constraints

1 <= A <= 105



Input Format

First and only argument is an integer A denoting the number of days.



Output Format

Return an integer denoting the number of ways you can have fun in A days.



Example Input

Input 1:

 A = 2
Input 2:

 A = 3


Example Output

Output 1:

 7
Output 2:

 15

 */
public class Ways_to_have_fun {
}
/*
public class Solution {
    int m = 1000000007;
    public int solve(int A) {
        long dp[][] = new long[A+1][3];

        long x = solveDp(A,0, dp)+solveDp(A,1, dp)+solveDp(A,2, dp);

        return (int)((x+m)%m);
    }
    private long solveDp(int A,int i, long dp[][]){
        if(A==1)
        {
            dp[A][0]=1;
            dp[A][1]=1;
            dp[A][2]=1;
            return 1;
        }
        if(A==2)
        {
            if(i==0)
                dp[A][0]=3;
            if(i==1)
                dp[A][1]=2;
            if(i==2)
                dp[A][2]=2;
            return dp[A][i];

        }
        if(dp[A][i] !=0)
            return dp[A][i];


        dp[A][0]= (solveDp(A-1,0,dp)%m+solveDp(A-1,1,dp)%m+solveDp(A-1,2,dp)%m)%m;//s
        dp[A][1]= (solveDp(A-1,0,dp)%m+solveDp(A-1,2,dp)%m)%m;                  //p
        dp[A][2]= (solveDp(A-1,0,dp)%m+solveDp(A-1,1,dp)%m-2*solveDp(A-2,2,dp)%m)%m; //T
        return (dp[A][i]+m)%m;
    }
}
 */