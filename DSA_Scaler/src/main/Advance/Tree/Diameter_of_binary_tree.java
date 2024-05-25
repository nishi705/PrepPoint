package main.Advance.Tree;
/*
Problem Description
Given a Binary Tree A consisting of N integer nodes, you need to find the diameter of the tree.

The diameter of a tree is the number of edges on the longest path between two nodes in the tree.



Problem Constraints
0 <= N <= 105



Input Format
First and only Argument represents the root of binary tree A.



Output Format
Return an single integer denoting the diameter of the tree.


 */
public class Diameter_of_binary_tree {
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
    int diameter;
    public int solve(TreeNode A) {
        diameter =0;
        Height(A);
        return diameter;
    }
    int Height(TreeNode A){
        if(A==null)return -1;

        int leftheight = Height(A.left);
        int rightheight = Height(A.right);
        diameter = Math.max(diameter,leftheight+rightheight+2);
        return 1+Math.max(leftheight,rightheight);
    }
}

 */