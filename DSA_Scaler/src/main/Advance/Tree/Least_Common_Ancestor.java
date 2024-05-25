package main.Advance.Tree;
/*
Problem Description
Find the lowest common ancestor in an unordered binary tree A, given two values, B and C, in the tree.

Lowest common ancestor: the lowest common ancestor (LCA) of two nodes and w in a tree or directed acyclic graph (DAG) is the lowest (i.e., deepest) node that has both v and w as descendants.



Problem Constraints
1 <= size of tree <= 100000

1 <= B, C <= 109



Input Format
First argument is head of tree A.

Second argument is integer B.

Third argument is integer C.



Output Format
Return the LCA.



Example Input
Input 1:


      1
     /  \
    2    3
B = 2
C = 3
Input 2:

      1
     /  \
    2    3
   / \
  4   5
B = 4
C = 5


Example Output
Output 1:

 1
Output 2:

 2


Example Explanation
Explanation 1:

 LCA is 1.
Explanation 2:

 LCA is 2.
 */
public class Least_Common_Ancestor {
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
    TreeNode lcanode;
    boolean isBpresent,isCpresent;
    public int lca(TreeNode A, int B, int C) {

        ifnodeispresent(A,B,C);
        if(isBpresent && isCpresent){
            lcanode = getnodevalue(A,B,C);
            return lcanode.val;
        }
        return -1;
    }
    TreeNode getnodevalue(TreeNode A,int B,int C){
        if(A==null)return null;
        if(A.val==B || A.val == C)return A;
        TreeNode llca = getnodevalue(A.left,B,C);
        TreeNode rlca = getnodevalue(A.right,B,C);
        if(llca!=null && rlca !=null)return A;
        else if(llca == null)return rlca;
        else return llca;
    }
    void ifnodeispresent(TreeNode A,int B,int C){
        if(A==null)return;
        ifnodeispresent(A.left,B,C);
        ifnodeispresent(A.right,B,C);
        if(A.val==B)isBpresent=true;
        if(A.val==C)isCpresent=true;
    }
}

 */