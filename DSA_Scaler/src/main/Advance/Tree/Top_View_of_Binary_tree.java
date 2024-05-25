package main.Advance.Tree;
/*
Problem Description
Given a binary tree of integers denoted by root A. Return an array of integers representing the top view of the Binary tree.

The top view of a Binary Tree is a set of nodes visible when the tree is visited from the top.

Return the nodes in any order.



Problem Constraints
1 <= Number of nodes in binary tree <= 100000

0 <= node values <= 10^9



Input Format
First and only argument is head of the binary tree A.



Output Format
Return an array, representing the top view of the binary tree.



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

 [1, 2, 4, 8, 3, 7]
Output 2:

 [1, 2, 3]


Example Explanation
Explanation 1:

Top view is described.
Explanation 2:

Top view is described.
 */
public class Top_View_of_Binary_tree {
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


class Info{
    TreeNode node;
    int dist;

    Info(TreeNode node,int dist){
        this.node = node;
        this.dist = dist;
    }
}
public class Solution {
    public ArrayList<Integer> solve(TreeNode A) {

        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(A,0));

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        while(q.size()!=0){
            TreeNode t = q.peek().node;
            int dist = q.peek().dist;
            max = Math.max(max,dist);
            min = Math.min(min,dist);
            q.remove();

            if(!map.containsKey(dist)){
                map.put(dist,t.val);
            }
            if(t.left!=null){
                Info info = new Info(t.left,dist-1);
                q.add(info);
            }if(t.right!=null){
                Info info = new Info(t.right,dist+1);
                q.add(info);
            }
        }

        for(int i=min;i<=max;i++){
            al.add(map.get(i));
        }
        return al;
    }
}

 */