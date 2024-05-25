package main.Advance.Backtracking;
/*
Problem Description
Given an array of candidate numbers A and a target number B, find all unique combinations in A where the candidate numbers sums to B.

The same repeated number may be chosen from A unlimited number of times.

Note:

1) All numbers (including target) will be positive integers.

2) Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).

3) The combinations themselves must be sorted in ascending order.

4) CombinationA > CombinationB iff (a1 > b1) OR (a1 = b1 AND a2 > b2) OR ... (a1 = b1 AND a2 = b2 AND ... ai = bi AND ai+1 > bi+1)

5) The solution set must not contain duplicate combinations.



Problem Constraints
1 <= |A| <= 20

1 <= A[i] <= 50

1 <= B <= 500



Input Format
The first argument is an integer array A.

The second argument is integer B.



Output Format
Return a vector of all combinations that sum up to B.



Example Input
Input 1:

A = [2, 3]
B = 2
Input 2:

A = [2, 3, 6, 7]
B = 7


Example Output
Output 1:

[ [2] ]
Output 2:

[ [2, 2, 3] , [7] ]


Example Explanation
Explanation 1:

All possible combinations are listed.
Explanation 2:

All possible combinations are listed.
 */
public class Combination_Sum {
}
/*
public class Solution {

    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(A.size()==0)return list;
        combinationSum(A,list,new ArrayList<Integer>(),B,0,0);
        return list;

    }

    void combinationSum(ArrayList<Integer> A,ArrayList<ArrayList<Integer>> list,ArrayList<Integer> al,int B,int index,int sum){
        if(sum>B)return;
        if(sum==B){
            if(!list.contains(al)){
                list.add(new ArrayList<>(al));
                return;
            }
        }

            for(int i=index;i<A.size();i++){
                al.add(A.get(i));
                combinationSum(A,list,al,B,i,sum+A.get(i));
                al.remove(al.size()-1);
            }

    }
}

 */