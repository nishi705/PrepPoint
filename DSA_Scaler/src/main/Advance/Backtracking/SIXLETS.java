package main.Advance.Backtracking;
/*
Problem Description
Given a array of integers A of size N and an integer B.

Return number of non-empty subsequences of A of size B having sum <= 1000.



Problem Constraints
1 <= N <= 20

1 <= A[i] <= 1000

1 <= B <= N



Input Format
The first argument given is the integer array A.

The second argument given is the integer B.



Output Format
Return number of subsequences of A of size B having sum <= 1000.



Example Input
Input 1:

    A = [1, 2, 8]
    B = 2
Input 2:

    A = [5, 17, 1000, 11]
    B = 4


Example Output
Output 1:

3
Output 2:

0


Example Explanation
Explanation 1:

 {1, 2}, {1, 8}, {2, 8}
Explanation 1:

 No valid subsequence
 */
public class SIXLETS {
}
/*
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {

        return getSixlets(A,0,0,0,B);
    }
    int getSixlets(ArrayList<Integer> A,int i,int sum,int size,int B){
        if(sum>1000)return 0;
        if(size==B)return 1;
        if(i==A.size())return 0;

        return getSixlets(A,i+1,sum+A.get(i),size+1,B)+getSixlets(A,i+1,sum,size,B);
    }
}

 */