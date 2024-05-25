package main.Advance.Graph;
/*
Problem Description

Given a directed graph with A nodes and M edges.
Find the minimum number of edges that needs to be reversed in order to reach node A from node 1.



Problem Constraints

1 <= A, M <= 10 5
1 <= B[i][0], B[i][1] <= A
There can be multiple edges or self loops (B[i][0] = B[i][1])


Input Format

The first argument is an integer A, denoting the number of nodes in the graph.
The second argument is a 2D integer array B, denoting the directed edges in the graph.


Output Format

Return a single integer denoting the minimum number of edges to be reversed.


Example Input

Input 1:
A = 5
B = [[1, 2],
     [2, 3],
     [4, 3],
     [4, 5]]
Input 2:

A = 5
B = [[1, 2],
     [2, 3],
     [3, 4],
     [4, 5]]


Example Output

Output 1:
1
Output 2:

0


Example Explanation

Explanation 1:

Reversing the edge (4, 3) is only required.

Explanation 2:

There already exists a path between 1 and A, so no edges need to be reversed.
 */

public class Reversing_Edges {
}

/*
public class Solution {
class NodeInfo{
int x, reverseEdgeCount;
public NodeInfo(int x, int reverseEdgeCount){
this.x = x;
this.reverseEdgeCount = reverseEdgeCount;
}
}
public int reverseEdges(int A, int[][] B) {
Map<Integer, Set<Integer>> graph = new HashMap<>();
Map<Integer, Set<Integer>> reverseEdgeGraph = new HashMap<>();
for(int i = 1; i <= A; i++){
graph.put(i, new HashSet<>());
reverseEdgeGraph.put(i, new HashSet<>());
}
for(int i = 0; i < B.length; i++){
graph.get(B[i][0]).add(B[i][1]);
reverseEdgeGraph.get(B[i][1]).add(B[i][0]);
}
PriorityQueue<NodeInfo> q = new PriorityQueue<>((n1, n2) -> Integer.compare(n1.reverseEdgeCount, n2.reverseEdgeCount));
q.add(new NodeInfo(1, 0));
int minReverseEdgeCount = Integer.MAX_VALUE;
Set<Integer> visited = new HashSet<>();
while(!q.isEmpty()){
NodeInfo node = q.remove();
if(node.x == A){
minReverseEdgeCount = Math.min(minReverseEdgeCount, node.reverseEdgeCount);
}
visited.add(node.x);
Set<Integer> adjVertices = graph.get(node.x);
for(Integer adjVertex : adjVertices){
if(visited.contains(adjVertex)){
continue;
}
q.add(new NodeInfo(adjVertex, node.reverseEdgeCount));
}
Set<Integer> reverseEdgeAdjVertices = reverseEdgeGraph.get(node.x);
for(Integer adjVertex : reverseEdgeAdjVertices){
if(visited.contains(adjVertex)){
continue;
}
q.add(new NodeInfo(adjVertex, node.reverseEdgeCount + 1));
}
}
return minReverseEdgeCount == Integer.MAX_VALUE ? -1 : minReverseEdgeCount;

}
}

 */
