package main.Advance.Graph;

/*
Problem Description
There are A islands and there are M bridges connecting them. Each bridge has some cost attached to it.

We need to find bridges with minimal cost such that all islands are connected.

It is guaranteed that input data will contain at least one possible scenario in which all islands are connected with each other.



Problem Constraints
1 <= A, M <= 6*104

1 <= B[i][0], B[i][1] <= A

1 <= B[i][2] <= 103



Input Format
The first argument contains an integer, A, representing the number of islands.

The second argument contains an 2-d integer matrix, B, of size M x 3 where Island B[i][0] and B[i][1] are connected using a bridge of cost B[i][2].



Output Format
Return an integer representing the minimal cost required.



Example Input
Input 1:

 A = 4
 B = [  [1, 2, 1]
        [2, 3, 4]
        [1, 4, 3]
        [4, 3, 2]
        [1, 3, 10]  ]
Input 2:

 A = 4
 B = [  [1, 2, 1]
        [2, 3, 2]
        [3, 4, 4]
        [1, 4, 3]   ]


Example Output
Output 1:

 6
Output 2:

 6


Example Explanation
Explanation 1:

 We can choose bridges (1, 2, 1), (1, 4, 3) and (4, 3, 2), where the total cost incurred will be (1 + 3 + 2) = 6.
Explanation 2:

 We can choose bridges (1, 2, 1), (2, 3, 2) and (1, 4, 3), where the total cost incurred will be (1 + 2 + 3) = 6.
 */

public class Commutable_Islands {
}

/*
public class Solution {
public class Pair {
int weight;
int node;
public Pair(int weight,int node){
this.weight=weight;
this.node=node;
}
}
public int solve(int A, int[][] B) {
ArrayList<ArrayList<Pair>> adj=new ArrayList<ArrayList<Pair>>();
boolean vis[]=new boolean[A+1];
for(int i=0;i<=A;i++)
{
adj.add(new ArrayList<Pair>());
}
buildAdjacency(adj,B);
PriorityQueue<Pair> pq= new PriorityQueue(100,new Comparator<Pair>() {
public int compare(Pair p1,Pair p2){
if(p1.weight<p2.weight) {
return -1;
} else if(p1.weight>p2.weight) {
return 1;
} else {
return 0;
}
}
});
//put neighbors of any node to pq here we are adding for first node (nodes are 1 based indexed)
for(int i=0;i<adj.get(1).size();i++){
pq.offer(adj.get(1).get(i));
}
vis[1]=true;//see
int minCost=0;
while(!pq.isEmpty()){
Pair p=pq.poll();
if(vis[p.node]){
continue;
}
minCost+=p.weight;
vis[p.node]=true;
//traversing neighbors
for(int i=0;i<adj.get(p.node).size();i++){
Pair nbr=adj.get(p.node).get(i);
if(!vis[nbr.node]){
pq.offer(nbr);
}
}

}
return minCost;

}
public void buildAdjacency(ArrayList<ArrayList<Pair>>adj,int[][] B)
{
for(int i=0;i<B.length;i++)
{
adj.get(B[i][0]).add(new Pair(B[i][2],B[i][1]));
adj.get(B[i][1]).add(new Pair(B[i][2],B[i][0]));
}
}
}
 */
