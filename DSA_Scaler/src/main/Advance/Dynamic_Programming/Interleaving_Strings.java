package main.Advance.Dynamic_Programming;
/*
Problem Description
Given A, B, C find whether C is formed by the interleaving of A and B.



Problem Constraints
1 <= length(A), length(B) <= 100

1 <= length(C) <= 200



Input Format
The first argument of input contains a string, A.
The second argument of input contains a string, B.
The third argument of input contains a string, C.



Output Format
Return 1 if string C is formed by interleaving of A and B else 0.



Example Input
Input 1:

 A = "aabcc"
 B = "dbbca"
 C = "aadbbcbcac"
Input 2:

 A = "aabcc"
 B = "dbbca"
 C = "aadbbbaccc"


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 "aa" (from A) + "dbbc" (from B) + "bc" (from A) + "a" (from B) + "c" (from A)
Explanation 2:

 It is not possible to get C by interleaving A and B.
 */
public class Interleaving_Strings {
}
/*
public class Solution {
    byte dp[][][];
    public int isInterleave(String A, String B, String C) {
        int n=A.length();
        int m=B.length();
        int l=C.length();
        if(n==l && l==m)
        {
            return 0;
        }
        dp=new byte[n+1][m+1][l+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                for(int k=0;k<=l;k++)
                {
                      dp[i][j][k]=-1;
                }
            }

        }
         int ans=checkCcanBeMade(A,B,C,n,m,l);
         return ans;
    }
    int checkCcanBeMade(String A,String B,String C, int n,int m,int l)
    {
        if(l==0)
        {
            return 1;
        }
        else if((n==0 && m!=l)||(m==0 && n!=l) )
        {
            return 0;
        }
       else if(n==0 && m==l)
        {
            return dp[n][m][l]=(byte)checkCcanBeMade(A,B,C,n,m-1,l-1);

        }
       else if(m==0 && n==1)
        {
            return dp[n][m][l]=(byte)checkCcanBeMade(A,B,C,n-1,m,l-1);
        }
        else if(dp[n][m][l]!=-1)
        {
            return (int)dp[n][m][l];
        }
        else if ((n>1&& A.charAt(n-1)==C.charAt(l-1)) &&(m>1 &&  B.charAt(m-1)==C.charAt(l-1)))
        {
           return dp[n][m][l]=(byte)Math.max(checkCcanBeMade(A,B,C,n-1,m,l-1),checkCcanBeMade(A,B,C,n,m-1,l-1));
        }
        else if(n>0 && A.charAt(n-1)==C.charAt(l-1))
        {
            return dp[n][m][l]=(byte)checkCcanBeMade(A,B,C,n-1,m,l-1);
        }
        else if(m>0 && B.charAt(m-1)==C.charAt(l-1))
        {
           return dp[n][m][l]=(byte)checkCcanBeMade(A,B,C,n,m-1,l-1);
        }
        else
        {
            return dp[n][m][l]=(byte)0;
        }
    }
}
 */
