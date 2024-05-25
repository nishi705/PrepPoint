package main.Advance.Graph;
/*
Problem Description
Given an directed graph having A nodes. A matrix B of size M x 2 is given which represents the M edges such that there is a edge directed from node B[i][0] to node B[i][1].

Find whether the graph contains a cycle or not, return 1 if cycle is present else return 0.

NOTE:

The cycle must contain atleast two nodes.
There are no self-loops in the graph.
There are no multiple edges between two nodes.
The graph may or may not be connected.
Nodes are numbered from 1 to A.
Your solution will run on multiple test cases. If you are using global variables make sure to clear them.


Problem Constraints
2 <= A <= 105

1 <= M <= min(200000,A*(A-1))

1 <= B[i][0], B[i][1] <= A



Input Format
The first argument given is an integer A representing the number of nodes in the graph.

The second argument given a matrix B of size M x 2 which represents the M edges such that there is a edge directed from node B[i][0] to node B[i][1].



Output Format
Return 1 if cycle is present else return 0.



Example Input
Input 1:

 A = 5
 B = [  [1, 2]
        [4, 1]
        [2, 4]
        [3, 4]
        [5, 2]
        [1, 3] ]
Input 2:

 A = 5
 B = [  [1, 2]
        [2, 3]
        [3, 4]
        [4, 5] ]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 The given graph contain cycle 1 -> 3 -> 4 -> 1 or the cycle 1 -> 2 -> 4 -> 1
Explanation 2:

 The given graph doesn't contain any cycle.
 */

public class Cycle_in_Directed_Graph {
}

/*
public class Solution {
    public int solve(int A, int[][] B) {

        List<Integer>[] adjacencyList = createAdjacencyList(A, B);
        boolean[] visitedArray = new boolean[A+1];
        boolean[] stackArray = new boolean[A+1];
        int cycleFlag = 0;
        // stackArray[B[0][0]] = true;
        // int cycleFlag = hasCycle(B[0][0], adjacencyList, visitedArray, stackArray);
        // stackArray[B[0][0]] = false;

        //if(cycleFlag == 0){
            // This for loop is to handle scenario where some nodes are disconnected due to no edges and still nodes in upcoming list might have loop
            for(int i=0; i<B.length; i++){  //[[1,2],[3,2],[4,2],[3,4],[4,5],[5,3]]
                stackArray[B[i][0]] = true;
                cycleFlag = hasCycle(B[i][0], adjacencyList, visitedArray, stackArray);
                if(cycleFlag == 1){
                    break;
                }
                stackArray[B[i][0]] = false; //[[1,2],[1,3],[2,3],[1,4],[4,3],[4,5],[3,5]] - Resetting to false to handle verification for subsequent nodes
            }
        //}

        return cycleFlag;

    }

    public List<Integer>[] createAdjacencyList(int A, int[][] B){

        List<Integer>[] adjacencyList = new List[A+1];

        for(int i=0; i<=A; i++){
            adjacencyList[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<B.length; i++){
            adjacencyList[B[i][0]].add(B[i][1]);
        }

        return adjacencyList;
    }

    public int hasCycle(int start, List<Integer>[] adjacencyList, boolean[] visitedArray, boolean[] stackArray){

        visitedArray[start] = true;
        int n = adjacencyList[start].size();
        for(int i=0; i<n; i++){
            int neighbor = adjacencyList[start].get(i);
            if(stackArray[neighbor]){
                return 1;
            }
            if(!visitedArray[neighbor]){
                stackArray[neighbor] = true;
                if(hasCycle(neighbor, adjacencyList, visitedArray, stackArray) == 1){
                    return 1;
                }
                stackArray[neighbor] = false;
            }
        }
        return 0;
    }
}
 */
