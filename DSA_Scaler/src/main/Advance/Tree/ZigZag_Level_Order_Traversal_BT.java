package main.Advance.Tree;
/*
Problem Description
Given a binary tree, return the zigzag level order traversal of its nodes values. (ie, from left to right, then right to left for the next level and alternate between).



Problem Constraints
1 <= number of nodes <= 105



Input Format
First and only argument is root node of the binary tree, A.



Output Format
Return a 2D integer array denoting the zigzag level order traversal of the given binary tree.



Example Input
Input 1:

    3
   / \
  9  20
    /  \
   15   7
Input 2:

   1
  / \
 6   2
    /
   3


Example Output
Output 1:

 [
   [3],
   [20, 9],
   [15, 7]
 ]
Output 2:

 [
   [1]
   [2, 6]
   [3]
 ]


Example Explanation
Explanation 1:

 Return the 2D array. Each row denotes the zigzag traversal of each level.
 */
public class ZigZag_Level_Order_Traversal_BT {
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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        boolean flag = true;

        stack1.push(A);

        while(!stack1.isEmpty()){
            int size = stack1.size();
            ArrayList<Integer> ans = new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode t = stack1.pop();
                ans.add(t.val);

                if(flag){
                    if(t.left!=null){
                        stack2.push(t.left);
                    }if(t.right!=null){
                        stack2.push(t.right);
                    }
                }else{
                    if(t.right!=null){
                        stack2.push(t.right);
                    }if(t.left!=null){
                        stack2.push(t.left);
                    }
                }

                if(stack1.isEmpty()){
                    flag = !flag;
                    Stack<TreeNode> temp = stack1;
                    stack1 = stack2;
                    stack2 = temp;
                }
            }
            al.add(ans);
        }

        return al;

    }
}

 */