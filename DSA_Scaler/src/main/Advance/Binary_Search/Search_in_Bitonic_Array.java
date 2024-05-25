package main.Advance.Binary_Search;
/*
Problem Description
Given a bitonic sequence A of N distinct elements, write a program to find a given element B in the bitonic sequence in O(logN) time.

NOTE:

A Bitonic Sequence is a sequence of numbers which is first strictly increasing then after a point strictly decreasing.


Problem Constraints
3 <= N <= 105

1 <= A[i], B <= 108

Given array always contain a bitonic point.

Array A always contain distinct elements.



Input Format
First argument is an integer array A denoting the bitonic sequence.

Second argument is an integer B.



Output Format
Return a single integer denoting the position (0 index based) of the element B in the array A if B doesn't exist in A return -1.



Example Input
Input 1:

 A = [3, 9, 10, 20, 17, 5, 1]
 B = 20
Input 2:

 A = [5, 6, 7, 8, 9, 10, 3, 2, 1]
 B = 30


Example Output
Output 1:

 3
Output 2:

 -1


Example Explanation
Explanation 1:

 B = 20 present in A at index 3
Explanation 2:

 B = 30 is not present in A
 */
public class Search_in_Bitonic_Array {
}
/*
public class Solution {
    public int solve(int[] A, int B) {

        int a = findPivot(A);
        if(A[a]==B)return a;
        int l = leftside(A,0,a-1,B);
        if(l!=-1){
        return l;
        }
        int r = rightside(A,a+1,A.length-1,B);
        if(r!=-1){
        return r;
        }
        return -1;

    }
    int findPivot(int[] A){
        int s = 0;
        int e = A.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(A[mid]>A[mid+1] && A[mid]>A[mid-1]){
                return mid;
            }else if(A[mid]>A[mid-1]){
                s=mid+1;
            }else if(A[mid]>A[mid+1]){
                e=mid-1;
            }
        }
        return -1;
    }
    int leftside(int[] A,int s,int e,int B){
        while(s<=e){
            int mid=(s+e)/2;
            if(A[mid]==B){
                 return mid;
            }
                 else if(A[mid]<B){
                 s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
    int rightside(int[] A,int s,int e,int B){
        while(s<=e){
           int mid=(s+e)/2;
            if(A[mid]==B){
                 return mid;
            }
                 else if(A[mid]<B){
                 e=mid-1;
            }else{
                s=mid+1;
            }
    }
    return -1;
    }
}

 */