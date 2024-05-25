package main.Intermediate.Trees;
/*
Problem Description
Given a binary tree, return the Postorder traversal of its nodes values.



Problem Constraints
1 <= number of nodes <= 105



Input Format
First and only argument is root node of the binary tree, A.



Output Format
Return an integer array denoting the Postorder traversal of the given binary tree.



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

 [3, 2, 1]
Output 2:

 [6, 3, 2, 1]


Example Explanation
Explanation 1:

 The Preoder Traversal of the given tree is [3, 2, 1].
Explanation 2:

 The Preoder Traversal of the given tree is [6, 3, 2, 1].
 */
public class Postorder_Traversal {
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
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList al = new ArrayList();
        callpost(A,al);
        return al;
    }
    public void callpost(TreeNode A,ArrayList al){
        if(A==null){
            return;
        }
        callpost(A.left,al);
        callpost(A.right,al);
        al.add(A.val);

    }
}

 */