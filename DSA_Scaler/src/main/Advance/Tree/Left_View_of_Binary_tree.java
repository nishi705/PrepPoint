package main.Advance.Tree;
/*
Problem Description
Given a binary tree of integers. Return an array of integers representing the left view of the Binary tree.

Left view of a Binary Tree is a set of nodes visible when the tree is visited from Left side

NOTE: The value comes first in the array which have lower level.



Problem Constraints
1 <= Number of nodes in binary tree <= 100000

0 <= node values <= 109



Input Format
First and only argument is a root node of the binary tree, A.



Output Format
Return an integer array denoting the left view of the Binary tree.



Example Input
Input 1:

            1
          /   \
         2    3
        / \  / \
       4   5 6  7
      /
     8
Input 2:

            1
           /  \
          2    3
           \
            4
             \
              5


Example Output
Output 1:

 [1, 2, 4, 8]
Output 2:

 [1, 2, 4, 5]


Example Explanation
Explanation 1:

 The Left view of the binary tree is returned.

 */
public class Left_View_of_Binary_tree {
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
    public ArrayList<Integer> solve(TreeNode A) {

        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        ArrayList<Integer> al = new ArrayList<>();

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                TreeNode t = q.poll();
                if(i==0)al.add(t.val);
                if(t.left!=null) q.add(t.left);
                if(t.right!=null)q.add(t.right);
            }
        }

        return al;

    }
}

 */