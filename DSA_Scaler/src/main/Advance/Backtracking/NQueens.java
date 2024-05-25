package main.Advance.Backtracking;
/*
Problem Description
The N-queens puzzle is the problem of placing N queens on an N×N chessboard such that no two queens attack each other.



Given an integer A denoting the value of N, return all distinct solutions to the N-queens puzzle.

Each solution contains a distinct board configuration of the N-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
The final list should be generated in such a way that the indices of the queens in each list should be in reverse lexicographical order.



Problem Constraints
1 <= A <= 10



Input Format
First argument is an integer A denoting the size of chessboard



Output Format
Return an array consisting of all distinct solutions in which each element is a 2d char array representing a unique solution.



Example Input
Input 1:

A = 4
Input 2:

A = 1


Example Output
Output 1:

[
 [".Q..",  // Solution 1
  "...Q",
  "Q...",
  "..Q."],

 ["..Q.",  // Solution 2
  "Q...",
  "...Q",
  ".Q.."]
]
Output 1:

[
 [Q]
]


Example Explanation
Explanation 1:

There exist only two distinct solutions to the 4-queens puzzle:
Explanation 1:

There exist only one distinct solutions to the 1-queens puzzle:
 */
public class NQueens {
}
/*
public class Solution {

    ArrayList<ArrayList<String>> ans = new ArrayList<>();
    public ArrayList<ArrayList<String>> solveNQueens(int A) {

      int[][] mat = new int[A][A];
      int row=0;
      checkandprintthenqueen(mat,row);
      return ans;

    }
    void checkandprintthenqueen(int[][] mat,int row){
        if(row==mat.length){
            addinlist(mat);
            return;
        }

        for(int j=0;j<mat.length;j++){
            if(isValid(mat,j,row)){
                mat[row][j] =1;
                checkandprintthenqueen(mat,row+1);
                mat[row][j] =0;
            }
        }
    }
    boolean isValid(int[][] mat,int col,int row){
        //check col
        int r=0;
        int c=0;
        for(r=0;r<row;r++){
            if(mat[r][col]==1)return false;
        }
        //check row
        for(c=0;c<col;c++){
            if(mat[row][c]==1)return false;
        }
        //right diagonal
        r=row-1;
        c=col+1;
        while(r>=0 && c<mat.length){
            if(mat[r][c]==1){
                return false;

            }
            r--;
            c++;
        }
        r=row-1;
        c=col-1;
        while(r>=0 && c>=0){
            if(mat[r][c]==1){
               return false;
            }
            r--;
                c--;
        }

        return true;


    }
    void addinlist(int[][] A){
        ArrayList<String> al = new ArrayList<>();

        for(int i=0;i<A.length;i++){
            StringBuilder sb = new StringBuilder();

            for(int j=0;j<A.length;j++){
                int val = A[i][j];
                if(val==0){
                    sb.append(".");
                }else if (val ==1){
                    sb.append("Q");
                }
            }
            al.add(sb.toString());
        }
        ans.add(al);
    }
}

 */