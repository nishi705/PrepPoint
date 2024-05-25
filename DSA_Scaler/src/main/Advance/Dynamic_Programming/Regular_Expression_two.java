package main.Advance.Dynamic_Programming;
/*
Problem Description
Implement wildcard pattern matching with support for ' ? ' and ' * ' for strings A and B.

' . ' : Matches any single character.
' * ' : Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).



Problem Constraints
1 <= length(A), length(B) <= 104



Input Format
The first argument of input contains a string A.
The second argument of input contains a string B denoting the pattern.



Output Format
Return 1 if the patterns match else return 0.



Example Input
Input 1:

 A = "aab"
 B = "c*a*b"
Input 2:

 A = "acz"
 B = "a.a"


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 'c' can be repeated 0 times, 'a' can be repeated 1 time. Therefore, it matches "aab".
 So, return 1.
Explanation 2:

 '.' matches any single character. First two character in string A will be match.
 But the last character i.e 'z' != 'a'. Return 0.
 */
public class Regular_Expression_two {
}
/*
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    // TC:O(N*M), SC:O(N*M)
    public int isMatch(final String A, final String B) {
        int N = A.length();
        int M = B.length();

        if (N == 0 && M == 0) {
            return 1;
        }

        else if (N > 0  && M == 0) {
            return 0;
        }

        else if (N == 0 && M > 0) {
            return 0;
        }

        boolean[][] dp = new boolean[N+1][M+1];
        dp[0][0] = true;

        for (int j = 1; j <= M; j++) {
            if (B.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                char charA = A.charAt(i-1);
                char charB = B.charAt(j-1);

                if (charA == charB || charB == '.') {
                    dp[i][j] = dp[i-1][j-1];
                }

                else if (charB == '*') {
                    dp[i][j] = dp[i][j-2] || (dp[i-1][j] && (A.charAt(i-1) == B.charAt(j - 2) ||
                                                                                B.charAt(j - 2) == '.'));
                }
            }
        }
        return dp[N][M] ? 1:0;
    }
}
 */