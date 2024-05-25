package main.Advance.Tries;
/*
Problem Description
Given a binary tree A, flatten it to a linked list in-place.

The left child of all nodes should be NULL.



Problem Constraints
1 <= size of tree <= 100000



Input Format
First and only argument is the head of tree A.



Output Format
Return the linked-list after flattening.



Example Input
Input 1:

     1
    / \
   2   3
Input 2:

         1
        / \
       2   5
      / \   \
     3   4   6


Example Output
Output 1:

1
 \
  2
   \
    3
Output 2:

1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6


Example Explanation
Explanation 1:

 Tree flattening looks like this.
Explanation 2:

 Tree flattening looks like this.
 */
public class Flatten_Binary_Tree_to_Linked_List {
}
/*
public class Solution {
    TreeNode prev = null;
    public TreeNode flatten(TreeNode a) {
        flat(a);
        return a;
    }

    public void flat(TreeNode a){
        if(a==null)
        return;
        flat(a.right);
        flat(a.left);
        a.right=prev;
        a.left=null;
        prev = a;

    }
}
 */