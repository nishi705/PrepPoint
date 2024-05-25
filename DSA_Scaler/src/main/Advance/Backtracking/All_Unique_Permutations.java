package main.Advance.Backtracking;
/*
Problem Description
Given an array A of size N denoting collection of numbers that might contain duplicates, return all possible unique permutations.

NOTE: No 2 entries in the permutation sequence should be the same.

WARNING: DO NOT USE LIBRARY FUNCTION FOR GENERATING PERMUTATIONS.
Example : next_permutations in C++ / itertools.permutations in python.
If you do, we will disqualify your submission retroactively and give you penalty points.


Problem Constraints
1 <= |A| <= 9

0 <= A[i] <= 10



Input Format
Only argument is an integer array A of size N.



Output Format
Return a 2-D array denoting all possible unique permutation of the array.



Example Input
Input 1:

A = [1, 1, 2]
Input 2:

A = [1, 2]


Example Output
Output 1:

[ [1,1,2]
  [1,2,1]
  [2,1,1] ]
Output 2:

[ [1, 2]
  [2, 1] ]


Example Explanation
Explanation 1:

 All the possible unique permutation of array [1, 1, 2].
Explanation 2:

 All the possible unique permutation of array [1, 2].
 */
public class All_Unique_Permutations {
}
/*
public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        int n = 11;
        int[] hasharray = new int[n];
        for(int i =0;i<A.size();i++){
        hasharray[A.get(i)]++;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int p = A.size();
        solve(ans,arr,hasharray,p);
        return ans;
    }

    public void solve(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> arr, int[] hasharray, int n){
        if(arr.size()>=n){
            ans.add(new ArrayList<>(arr));
            return;
        }

        for(int i =0;i<11;i++){
            if(hasharray[i]>0){
                arr.add(i);
                hasharray[i]--;
                solve(ans,arr,hasharray,n);
                hasharray[i]++;
                arr.remove(arr.size()-1);
            }
        }
    }
}

 */