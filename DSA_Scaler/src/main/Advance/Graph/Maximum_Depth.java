package main.Advance.Graph;


/*
Problem Description

Given a Tree of A nodes having A-1 edges. Each node is numbered from 1 to A where 1 is the root of the tree.

You are given Q queries. In each query, you will be given two integers L and X. Find the value of such node which lies at level L mod (MaxDepth + 1) and has value greater than or equal to X.

Answer to the query is the smallest possible value or -1, if all the values at the required level are smaller than X.

NOTE:

Level and Depth of the root is considered as 0.
It is guaranteed that each edge will be connecting exactly two different nodes of the tree.
Please read the input format for more clarification.


Problem Constraints

2 <= A, Q(size of array E and F) <= 105

1 <= B[i], C[i] <= A

1 <= D[i], E[i], F[i] <= 106



Input Format

The first argument is an integer A denoting the number of nodes.

The second and third arguments are the integer arrays B and C where for each i (0 <= i < A-1), B[i] and C[i] are the nodes connected by an edge.

The fourth argument is an integer array D, where D[i] denotes the value of the (i+1)th node

The fifth and sixth arguments are the integer arrays E and F where for each i (0 <= i < Q), E[i] denotes L and F[i] denotes X for ith query.



Output Format

Return an array of integers where the ith element denotes the answer to ith query.



Example Input

Input 1:

 A = 5
 B = [1, 4, 3, 1]
 C = [5, 2, 4, 4]
 D = [7, 38, 27, 37, 1]
 E = [1, 1, 2]
 F = [32, 18, 26]
Input 2:

 A = 3
 B = [1, 2]
 C = [3, 1]
 D = [7, 15, 27]
 E = [1, 10, 1]
 F = [29, 6, 26]


Example Output

Output 1:

 [37, 37, 27]
Output 2:

 [-1, 7, 27]


Example Explanation

Explanation 1:

      1[7]
     /    \
   5[1]  4[37]
        /    \
       2[38]  3[27]

 Query 1:
    L = 1, X = 32
    Nodes for level 1 are 5, 4
    Value of Node 5 = 1 < 32
    Value of Node 4 = 37 >= 32
    Ans = 37
Explanation 2:

      1[7]
     /    \
   2[15]  3[27]

 Query 1:
    L = 1, X = 6
    Nodes for level 1 are 2, 3 having value 15 and 27 respectively.
    Answer = -1 (Since no node is greater or equal to 29).
 Query 1:
    L = 10 % 2 = 0, X = 6
    Nodes for level 0 is 1 having value 7.
    Answer = 7.
 */

public class Maximum_Depth {
}

/*
public class Solution {
    public int[] solve(int A, int[] B, int[] C, int[] D, int[] E, int[] F) {
        ArrayList<Integer>[] adjList = new ArrayList[A+1];
        for(int i=0; i<B.length; i++) {
            if(adjList[B[i]]==null) adjList[B[i]] = new ArrayList<Integer>();
            if(adjList[C[i]]==null) adjList[C[i]] = new ArrayList<Integer>();
            adjList[B[i]].add(C[i]);
            adjList[C[i]].add(B[i]);
        }
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] vis = new boolean[A+1];
        int level = 0;
        queue.add(1);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {
                int x = queue.poll();
                vis[x] = true;
                if(map.containsKey(level)) {
                    map.get(level).add(D[x-1]);
                }else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(D[x-1]);
                    map.put(level, temp);
                }
                if(adjList[x]==null) continue;
                for(int j=0; j<adjList[x].size(); j++) {
                    int l = adjList[x].get(j);
                    if(!vis[l]) queue.add(l);
                }
            }
            Collections.sort(map.get(level));
            level++;
        }
        int[] ans = new int[E.length];
        for(int i=0; i<E.length; i++) {
            ans[i] = binarySearch(map.get(E[i]%level), F[i]);
        }
        return ans;
    }
    private int binarySearch(ArrayList<Integer> list, int target) {
        int ans = -1;
        int low = 0, high = list.size()-1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(list.get(mid)>=target) {
                ans=list.get(mid);
                high=mid-1;
            }else low=mid+1;
        }
        return ans;
    }
}
 */
