package main.Advance.Tree;
/*
Problem Description
Given the inorder and postorder traversal of a tree, construct the binary tree.

NOTE: You may assume that duplicates do not exist in the tree.



Problem Constraints
1 <= number of nodes <= 105



Input Format
First argument is an integer array A denoting the inorder traversal of the tree.

Second argument is an integer array B denoting the postorder traversal of the tree.



Output Format
Return the root node of the binary tree.



Example Input
Input 1:

 A = [2, 1, 3]
 B = [2, 3, 1]
Input 2:

 A = [6, 1, 3, 2]
 B = [6, 3, 2, 1]


Example Output
Output 1:

   1
  / \
 2   3
Output 2:

   1
  / \
 6   2
    /
   3


Example Explanation
Explanation 1:

 Create the binary tree and return the root node of the tree.
 */
public class Binary_Tree_From_Inorder_And_Postorder {
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
    HashMap<Integer,Integer> map = new HashMap<>();
    TreeNode callbuildTree(int[] in,int[] po,int sin,int ein,int spo,int epo){
        if(sin>ein)return null;
        TreeNode root = new TreeNode(po[epo]);
        int idx = map.get(po[epo]);
        int x = ein-idx;
        root.left = callbuildTree(in,po,sin,idx-1,spo+1,epo-x-1);
        root.right = callbuildTree(in,po,idx+1,ein,epo-x,epo-1);
        return root;
    }
    public TreeNode buildTree(int[] A, int[] B) {
        for(int i=0;i<A.length;i++){
            map.put(A[i],i);
        }
        return callbuildTree(A,B,0,A.length-1,0,B.length-1);
    }
}

 */