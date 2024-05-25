package main.Advance.Backtracking;
/*
Problem Description

Given a grid A, a rat is at position (1, 1). He wants to go to the position (n, n) where n is size of the square matrix A.

1 represents a traversable cell and 0 represents a non-traversable cell. Rat can only move right or down.

Return a path that the rat can take.



Problem Constraints

1 <= |A| <= 4



Input Format

First and only argument is the vector of vectors A.



Output Format

Return a vector of vectors that denotes a path that can be taken.



Example Input

Input 1:

A = [   [1, 0]
        [1, 1]
    ]
Input 2:

A = [    [1, 1, 1]
         [1, 0, 1]
         [0, 0, 1]
    ]


Example Output

Output 1:

[   [1, 0]
    [1, 1]
]
Output 2:

[    [1, 1, 1]
     [0, 0, 1]
     [0, 0, 1]
]


Example Explanation

Explanation 1:

 Path is shown in output.
Explanation 2:

 Path is shown in output.
 */
public class Rat_In_a_Maze {
}
/*
public class Solution {
    public int[][] solve(int[][] A) {
        int[][] ans = new int[A.length][A[0].length];
    int n = A.length;
    int m = A[0].length;

    mazeSolver(A,ans,n,m,0,0);
    return ans;

    }

    boolean mazeSolver(int[][] A,int[][] ans,int n,int m,int x,int y){
        if(x==n-1 && y==m-1){
            ans[x][y] =1;
            return true;
        }
        if(x<0 || x>=n || y<0 || y>=m){
            return false;
        }
        if(A[x][y]==0 || A[x][y]==2 || ans[x][y]==1){
            return false;
        }
        ans[x][y] =1;
        A[x][y] =2;

        if(mazeSolver(A,ans,n,m,x+1,y) || mazeSolver(A,ans,n,m,x,y+1) ){
            return true;
        }
        ans[x][y] =0;
        return false;
    }
}

 */