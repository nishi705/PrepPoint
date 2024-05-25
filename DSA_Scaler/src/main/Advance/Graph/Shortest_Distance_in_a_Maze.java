package main.Advance.Graph;
/*
Problem Description
Given a matrix of integers A of size N x M describing a maze. The maze consists of empty locations and walls.

1 represents a wall in a matrix and 0 represents an empty location in a wall.

There is a ball trapped in a maze. The ball can go through empty spaces by rolling up, down, left or right, but it won't stop rolling until hitting a wall (maze boundary is also considered as a wall). When the ball stops, it could choose the next direction.

Given two array of integers of size B and C of size 2 denoting the starting and destination position of the ball.

Find the shortest distance for the ball to stop at the destination. The distance is defined by the number of empty spaces traveled by the ball from the starting position (excluded) to the destination (included). If the ball cannot stop at the destination, return -1.
 */
/*
Problem Constraints
2 <= N, M <= 100

0 <= A[i] <= 1

0 <= B[i][0], C[i][0] < N

0 <= B[i][1], C[i][1] < M



Input Format
The first argument given is the integer matrix A.

The second argument given is an array of integer B.

The third argument if an array of integer C.



Output Format
Return a single integer, the minimum distance required to reach destination



Example Input
Input 1:

A = [ [0, 0],
      [0, 0] ]
B = [0, 0]
C = [0, 1]
Input 2:

A = [ [0, 1],
      [1, 0] ]
B = [0, 0]
C = [1, 1]


Example Output
Output 1:

 1
Output 2:

 -1


Example Explanation
Explanation 1:

 Go directly from start to destination in distance 1.
Explanation 2:

 It is impossible to reach the destination from (0, 0) to (1, 1) as there are walls at (1, 0) and (0, 1)
 */

import java.util.LinkedList;
import java.util.Queue;

public class Shortest_Distance_in_a_Maze {
    class Cell {
        int x;
        int y;
        int dir; //0=reight, 1=down, 2=left, 3=up
        Cell (int x, int y, int dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }
    }

    int ans = -1;
    boolean[][][] visited;

    public int solve(int[][] A, int[] B, int[] C) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 1) A[i][j] = -1;
            }
        }
        visited = new boolean[A.length][A[0].length][4]; //you can visit each cell from all 4 directions.
        Queue<Cell> queue = new LinkedList<>();
        A[B[0]][B[1]] = 1;
        for (int i = 0; i < 4; i++) {
            visited[B[0]][B[1]][i] = true;
            queue.add(new Cell(B[0], B[1], i));
        }

        while (!queue.isEmpty()) {
            Cell cell = queue.poll();
            addCell(cell, queue, A, 1, C);
            if (ans != - 1) return ans;
        }
        return ans;
    }

    private void addCell(Cell cell, Queue<Cell> queue, int[][] A, int count, int[] C) {
        if (count == 3) return; //base case to prevent infinite recursion for corners or when surrounded by multiple walls
        int[] x = new int[]{0, 1, 0, -1};
        int[] y = new int[]{1, 0, -1, 0};

        int a = cell.x + x[cell.dir];
        int b = cell.y + y[cell.dir];
        if (validCell(a, b, A)) {
            if (!visited[a][b][cell.dir]) {
                visited[a][b][cell.dir] = true;
                A[a][b] = A[cell.x][cell.y] + 1;
                queue.add(new Cell(a, b, cell.dir));
            }
        } else if (cell.x == C[0] && cell.y == C[1]) ans = A[cell.x][cell.y] - 1; //found direction for which cell after destination, is a wall, and hence we can stop
        else {
            for (int i = 0; i < 3; i++) { //change direction on reaching a wall
                cell.dir = (cell.dir + 1) % 4;
                addCell(new Cell(cell.x, cell.y, cell.dir), queue, A, count + 1, C);
            }
        }
    }

    private boolean validCell(int x, int y, int[][] A){
        return x >= 0 && x < A.length && y >= 0 && y < A[0].length && A[x][y] != -1;
    }
}
