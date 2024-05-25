package main.Advance.Stack;
/*
Given a 2D binary matrix of integers A containing 0's and 1's of size N x M.

Find the largest rectangle containing only 1's and return its area.

Note: Rows are numbered from top to bottom and columns are numbered from left to right.


Input Format

The only argument given is the integer matrix A.
Output Format

Return the area of the largest rectangle containing only 1's.
Constraints

1 <= N, M <= 1000
0 <= A[i] <= 1
For Example

Input 1:
    A = [   [0, 0, 1]
            [0, 1, 1]
            [1, 1, 1]   ]
Output 1:
    4

Input 2:
    A = [   [0, 1, 0, 1]
            [1, 0, 1, 0]    ]
Output 2:
    1
 */
public class Maximum_Rectangle {
}
/*
public class Solution {
public int solve(int[][] A) {
int max_area= Integer.MIN_VALUE;
int[][]dp = calculatePrefixArrayMatrix(A);
for(int i=0;i<dp.length;i++){
    int area = findmaxlength(dp[i]);
    max_area = Math.max(max_area,area);
}
return max_area;
}
 int[][] calculatePrefixArrayMatrix(int[][] A){
       int[][] res = new int[A.length][A[0].length];
          res[0] = A[0];
     for(int i=1;i<A.length;i++){
           for(int j=0;j<A[0].length;j++){
               if(A[i][j]==0){
                   res[i][j] =0;
               }else{
                   res[i][j] = A[i][j] +res[i-1][j];
               }
           }
     }
     return res;
 }

int findmaxlength(int[] A){
    int[] nsl = getNsl(A);
    int[] nsr = getNsr(A);
    int maxArea = Integer.MIN_VALUE;

    for(int i=0;i<A.length;i++){
        maxArea = Math.max(maxArea, A[i] * (nsr[i] - nsl[i] -1));
    }
    return maxArea;
}
int[] getNsl(int[] dp){
     Stack<Integer> stack = new Stack<>();
       int[] nsl = new int[dp.length];
        for(int i=0;i<dp.length;i++){
            while(!stack.isEmpty() && dp[stack.peek()]>=dp[i]){
                stack.pop();
            }if(stack.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }
        return nsl;
}
int[] getNsr(int[] dp){
    Stack<Integer> stack = new Stack<>();
    int[] nsr = new int[dp.length];
        for(int i=dp.length-1;i>=0;i--){
            while(!stack.isEmpty() && dp[stack.peek()]>=dp[i]){
                stack.pop();
            }if(stack.isEmpty()){
                nsr[i] = dp.length;
            }else{
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }
   return nsr;
}

}

 */