package main.Advance.Dynamic_Programming;
/*
Problem Description
Given a matrix of integers A of size N x 2 describing dimensions of N envelopes, where A[i][0] denotes the height of the ith envelope and A[i][1] denotes the width of the ith envelope.

One envelope can fit into another if and only if both the width and height of one envelope is greater than the width and height of the other envelope.

Find the maximum number of envelopes you can put one inside other.



Problem Constraints
1 <= N <= 1000
1 <= A[i][0], A[i][1] <= 109



Input Format
The only argument given is the integer matrix A.



Output Format
Return an integer denoting the maximum number of envelopes you can put one inside other.



Example Input
Input 1:

 A = [
         [5, 4]
         [6, 4]
         [6, 7]
         [2, 3]
     ]
Input 2:

 A = [     '
         [8, 9]
         [8, 18]
     ]


Example Output
Output 1:

 3
Output 2:

 1


Example Explanation
Explanation 1:

 Step 1: put [2, 3] inside [5, 4]
 Step 2: put [5, 4] inside [6, 7]
 3 envelopes can be put one inside other.
Explanation 2:

 No envelopes can be put inside any other so answer is 1.
 */
public class Russian_Doll_Envelopes {
}
/*
public class Solution {
    int dp[];
    static class Pair{
        int height;
        int width;
        Pair(int height, int width){
            this.height=height;
            this.width=width;
        }
    }
    public int solve(int[][] A) {
        List<Pair> list = new ArrayList();
        for(int i=0;i<A.length;i++){
            int h = A[i][0];
            int w = A[i][1];
            Pair p = new Pair(h,w);
            list.add(p);
        }

        Collections.sort(list,(p1,p2)->p1.height-p2.height);

        dp = new int[A.length];
        Arrays.fill(dp,1);
        for(int i=1;i<A.length;i++){
            for(int j=0;j<i;j++){
                if(list.get(i).height>list.get(j).height && list.get(i).width>list.get(j).width){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        Arrays.sort(dp);
        return dp[A.length-1];

    }
}
 */