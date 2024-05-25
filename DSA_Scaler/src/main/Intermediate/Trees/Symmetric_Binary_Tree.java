package main.Intermediate.Trees;
/*
Problem Description
Given a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).



Problem Constraints
1 <= number of nodes <= 105



Input Format
First and only argument is the root node of the binary tree.



Output Format
Return 0 / 1 ( 0 for false, 1 for true ).



Example Input
Input 1:

    1
   / \
  2   2
 / \ / \
3  4 4  3
Input 2:

    1
   / \
  2   2
   \   \
   3    3


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 The above binary tree is symmetric.
Explanation 2:

The above binary tree is not symmetric.
 */
public class Symmetric_Binary_Tree {
}
/*

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
    int findsymmetric(TreeNode A,TreeNode B){



        if(A==null && B==null)return 1;
        if(A==null || B==null)return 0;
        // if(A==null && B!=null)return 0;

        if(A.val!=B.val){
            return 0;
        }
        else if(A.val==B.val){
            return (findsymmetric(A.left,B.right) & findsymmetric(A.right,B.left));
        }


        return 0;



        // if(A==null && B==null)return 1;
        // if(A!=null && B==null)return 0;
        // if(A==null && B!=null)return 0;

        // if(A.val!=B.val)return 0;

        // int x = findsymmetric(A.left,B.right);
        // if(x==0)return 0;
        // int y = findsymmetric(A.right,B.right);
        // if(x==0)return 0;
        // return 1;

    }
    public int isSymmetric(TreeNode A) {
        return findsymmetric(A.left,A.right);
    }
}

 */