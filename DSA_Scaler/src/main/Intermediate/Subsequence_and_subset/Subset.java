package main.Intermediate.Subsequence_and_subset;
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
public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
     Collections.sort(A);
    int n = A.size();
ArrayList<ArrayList<Integer>> ans = new ArrayList<>();


    for(int i=0;i<1<<n;i++){
          ArrayList<Integer> al = new ArrayList<>();
        for(int j=0;j<n;j++){

            if((i&(1<<j))!=0){
                al.add(A.get(j));
            }
        }
        ans.add(al);
    }
    Collections.sort(ans,(ArrayList<Integer> a,ArrayList<Integer> b)->{
        for(int i=0;i<a.size()&&i<b.size();i++){
            if(a.get(i)<b.get(i))return -1;
            if(a.get(i)>b.get(i))return 1;
        }
        if(a.size()>b.size())return 1;
        return -1;

    });
    return ans;

   }
}

 */