package main.Advance.Graph;
/*
Problem Description
A country consist of N cities connected by N - 1 roads. King of that country want to construct maximum number of roads such that the new country formed remains bipartite country.

Bipartite country is a country, whose cities can be partitioned into 2 sets in such a way, that for each road (u, v) that belongs to the country, u and v belong to different sets. Also, there should be no multiple roads between two cities and no self loops.

Return the maximum number of roads king can construct. Since the answer could be large return answer % 109 + 7.

NOTE: All cities can be visited from any city.



Problem Constraints
1 <= A <= 105

1 <= B[i][0], B[i][1] <= N



Input Format
First argument is an integer A denoting the number of cities, N.

Second argument is a 2D array B of size (N-1) x 2 denoting the initial roads i.e. there is a road between cities B[i][0] and B[1][1] .



Output Format
Return an integer denoting the maximum number of roads king can construct.



Example Input
Input 1:

 A = 3
 B = [
       [1, 2]
       [1, 3]
     ]
Input 2:

 A = 5
 B = [
       [1, 3]
       [1, 4]
       [3, 2]
       [3, 5]
     ]


Example Output
Output 1:

 0
Output 2:

 2


Example Explanation
Explanation 1:

 We can't construct any new roads such that the country remains bipartite.
Explanation 2:

 We can add two roads between cities (4, 2) and (4, 5).
 */
public class Construct_Roads {
}

/*
public class Solution {
public int mod = 1000*1000*1000+7;
public int solve(int A, ArrayList<ArrayList<Integer>> B) {
ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
boolean[] vis = new boolean[A+1];
int[] color = new int[A+1];

for(int i =0 ; i<=A; i++)
adj.add(new ArrayList<>());
for(ArrayList<Integer> list : B){
adj.get(list.get(0)).add(list.get(1));
adj.get(list.get(1)).add(list.get(0));
}

Queue<Integer> q = new LinkedList<>();
for(int i = 1; i <=A; i++){
if(!vis[i]) q.offer(i);
while(!q.isEmpty()){
int u = q.poll();
vis[u] = true;
for(Integer v : adj.get(u)){
if(!vis[v]){
q.add(v);
if(color[u] == 0)
color[u] = 1;
if(color[u] == 1)
color[v] = 2;
else color[v] = 1;
}else if(color[v] == color[u])
return 0;
}
}
}

long setA = 1-A, setB = 1-A;
for(int i = 0 ; i <=A ; i++){
if(color[i] == 1)
setA++;
else if(color[i] == 2)
setB++;
}

return (int)((setA%mod) * (setB%mod)%mod);
}
}

 */
