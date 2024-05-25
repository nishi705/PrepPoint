package main.Advance.Graph;
/*
Problem Description
Given a matrix of integers A of size N x M consisting of 0 or 1.

For each cell of the matrix find the distance of nearest 1 in the matrix.

Distance between two cells (x1, y1) and (x2, y2) is defined as |x1 - x2| + |y1 - y2|.

Find and return a matrix B of size N x M which defines for each cell in A distance of nearest 1 in the matrix A.

NOTE: There is atleast one 1 is present in the matrix.



Problem Constraints
1 <= N, M <= 1000

0 <= A[i][j] <= 1



Input Format
The first argument given is the integer matrix A.



Output Format
Return the matrix B.



Example Input
Input 1:

 A = [
       [0, 0, 0, 1]
       [0, 0, 1, 1]
       [0, 1, 1, 0]
     ]
Input 2:

 A = [
       [1, 0, 0]
       [0, 0, 0]
       [0, 0, 0]
     ]


Example Output
Output 1:

 [
   [3, 2, 1, 0]
   [2, 1, 0, 0]
   [1, 0, 0, 1]
 ]
Output 2:

 [
   [0, 1, 2]
   [1, 2, 3]
   [2, 3, 4]
 ]


Example Explanation
Explanation 1:

 A[0][0], A[0][1], A[0][2] will be nearest to A[0][3].
 A[1][0], A[1][1] will be nearest to A[1][2].
 A[2][0] will be nearest to A[2][1] and A[2][3] will be nearest to A[2][2].
Explanation 2:

 There is only a single 1. Fill the distance from that 1.
 */

public class Distance_of_nearest_cell {
}

/*
public class Solution {
    public int[][] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean visited[][] = new boolean[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(A[i][j] == 1){
                    q.add(new int[]{i, j, 0});
                    A[i][j] = 0;
                    visited[i][j] = true;
                }
            }
        }

        int row[] = {-1, 0, 1, 0};
        int col[] = {0, -1, 0, 1};
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int r = temp[0];
            int c = temp[1];
            int count = temp[2];
            visited[r][c] = true;

            for(int i = 0; i < 4; i++){
                int nRow = row[i] + r;
                int nCol = col[i] + c;
                if(nRow >= 0 && nCol >= 0 && nRow < n && nCol < m && A[nRow][nCol] == 0 && !visited[nRow][nCol]){
                    A[nRow][nCol] = count + 1;
                    q.add(new int[]{nRow, nCol, count + 1});
                    visited[nRow][nCol] = true;
                }
            }

        }
        return A;
    }
}
 */
