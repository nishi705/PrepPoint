package main.Advance.soritng;
/*
Problem Description

Given an integer array A, sort the array using QuickSort.



Problem Constraints

1 <= |A| <= 105

1 <= A[i] <= 109



Input Format

First argument is an integer array A.



Output Format

Return the sorted array.



Example Input

Input 1:

 A = [1, 4, 10, 2, 1, 5]
Input 2:

 A = [3, 7, 1]


Example Output

Output 1:

 [1, 1, 2, 4, 5, 10]
Output 2:

 [1, 3, 7]


Example Explanation

Explanation 1:

 Return the sorted array.
 */
public class QuickSort {
}
/*
public class Solution {
    void sortquick(int[] A,int s,int e){
        if(s>=e)return;
        int pivot = findpiot(A,s,e);
        sortquick(A,s,pivot-1);
        sortquick(A,pivot+1,e);

    }
   int findpiot(int[] A,int s,int e){
       int l = s+1;
       int r = e;

       while(l<=r){
           if(A[l]<=A[s]){
               l++;
           }else if(A[r]>A[s]){
               r--;
           }else{
               int temp = A[l];
               A[l] = A[r];
               A[r] = temp;
           }
       }

       int temp = A[s];
       A[s] = A[r];
       A[r] = temp;

       return r;

   }

    public int[] solve(int[] A) {
         sortquick(A,0,A.length-1);
         return A;
    }
}

 */