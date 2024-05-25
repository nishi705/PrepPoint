package main.Intermediate.Trees;
/*
Problem Description
Given a Binary Tree A containing N nodes, you need to find the path from Root to a given node B.

NOTE:

No two nodes in the tree have the same data values.
You can assume that B is present in tree A and a path always exists.


Problem Constraints
1 <= N <= 105

1 <= Data Values of Each Node <= N

1 <= B <= N



Input Format
First Argument represents pointer to the root of binary tree A.

Second Argument is an integer B denoting the node number.



Output Format
Return an one-dimensional array denoting the path from Root to the node B in order.



Example Input
Input 1:

 A =
           1
         /   \
        2     3
       / \   / \
      4   5 6   7

 B = 5
Input 2:

 A =
            1
          /   \
         2     3
        / \ .   \
       4   5 .   6

 B = 1


Example Output
Output 1:

 [1, 2, 5]
Output 2:

 [1]


Example Explanation
Explanation 1:

 We need to find the path from root node to node with data value 5.
 So the path is 1 -> 2 -> 5 so we will return [1, 2, 5]
Explanation 2:

 We need to find the path from root node to node with data value 1.
 As node with data value 1 is the root so there is only one node in the path.
 So we will return [1]
 */
public class Path_to_Given_Node {
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
    ArrayList<Integer> arr = new ArrayList<>();
    boolean callfunction(TreeNode A,int B){

        if(A==null)return false;
        arr.add(A.val);
        if(A.val == B)return true;

        if(callfunction(A.left,B)|| callfunction(A.right,B))return true;
        arr.remove(arr.size()-1);
        return false;


    }
    public ArrayList<Integer> solve(TreeNode A, int B) {
        callfunction(A,B);
        return arr;
    }

}

 */