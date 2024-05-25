package main.Intermediate.Trees;
/*
Problem Description
Given the root of a tree A with each node having a certain value, find the count of nodes with more value than all its ancestors.

Ancestor means that every node that occurs before the current node in the path from root to the node.



Problem Constraints
1 <= Number of Nodes <= 200000

1 <= Value of Nodes <= 2000000000



Input Format
The first and only argument of input is a tree node.



Output Format
Return a single integer denoting the count of nodes that have more value than all of its ancestors.



Example Input
Input 1:


     3
Input 2:


    4
   / \
  5   2
     / \
    3   6


Example Output
Output 1:

 1
Output 2:

 3


Example Explanation
Explanation 1:

 There's only one node in the tree that is the valid node.
Explanation 2:

 The valid nodes are 4, 5 and 6.
 */
public class Counting_the_Nodes {
}
/*
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }

public class Solution {
    int count =0;
    public int solve(TreeNode A) {
        dfs(A,Integer.MIN_VALUE);
        return count;
    }
    void dfs(TreeNode A,int max){
        if(A==null)return;

        if(A.val>max)count++;

        dfs(A.left,Math.max(max,A.val));
        dfs(A.right,Math.max(max,A.val));

    }

}

 */