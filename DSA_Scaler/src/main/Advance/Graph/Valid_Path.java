package main.Advance.Graph;
/*
Problem Description
There is a rectangle with left bottom as (0, 0) and right up as (x, y).

There are N circles such that their centers are inside the rectangle.

Radius of each circle is R. Now we need to find out if it is possible that we can move from (0, 0) to (x, y) without touching any circle.

Note : We can move from any cell to any of its 8 adjecent neighbours and we cannot move outside the boundary of the rectangle at any point of time.



Problem Constraints
0 <= x , y, R <= 100

1 <= N <= 1000

Center of each circle would lie within the grid



Input Format
1st argument given is an Integer x , denoted by A in input.

2nd argument given is an Integer y, denoted by B in input.

3rd argument given is an Integer N, number of circles, denoted by C in input.

4th argument given is an Integer R, radius of each circle, denoted by D in input.

5th argument given is an Array A of size N, denoted by E in input, where A[i] = x cordinate of ith circle

6th argument given is an Array B of size N, denoted by F in input, where B[i] = y cordinate of ith circle



Output Format
Return YES or NO depending on weather it is possible to reach cell (x,y) or not starting from (0,0).



Example Input
Input 1:

 x = 2
 y = 3
 N = 1
 R = 1
 A = [2]
 B = [3]
Input 2:

 x = 3
 y = 3
 N = 1
 R = 1
 A = [0]
 B = [3]


Example Output
Output 1:

 NO
Output 2:

 YES
 */

public class Valid_Path {
}

/*
public class Solution {
    int x[]=new int[]{1,1,1,0,0,-1,-1,-1};
    int y[]=new int[]{1,-1,0,1,-1,1,-1,0};
    boolean visited[][];
    public String solve(int A, int B, int C, int D, ArrayList<Integer> E, ArrayList<Integer> F) {
        visited=new boolean[B+1][A+1];
        return DFS(0,0,A,B,E,F,D)?"YES":"NO";
    }


    private boolean DFS(int row,int col,int A,int B,ArrayList<Integer> E, ArrayList<Integer> F,int D){
        if(!checkValidity(row,col,A,B,E,F,D)) return false;
        if(row==B&&col==A) return true;
        visited[row][col]=true;
        boolean ans=false;
        for(int i=0;i<8;i++){
            int r=y[i],c=x[i];
            ans|=DFS(row+r,col+c,A,B,E,F,D);
        }
        return ans;
    }


    private boolean checkValidity(int row,int col,int A,int B,ArrayList<Integer> E, ArrayList<Integer> F,int D){
         if(row<0||col<0||row>B||col>A||visited[row][col]) return false;
         for(int i=0;i<E.size();i++){
             double dis=Math.pow(row-F.get(i),2)+Math.pow(col-E.get(i),2);
             dis=Math.sqrt(dis);
             if(dis<=D) return false;
         }
         return true;
    }
}
 */
