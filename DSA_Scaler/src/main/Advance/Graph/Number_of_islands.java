package main.Advance.Graph;
/*
Problem Description
Given a matrix of integers A of size N x M consisting of 0 and 1. A group of connected 1's forms an island. From a cell (i, j) such that A[i][j] = 1 you can visit any cell that shares a corner with (i, j) and value in that cell is 1.

More formally, from any cell (i, j) if A[i][j] = 1 you can visit:

(i-1, j) if (i-1, j) is inside the matrix and A[i-1][j] = 1.
(i, j-1) if (i, j-1) is inside the matrix and A[i][j-1] = 1.
(i+1, j) if (i+1, j) is inside the matrix and A[i+1][j] = 1.
(i, j+1) if (i, j+1) is inside the matrix and A[i][j+1] = 1.
(i-1, j-1) if (i-1, j-1) is inside the matrix and A[i-1][j-1] = 1.
(i+1, j+1) if (i+1, j+1) is inside the matrix and A[i+1][j+1] = 1.
(i-1, j+1) if (i-1, j+1) is inside the matrix and A[i-1][j+1] = 1.
(i+1, j-1) if (i+1, j-1) is inside the matrix and A[i+1][j-1] = 1.
Return the number of islands.

NOTE: Rows are numbered from top to bottom and columns are numbered from left to right.



Problem Constraints
1 <= N, M <= 100

0 <= A[i] <= 1



Input Format
The only argument given is the integer matrix A.



Output Format
Return the number of islands.



Example Input
Input 1:

 A = [
       [0, 1, 0]
       [0, 0, 1]
       [1, 0, 0]
     ]
Input 2:

 A = [
       [1, 1, 0, 0, 0]
       [0, 1, 0, 0, 0]
       [1, 0, 0, 1, 1]
       [0, 0, 0, 0, 0]
       [1, 0, 1, 0, 1]
     ]


Example Output
Output 1:

 2
Output 2:

 5


Example Explanation
Explanation 1:

 The 1's at position A[0][1] and A[1][2] forms one island.
 Other is formed by A[2][0].
Explanation 2:

 There 5 island in total.

 */

public class Number_of_islands {
}
/*
public class Solution {
    static class Pair {
        int i;
        int j;
        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(A[i][j] == 1) {
                    A[i][j] = 0;
                    numberOfIslands(A, i, j);
                    count++;
                }
            }
        }

        return count;
    }
    public static void numberOfIslands(int[][] A, int row, int col) {

        int n = A.length;
        int m = A[0].length;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row, col));

        while(q.size() > 0) {
            Pair p = q.poll();
            int i = p.i;
            int j = p.j;

            if(i-1 >= 0 && A[i-1][j] == 1) { // search for i-1, j
                q.add(new Pair(i-1, j));
                A[i-1][j] = 0;
            }
            if(j-1 >= 0 && A[i][j-1] == 1) { // search for i, j-1
                q.add(new Pair(i, j-1));
                A[i][j-1] = 0;
            }
            if(i+1 < n && A[i+1][j] == 1) { // search for i+1, j
                q.add(new Pair(i+1, j));
                A[i+1][j] = 0;
            }
            if(j+1 < m && A[i][j+1] == 1) { // search for i, j+1
                q.add(new Pair(i, j+1));
                A[i][j+1] = 0;
            }
            if(i-1 >= 0 && j-1 >= 0 && A[i-1][j-1] == 1) { // search for i-1, j-1
                q.add(new Pair(i-1, j-1));
                A[i-1][j-1] = 0;
            }
            if(i+1 < n && j+1 < m && A[i+1][j+1] == 1) { // search for i+1, j+1
                q.add(new Pair(i+1, j+1));
                A[i+1][j+1] = 0;
            }
            if(i-1 >= 0 && j+1 < m && A[i-1][j+1] == 1) { // search for i-1, j+1
                q.add(new Pair(i-1, j+1));
                A[i-1][j+1] = 0;
            }
            if(i+1 < n && j-1 >= 0 && A[i+1][j-1] == 1) { // search for i+1, j-1
                q.add(new Pair(i+1, j-1));
                A[i+1][j-1] = 0;
            }
        }
    }
}
 */
