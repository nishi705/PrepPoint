package main.Advance.Graph;
/*
Problem Description

Given an undirected graph having A nodes labelled from 1 to A with M edges given in a form of matrix B of size M x 2 where (B[i][0], B[i][1]) represents two nodes B[i][0] and B[i][1] connected by an edge.

Find whether the graph contains a cycle or not, return 1 if cycle is present else return 0.

NOTE:

The cycle must contain atleast three nodes.
There are no self-loops in the graph.
There are no multiple edges between two nodes.
The graph may or may not be connected.
Nodes are numbered from 1 to A.
Your solution will run on multiple test cases. If you are using global variables make sure to clear them.


Problem Constraints

1 <= A, M <= 3*105

1 <= B[i][0], B[i][1] <= A



Input Format

The first argument given is an integer A representing the number of nodes in the graph.

The second argument given is an matrix B of size M x 2 which represents the M edges such that there is a edge between node B[i][0] and node B[i][1].



Output Format

Return 1 if cycle is present else return 0.



Example Input

Input 1:

 A = 5
 B = [  [1. 2]
        [1, 3]
        [2, 3]
        [1, 4]
        [4, 5]
     ]
Input 2:

 A = 3
 B = [  [1. 2]
        [1, 3]
     ]


Example Output

Output 1:

 1
Output 2:

 0


Example Explanation

Explanation 1:

 There is a cycle in the graph i.e 1 -> 2 -> 3 -> 1 so we will return 1
Explanation 2:

 No cycle present in the graph so we will return 0.
 */

public class Cycle_in_Undirected_Graph {
}

/*
public class Solution {
    // BFS
    public int solve(int A, int[][] B) {
        // Create an adjacency list from the given nodes and edges.
        ArrayList<Integer>[] graph = new ArrayList[A + 1];
        for (int i = 1; i <= A; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < B.length; i++) {
            int source = B[i][0];
            int destination = B[i][1];
            graph[source].add(destination);
            graph[destination].add(source); // Since it's an undirected graph
        }
        // Perform BFS traversal on each unvisited node
        for (int i = 1; i <= A; i++) {
            if (hasCycle(graph, i)) {
                return 1; // Cycle found
            }
        }
        return 0; // No cycle found
    }
    private boolean hasCycle(ArrayList<Integer>[] graph, int source) {
        int[] parent = new int[graph.length];
        Arrays.fill(parent, -1);
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();
        visited[source] = true;
        queue.offer(source);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int i = 0; i < graph[current].size(); i++) {
                int neighbor = graph[current].get(i);
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    parent[neighbor] = current;
                } else if (neighbor != parent[current]) {
                    return true; // Back edge found, cycle exists
                }
            }
        }
        return false; // No cycle found
    }
    // DFS
    public int solve(int A, int[][] B) {
        // Create an adjacency list from the given nodes and edges.
        ArrayList<Integer>[] graph = new ArrayList[A + 1];
        for (int i = 1; i <= A; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < B.length; i++) {
            int source = B[i][0];
            int destination = B[i][1];
            graph[source].add(destination);
            graph[destination].add(source); // Since it's an undirected graph
        }
        // Array to keep track of visited nodes during DFS traversal
        boolean[] visited = new boolean[A + 1];
        // Perform DFS traversal on each unvisited node
        for (int i = 1; i <= A; i++) {
            if (visited[i] == false && hasCycle(graph, visited, i, -1)) {
                return 1; // Cycle found
            }
        }
        return 0; // No cycle found
    }
    private boolean hasCycle(ArrayList<Integer>[] graph, boolean[] visited, int current, int parent) {
        visited[current] = true;
        // Traverse adjacent nodes
        for (int neighbor : graph[current]) {
            if (!visited[neighbor]) {
                if (hasCycle(graph, visited, neighbor, current)) {
                    return true; // Cycle found
                }
            } else if (neighbor != parent) {
                return true; // Back edge found
            }
        }
        return false; // No cycle found
    }
}
 */
