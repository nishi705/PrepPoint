package main.Advance.Binary_Search;
/*
Problem Description
Given a matrix of integers A of size N x M in which each row is sorted.

Find and return the overall median of matrix A.

NOTE: No extra memory is allowed.

NOTE: Rows are numbered from top to bottom and columns are numbered from left to right.



Problem Constraints
1 <= N, M <= 10^5

1 <= N*M <= 10^6

1 <= A[i] <= 10^9

N*M is odd



Input Format
The first and only argument given is the integer matrix A.



Output Format
Return the overall median of matrix A.



Example Input
Input 1:

A = [   [1, 3, 5],
        [2, 6, 9],
        [3, 6, 9]   ]
Input 2:

A = [   [5, 17, 100]    ]


Example Output
Output 1:

 5
Output 2:

 17


Example Explanation
Explanation 1:

A = [1, 2, 3, 3, 5, 6, 6, 9, 9]
Median is 5. So, we return 5.
Explanation 2:

Median is 17.
 */
public class Matrix_Median {
}
/*
public class Solution {
    int findcount(ArrayList<Integer> A, int mid){

        int low =0;
        int high = A.size()-1;

        while(low<=high){
            int m = low+(high-low)/2;

            if(A.get(m)<=mid)
            low = m+1;
            else
            {
                high = m-1;
            }
        }
          return low;

    }
    public int findMedian(ArrayList<ArrayList<Integer>> A) {

        int n = A.size();
        int m = A.get(0).size();

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        int x = 1+(n*m)/2;

        for(int i=0;i<n;i++){
            if(A.get(i).get(0)<low)
            low = A.get(i).get(0);
            if(A.get(i).get(m-1)>high)
            high = A.get(i).get(m-1);
        }

        while(low<=high){
            int mid = low+(high-low)/2;

            int count =0;
            for(int i=0;i<n;i++){
                count+= findcount(A.get(i),mid);
            }


            if(count<x){
            low = mid+1;
            }
            else{
            high = mid-1;
            }
        }

        return low;
    }
}

 */