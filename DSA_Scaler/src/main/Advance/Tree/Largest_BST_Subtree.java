package main.Advance.Tree;
/*
Problem Description
You are given a Binary Tree A with N nodes.

Write a function that returns the size of the largest subtree, which is also a Binary Search Tree (BST).

If the complete Binary Tree is BST, then return the size of the whole tree.

NOTE:

The largest subtree is the subtree with the most number of nodes.


Problem Constraints
1 <= N <= 105



Input Format
First and only argument is an pointer to root of the binary tree A.



Output Format
Return an single integer denoting the size of the largest subtree which is also a BST.



Example Input
Input 1:

     10
    / \
   5  15
  / \   \
 1   8   7
Input 2:

     5
    / \
   3   8
  / \ / \
 1  4 7  9


Example Output
Output 1:

 3
Output 2:

 7


Example Explanation
Explanation 1:

 Largest BST subtree is
                            5
                           / \
                          1   8
Explanation 2:

 Given binary tree itself is BST
 */
public class Largest_BST_Subtree {
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

    public int solve(TreeNode A) {
        return getThelargestBST(A);
    }
    int getThelargestBST(TreeNode A){
        if(A==null)return 0;

        if(isValidBST(A,Integer.MIN_VALUE,Integer.MAX_VALUE)){
            return max_size(A);
        }
        int x =getThelargestBST(A.left);
        int y =getThelargestBST(A.right);
        return Math.max(x,y);
    }
    boolean isValidBST(TreeNode A,int min,int max){
        if(A==null)return true;
        if(A.val<=min || A.val>=max)return false;

        return (isValidBST(A.left,min,A.val)&& isValidBST(A.right,A.val,max));
    }
    int max_size(TreeNode A){
        if(A==null)return 0;
        return 1+max_size(A.left)+max_size(A.right);
    }
}

 */