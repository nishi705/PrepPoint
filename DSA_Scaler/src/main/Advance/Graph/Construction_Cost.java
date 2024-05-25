package main.Advance.Graph;
/*
Problem Description
Given a graph with A nodes and C weighted edges. Cost of constructing the graph is the sum of weights of all the edges in the graph.

Find the minimum cost of constructing the graph by selecting some given edges such that we can reach every other node from the 1st node.

NOTE: Return the answer modulo 109+7 as the answer can be large.



Problem Constraints
1 <= A <= 100000
0 <= C <= 100000
1 <= B[i][0], B[i][1] <= N
1 <= B[i][2] <= 109



Input Format
First argument is an integer A.
Second argument is a 2-D integer array B of size C*3 denoting edges. B[i][0] and B[i][1] are connected by ith edge with weight B[i][2]



Output Format
Return an integer denoting the minimum construction cost.



Example Input
Input 1:

A = 3
B = [   [1, 2, 14]
        [2, 3, 7]
        [3, 1, 2]   ]
Input 2:

A = 3
B = [   [1, 2, 20]
        [2, 3, 17]  ]


Example Output
Output 1:

9
Output 2:

37


Example Explanation
Explanation 1:

We can take only two edges (2 -> 3 and 3 -> 1) to construct the graph.
we can reach the 1st node from 2nd and 3rd node using only these two edges.
So, the total cost of costruction is 9.
Explanation 2:

We have to take both the given edges so that we can reach the 1st node from 2nd and 3rd node.
 */

public class Construction_Cost {
}

/*
public class Solution {
    public int solve(int A, int[][] B) {
        //return new Kruskal(A, B).find();
        return new Prim(A, B).find();
    }
}

//T.C (ElogE + E) S.C(N+E)
class Kruskal {
    int[][] graph;
    DSU dsu;
    final int mod = 1000000007;

    public Kruskal(int n, int[][] graph) {
        this.graph = graph;

        //Sort the graph based on weights
        Arrays.sort(graph, Comparator.comparingInt(a -> a[2]));

        dsu = new DSU(n);
    }

    public int find() {
        int ans = 0;
        for (int[] ints : graph) {
            int u = ints[0],
                    v = ints[1],
                    w = ints[2];
            if (dsu.union(u, v)) ans = (ans + w)%mod;
        }
        return ans;
    }

    class DSU {
        private final int[] size;
        private final int[] parents;

        public DSU(int N) {
            this.size = new int[N+1];
            Arrays.fill(this.size, 1);

            this.parents = new int[N+1];
            for(int i = 0; i < this.parents.length; i++){
                this.parents[i] = i;
            }
        }

        public int getRoot(int x) {
            if(this.parents[x] == x) return  x;
            return this.parents[x] = getRoot(parents[x]);
        }

        public boolean union(int x, int y) {
            int rx = getRoot(x);
            int ry = getRoot(y);

            if (rx == ry) return false;

            if (this.size[rx] <= this.size[ry]) {
                this.parents[rx] = ry;
                this.size[ry] += this.size[rx];
            } else {
                this.parents[ry] = rx;
                this.size[rx] += this.size[ry];
            }

            return true;
        }
    }
}

//T.C (ElogE) S.C(N+E)
class Prim {
    ArrayList<Pair>[] graph;
    boolean[] visited;

    final int mod = 1000000007;

    public Prim(int n, int[][] graph) {
        this.graph = buildGraph(n, graph);
        this.visited = new boolean[n+1];
    }

    private ArrayList<Pair>[] buildGraph (int n, int[][] graph) {
        ArrayList<Pair>[] g = new ArrayList[n+1];
        for(int i = 0; i < g.length; i++) {
            g[i] = new ArrayList<>();
        }
        for(int[] i : graph){
            int u = i[0], v = i[1], w = i[2];
            g[u].add(new Pair(v, w));
            g[v].add(new Pair(u, w));
        }
        return g;
    }

    public int find() {
        int ans = 0;
        PriorityQueue<Pair> minHeap = new PriorityQueue<>();
        minHeap.offer(new Pair(1, 0));
        while (!minHeap.isEmpty()) {
            Pair x = minHeap.poll();
            if (this.visited[x.node]) continue;
            this.visited[x.node] = true;
            ans = (ans + x.weight)%mod;
            for(Pair nbr : this.graph[x.node]) {
                if(!this.visited[nbr.node]) {
                    minHeap.offer(nbr);
                }
            }
        }
        return ans;
    }

    class Pair implements Comparable<Pair>{
        int node;
        int weight;

        public Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }

        @Override
        public int compareTo(Pair o) {
            return this.weight - o.weight;
        }
    }
}
 */
