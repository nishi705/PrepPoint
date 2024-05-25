package main.Advance.Tree;
/*
Problem Description
Given a root of binary tree A, determine if it is height-balanced.

A height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.



Problem Constraints
1 <= size of tree <= 100000



Input Format
First and only argument is the root of the tree A.



Output Format
Return 0 / 1 ( 0 for false, 1 for true ) for this problem.



Example Input
Input 1:

    1
   / \
  2   3
Input 2:


       1
      /
     2
    /
   3


Example Output
Output 1:

1
Output 2:

0


Example Explanation
Explanation 1:

It is a complete binary tree.
Explanation 2:

Because for the root node, left subtree has depth 2 and right subtree has depth 0.
Difference = 2 > 1.

 */
public class Balanced_Binary_Tree {
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
    int balanced =1;

    public int isBalanced(TreeNode A) {
        postOrderTraversal(A);
        return balanced;
    }
    int postOrderTraversal(TreeNode A){
        if(A==null)return -1;

        int left = postOrderTraversal(A.left);
        int right = postOrderTraversal(A.right);

        if(Math.abs(left-right)>1)balanced=0;
        return Math.max(left,right)+1;
    }
}

 */