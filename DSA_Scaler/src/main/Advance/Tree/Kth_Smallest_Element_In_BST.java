package main.Advance.Tree;
/*
Problem Description
Given a binary search tree represented by root A, write a function to find the Bth smallest element in the tree.



Problem Constraints
1 <= Number of nodes in binary tree <= 100000

0 <= node values <= 10^9



Input Format
First and only argument is head of the binary tree A.



Output Format
Return an integer, representing the Bth element.



Example Input
Input 1:


            2
          /   \
         1    3
B = 2
Input 2:


            3
           /
          2
         /
        1
B = 1



Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

2nd element is 2.
Explanation 2:

1st element is 1.
 */
public class Kth_Smallest_Element_In_BST {
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
    public int kthsmallest(TreeNode A, int B) {
        ArrayList<Integer> al = new ArrayList<>();

        al = inorderTraversal(A);
        int ans = al.get(B-1);
        return ans;

    }
    ArrayList<Integer> inorderTraversal(TreeNode A){
        ArrayList<Integer> list = new ArrayList<>();
        if(A==null)return list;

        list.addAll(inorderTraversal(A.left));
        list.add(A.val);
        list.addAll(inorderTraversal(A.right));


        return list;
    }
}

 */