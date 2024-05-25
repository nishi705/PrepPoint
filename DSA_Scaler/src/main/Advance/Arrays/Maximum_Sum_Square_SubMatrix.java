package main.Advance.Arrays;
/*
Problem Description
Given a 2D integer matrix A of size N x N, find a B x B submatrix where B<= N and B>= 1, such that the sum of all the elements in the submatrix is maximum.



Problem Constraints
1 <= N <= 103.

1 <= B <= N

-102 <= A[i][j] <= 102.



Input Format
First arguement is an 2D integer matrix A.

Second argument is an integer B.



Output Format
Return a single integer denoting the maximum sum of submatrix of size B x B.



Example Input
Input 1:

 A = [
        [1, 1, 1, 1, 1]
        [2, 2, 2, 2, 2]
        [3, 8, 6, 7, 3]
        [4, 4, 4, 4, 4]
        [5, 5, 5, 5, 5]
     ]
 B = 3
Input 2:

 A = [
        [2, 2]
        [2, 2]
    ]
 B = 2


Example Output
Output 1:

 48
Output 2:

 8


Example Explanation
Explanation 1:

    Maximum sum 3 x 3 matrix is
    8 6 7
    4 4 4
    5 5 5
    Sum = 48
Explanation 2:

 Maximum sum 2 x 2 matrix is
  2 2
  2 2
  Sum = 8

 */
public class Maximum_Sum_Square_SubMatrix {
}
/*
public class Solution {
    public int solve(int[][] A, int B) {

      /*
      with the help of matrix prefix sum we can find




    //create prefix sum
    int[][] res = new int[A.length+1][A[0].length+1];
      for(int i=1;i<res.length;i++){
        for(int j=1;j<res[0].length;j++){
        res[i][j] = A[i-1][j-1] + res[i-1][j] + res[i][j-1] - res[i-1][j-1];
        }
        }

        //with B*B matrix do operation
        int max_sum = Integer.MIN_VALUE;

        for(int i=1;i<res.length;i++){
        int sum = 0;
        for(int j=1;j<res.length;j++){
        if(i-B>=0 && j-B>=0){
        sum = res[i][j]-res[i-B][j]-res[i][j-B]+res[i-B][j-B];
        max_sum = Math.max(sum,max_sum);

        }
        }
        }

        return max_sum;

        }
        }

 */