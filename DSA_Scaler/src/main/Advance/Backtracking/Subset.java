package main.Advance.Backtracking;
/*
Problem Description
Given a set of distinct integers A, return all possible subsets.

NOTE:

Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
Also, the subsets should be sorted in ascending ( lexicographic ) order.
The initial list is not necessarily sorted.


Problem Constraints
1 <= |A| <= 16
INTMIN <= A[i] <= INTMAX


Input Format
First and only argument of input contains a single integer array A.



Output Format
Return a vector of vectors denoting the answer.



Example Input
Input 1:

A = [1]
Input 2:

A = [1, 2, 3]


Example Output
Output 1:

[
    []
    [1]
]
Output 2:

[
 []
 [1]
 [1, 2]
 [1, 2, 3]
 [1, 3]
 [2]
 [2, 3]
 [3]
]


Example Explanation
Explanation 1:

 You can see that these are all possible subsets.
Explanation 2:

You can see that these are all possible subsets.
 */
public class Subset {
}
/*
public class Solution {
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<Integer> list =  new ArrayList<>();
        ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>());
        getss(A,0,A.size(),list);
        return ans;

}
public static void getss(ArrayList<Integer> A, int i,int n,ArrayList<Integer> cur){
        if(i==n){
            return;
        }

        cur.add(A.get(i));
        ans.add(new ArrayList<Integer> (cur));
        getss(A,i+1,n,cur);
       //  System.out.print(cur.size()-1);
       cur.remove(cur.size()-1);

        getss(A,i+1,n,cur);

    }

}

 */