package main.Advance.Backtracking;
/*
Problem Description
Write a program to solve a Sudoku puzzle by filling the empty cells. Empty cells are indicated by the character '.' You may assume that there will be only one unique solution.



A sudoku puzzle,



and its solution numbers marked in red.



Problem Constraints
N = 9


Input Format
First argument is an array of array of characters representing the Sudoku puzzle.


Output Format
Modify the given input to the required answer.


Example Input
Input 1:

A = [[53..7....], [6..195...], [.98....6.], [8...6...3], [4..8.3..1], [7...2...6], [.6....28.], [...419..5], [....8..79]]


Example Output
Output 1:

[[534678912], [672195348], [198342567], [859761423], [426853791], [713924856], [961537284], [287419635], [345286179]]


Example Explanation
Explanation 1:

Look at the diagrams given in the question.



Expected Output
Enter your input as per the following guideline:
There are 1 lines in the input

Line 1 ( Corresponds to arg 1 ) : 2-D array. First 2 integers R, C are the number of rows and columns. Then R * C characters follow corresponding to the rowwise characters in the 2D array
 */
public class Sudoku {
}
/*
import java.util.*;

public class Solution {
    public void solveSudoku(char[][] A) {
          solve(A);
    }
    boolean solve(char[][] A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                if(A[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isValid(A,i,j,c)){
                            A[i][j] = c;
                            if(solve(A)){
                                return true;
                            }else{
                                A[i][j] = '.';
                            }

                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    boolean isValid(char[][] A,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(A[i][col] !='.' && A[i][col]==c)return false;
            if(A[row][i]!='.' && A[row][i]==c)return false;
            if(A[3*(row/3)+i/3][3*(col/3)+i%3]!='.' && A[3*(row/3)+i/3][3*(col/3)+i%3]==c)return false;
        }
        return true;
    }

}



 */