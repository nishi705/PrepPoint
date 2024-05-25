package main.Advance.Graph;
/*
Problem Description
Given a matrix of integers A of size N x M consisting of 0, 1 or 2.

Each cell can have three values:

The value 0 representing an empty cell.

The value 1 representing a fresh orange.

The value 2 representing a rotten orange.

Every minute, any fresh orange that is adjacent (Left, Right, Top, or Bottom) to a rotten orange becomes rotten. Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1 instead.

Note: Your solution will run on multiple test cases. If you are using global variables, make sure to clear them.



Problem Constraints
1 <= N, M <= 1000

0 <= A[i][j] <= 2



Input Format
The first argument given is the integer matrix A.



Output Format
Return the minimum number of minutes that must elapse until no cell has a fresh orange.

If this is impossible, return -1 instead.



Example Input
Input 1:

A = [   [2, 1, 1]
        [1, 1, 0]
        [0, 1, 1]   ]
Input 2:


A = [   [2, 1, 1]
        [0, 1, 1]
        [1, 0, 1]   ]


Example Output
Output 1:

 4
Output 2:

 -1


Example Explanation
Explanation 1:

Minute 0: [ [2, 1, 1]
            [1, 1, 0]
            [0, 1, 1] ]
Minute 1: [ [2, 2, 1]
            [2, 1, 0]
            [0, 1, 1] ]
Minute 2: [ [2, 2, 2]
            [2, 2, 0]
            [0, 1, 1] ]
Minute 3: [ [2, 2, 2]
            [2, 2, 0]
            [0, 2, 1] ]
Minute 4: [ [2, 2, 2]
            [2, 2, 0]
            [0, 2, 2] ]
At Minute 4, all the oranges are rotten.
Explanation 2:

The fresh orange at 2nd row and 0th column cannot be rotten, So return -1.
 */

public class Rotten_Oranges {
}
/*
public class Solution {
    public class Pair {
        int i;
        int j;
        int time;
        public Pair(int i,int j, int time){
            this.i=i;
            this.j=j;
            this.time=time;
        }
    }
    public int solve(int[][] A) {
        int n=A.length;
        int m=A[0].length;
        Queue<Pair> queue=new LinkedList();
        int fresh=0;
        int maxTime=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(A[i][j]==2){
                    queue.offer(new Pair(i,j,0));
                } else if(A[i][j]==1){
                    fresh++;
                }
            }
        }
        while(!queue.isEmpty()){
            Pair p=queue.poll();
            int i=p.i;
            int j=p.j;
            maxTime=Math.max(maxTime,p.time);
            if(i-1>=0 && A[i-1][j]==1){
                A[i-1][j]=2;
                queue.offer(new Pair(i-1,j,p.time+1));
                fresh--;
            }
            if(j-1>=0 && A[i][j-1]==1){
                A[i][j-1]=2;
                queue.offer(new Pair(i,j-1,p.time+1));
                fresh--;
            }
            if(i+1<A.length && A[i+1][j]==1){
                A[i+1][j]=2;
                queue.offer(new Pair(i+1,j,p.time+1));
                fresh--;
            }
            if(j+1<A[0].length && A[i][j+1]==1){
                A[i][j+1]=2;
                queue.offer(new Pair(i,j+1,p.time+1));
                fresh--;
            }

        }
        if(fresh>=1)
        return -1;
        else
        return maxTime;

    }
}
 */
