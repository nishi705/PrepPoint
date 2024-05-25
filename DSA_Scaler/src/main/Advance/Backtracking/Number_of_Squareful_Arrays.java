package main.Advance.Backtracking;
/*
Problem Description
Given an array of integers A, the array is squareful if for every pair of adjacent elements, their sum is a perfect square.

Find and return the number of permutations of A that are squareful. Two permutations A1 and A2 differ if and only if there is some index i such that A1[i] != A2[i].



Problem Constraints
1 <= length of the array <= 12

1 <= A[i] <= 109



Input Format
The only argument given is the integer array A.



Output Format
Return the number of permutations of A that are squareful.



Example Input
Input 1:

 A = [2, 2, 2]
Input 2:

 A = [1, 17, 8]


Example Output
Output 1:

 1
Output 2:

 2


Example Explanation
Explanation 1:

 Only permutation is [2, 2, 2], the sum of adjacent element is 4 and 4 and both are perfect square.
Explanation 2:

 Permutation are [1, 8, 17] and [17, 8, 1].

 */
public class Number_of_Squareful_Arrays {
}
/*
public class Solution {
    HashSet<ArrayList<Integer>> set;
    public int solve(ArrayList<Integer> A) {
        if(A.size()<=1) return 0;
        set = new HashSet<>();
        int n = A.size();
        boolean[] mrk = new boolean[n];
        for(int i=0;i<n;i++) mrk[i]= true;

        generateper(A,mrk,n,new ArrayList<>());
        return set.size();

    }
    public void generateper(ArrayList<Integer> A,boolean[] mrk,int n,ArrayList<Integer> B){
        if(B.size()==n){
            set.add(new ArrayList<>(B));
            return;
        }
        for(int i=0;i<n;i++){
            if(mrk[i]){
                B.add(A.get(i));
                if(B.size()>1){
                    //checking perfect square of last 2 elements of the array.
                    int x = B.get(B.size()-1)+B.get(B.size()-2);
                    if(!checkpersqr(x)){
                        //if it is not a perfect square popping the ele and moving to the next element.
                        B.remove(B.size()-1);
                        continue;
                    }
                }
                mrk[i] = false;
                generateper(A,mrk,n,B);
                B.remove(B.size()-1);
                mrk[i] = true;
            }
        }
    }
    public boolean checkpersqr(int a){

        double sqrt = Math.sqrt(a);

        if(sqrt-Math.floor(sqrt)!=0.0) return false;
        return true;
    }
}
 */