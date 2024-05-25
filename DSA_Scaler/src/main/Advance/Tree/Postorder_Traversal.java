package main.Advance.Tree;
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
    // int count_node(TreeNode A){
    //     if(A==null)return 0;
    //     return 1+count_node(A.left)+count_node(A.right);
    // }
    public ArrayList<Integer> postorderTraversal(TreeNode A) {

        //int count = count_node(A);
        ArrayList<Integer> al = new ArrayList<>();
        return postorder(A,al);
        //  if(A==null)return al;
        // postorderTraversal(A.left);
        // postorderTraversal(A.right);
        // al.add(A.val);
        // return al;

    }
    ArrayList<Integer> postorder(TreeNode A,ArrayList<Integer> al){
        if(A==null)return al;
        postorder(A.left,al);
        postorder(A.right,al);
        al.add(A.val);
        return al;

    }


}

 */