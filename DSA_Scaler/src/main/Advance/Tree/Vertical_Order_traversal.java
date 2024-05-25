package main.Advance.Tree;
/*
Problem Description
Given a binary tree, return a 2-D array with vertical order traversal of it. Go through the example and image for more details.


NOTE: If 2 Tree Nodes shares the same vertical level then the one with lesser depth will come first.



Problem Constraints
0 <= number of nodes <= 105



Input Format
First and only arument is a pointer to the root node of binary tree, A.



Output Format
Return a 2D array denoting the vertical order traversal of tree as shown.



Example Input
Input 1:

      6
    /   \
   3     7
  / \     \
 2   5     9
Input 2:

      1
    /   \
   3     7
  /       \
 2         9


Example Output
Output 1:

 [
    [2],
    [3],
    [6, 5],
    [7],
    [9]
 ]
Output 2:

 [
    [2],
    [3],
    [1],
    [7],
    [9]
 ]


Example Explanation
Explanation 1:

 First row represent the verical line 1 and so on.
 */
public class Vertical_Order_traversal {
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

    Info(TreeNode node ,int dist){
        this.node = node;
        this.dist = dist;
    }
}

public class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        Queue<Info> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

        //  ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        // HashMap<Integer,ArrayList<Integer>> map=new HashMap<Integer,ArrayList<Integer>>();
        // Queue<Info> q=new LinkedList<Info>();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        q.add(new Info(A,0));

        while(q.size()!=0){
            TreeNode t = q.peek().node;
            int dist = q.peek().dist;
            max = Math.max(max,dist);
            min= Math.min(min,dist);
            q.remove();

            if(map.containsKey(dist)){
                ArrayList<Integer> lt2=map.get(dist);
                lt2.add(t.val);
                map.put(dist,lt2);
            }
            else{
                ArrayList<Integer> lt1=new ArrayList<Integer>();
                lt1.add(t.val);
                map.put(dist, lt1);
            }

            if(t.left!=null){
                Info info = new Info(t.left,dist-1);
                q.add(info);
            }
            if(t.right!=null){
                Info info = new Info(t.right,dist+1);
                q.add(info);
            }
        }
        for(int i=min;i<=max;i++){
            ans.add(map.get(i));
        }
        return ans;


    }

}

 */