package main.Advance.Graph;

import java.util.ArrayList;

/*
Given an array of strings A of size N, find if the given strings can be chained to form a circle.

A string X can be put before another string Y in circle if the last character of X is same as first character of Y.

NOTE: All strings consist of lower case characters.
 */
/*
Problem Constraints
1 <= N <= 105

Sum of length of all strings <= 106



Input Format
First and only argument is a string array A of size N.



Output Format
Return an integer 1 if it is possible to chain the strings to form a circle else return 0.



Example Input
Input 1:

 A = ["aab", "bac", "aaa", "cda"]
Input 2:

 A = ["abc", "cbc"]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 We can chain the strings aab -> bac -> cda -> aaa -> aab. So this forms a circle. So, output will be 1.
Explanation 2:

 There is no way to chain the given strings such that they forms a circle.


 */
public class Make_Circle {
    public int solve(String[] A) {
        int m = 26;
        boolean[] mark = new boolean[m];
        int[] in = new int[m];
        int[] out = new int[m];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<m; i++)
        {
            adj.add(new ArrayList<Integer>());
        }

        for(int i=0; i<A.length; i++)
        {
            int f = (int)(A[i].charAt(0) - 'a');
            int l = (int)(A[i].charAt(A[i].length() - 1) - 'a');

            mark[l] = mark[f] = true;

            in[l]++;
            out[f]++;

            adj.get(f).add(l);
        }

        for(int i=0; i<m; i++)
        {
            if(in[i] != out[i])
                return 0;
        }
        return isConnected(adj, mark, A[0].charAt(0)-'a');
    }

    public int isConnected(ArrayList<ArrayList<Integer>> adj, boolean[] mark, int src)
    {
        int[] vis = new int[26];
        dfs(adj, vis, src);

        for(int i=0; i<26; i++)
        {
            if(mark[i] && vis[i] == 0)
                return 0;
        }
        return 1;
    }

    public void dfs(ArrayList<ArrayList<Integer>> adj, int[] vis, int src)
    {
        vis[src] = 1;

        for(int it : adj.get(src))
        {
            if(vis[it] == 0)
                dfs(adj, vis, it);
        }
    }
}
