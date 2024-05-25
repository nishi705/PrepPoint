package main.Intermediate.Trees;
/*
Problem Description
Given a binary tree, return the preorder traversal of its nodes values.



Problem Constraints
1 <= number of nodes <= 105



Input Format
First and only argument is root node of the binary tree, A.



Output Format
Return an integer array denoting the preorder traversal of the given binary tree.



Example Input
Input 1:

   1
    \
     2
    /
   3
Input 2:

   1
  / \
 6   2
    /
   3


Example Output
Output 1:

 [1, 2, 3]
Output 2:

 [1, 6, 2, 3]


Example Explanation
Explanation 1:

 The Preoder Traversal of the given tree is [1, 2, 3].
Explanation 2:

 The Preoder Traversal of the given tree is [1, 6, 2, 3].
 */
public class Preorder_Traversal {
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
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList l = new ArrayList();
        t(A,l);
        return l;
    }
    public void t(TreeNode root, ArrayList l){
        if(root==null){
            return;
        }
        l.add(root.val);
        t(root.left,l);
        t(root.right,l);
    }


}

 */