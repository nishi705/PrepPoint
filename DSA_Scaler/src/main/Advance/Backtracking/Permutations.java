package main.Advance.Backtracking;
/*
Problem Description
Given an integer array A of size N denoting collection of numbers , return all possible permutations.

NOTE:

No two entries in the permutation sequence should be the same.
For the purpose of this problem, assume that all the numbers in the collection are unique.
Return the answer in any order
WARNING: DO NOT USE LIBRARY FUNCTION FOR GENERATING PERMUTATIONS.
Example : next_permutations in C++ / itertools.permutations in python.
If you do, we will disqualify your submission retroactively and give you penalty points.


Problem Constraints
1 <= N <= 9



Input Format
Only argument is an integer array A of size N.



Output Format
Return a 2-D array denoting all possible permutation of the array.



Example Input
A = [1, 2, 3]


Example Output
[ [1, 2, 3]
  [1, 3, 2]
  [2, 1, 3]
  [2, 3, 1]
  [3, 1, 2]
  [3, 2, 1] ]


Example Explanation
All the possible permutation of array [1, 2, 3].
 */
public class Permutations {
}
/*
public class Solution {
    ArrayList<ArrayList<Integer>> list;
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        list = new ArrayList<>();
      //  ArrayList<Integer> smallList =A;
        getPermutation(A,0,A.size());
        return list;

    }
    public void getPermutation(ArrayList<Integer> A,int i,int size){

        if(i==size){
         list.add(new ArrayList<>(A));
            return;
        }

        for(int j=i;j<size;j++){
            Collections.swap(A,j,i);
            getPermutation(A,i+1,size);
            Collections.swap(A,j,i);
        }
    }
}

 */