package main.Advance.Arrays;
/*
Problem Description
Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.



Problem Constraints
1 <= A <= 1000



Input Format
First and only argument is integer A


Output Format
Return a 2-D matrix which consists of the elements added in spiral order.



Example Input
Input 1:

1
Input 2:

2
Input 3:

5


Example Output
Output 1:

[ [1] ]
Output 2:

[ [1, 2],
  [4, 3] ]
Output 2:

[ [1,   2,  3,  4, 5],
  [16, 17, 18, 19, 6],
  [15, 24, 25, 20, 7],
  [14, 23, 22, 21, 8],
  [13, 12, 11, 10, 9] ]


Example Explanation
Explanation 1:

Only 1 is to be arranged.
Explanation 2:

1 --> 2
      |
      |
4<--- 3
Explanation 3:



 */
public class Spiral_Order_Matrix_two {
}
/*
public class Solution {
    public int[][] generateMatrix(int A) {
        int[][] temp = new int[A][A];
        int k = 0;
        int m = A;
        int l = 0;
        int n = A;

        int val=1;
        while(val<=A*A){
            for(int i=l;i<n;++i){
                temp[k][i] = val;
                val++;
            }
            k++;

            for(int i=k;i<m;++i){
                temp[i][n-1] = val;
                val++;
            }
            n--;

            if(k<m){
                for(int i=n-1;i>=l;--i){
                    temp[m-1][i] = val;
                    val++;
                }
                m--;
            }

            if(l<n){
                for(int i=m-1;i>=k;--i){
                    temp[i][l] = val;
                    val++;
                }
                l++;
            }
        }

        return temp;

    }
}

 */