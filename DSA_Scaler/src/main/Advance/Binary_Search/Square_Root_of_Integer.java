package main.Advance.Binary_Search;
/*
Problem Description
Given an integer A. Compute and return the square root of A.
If A is not a perfect square, return floor(sqrt(A)).

NOTE:
   The value of A*A can cross the range of Integer.
   Do not use the sqrt function from the standard library.
   Users are expected to solve this in O(log(A)) time.


Problem Constraints
0 <= A <= 109


Input Format
The first and only argument given is the integer A.


Output Format
Return floor(sqrt(A))


Example Input
Input 1:

 11
Input 2:

 9


Example Output
Output 1:

 3
Output 2:

 3


Example Explanation
Explanation 1:
When A = 11 , square root of A = 3.316. It is not a perfect square so we return the floor which is 3.
Explanatino 2:
When A = 9 which is a perfect square of 3, so we return 3.
 */
public class Square_Root_of_Integer {
}
/*
public class Solution {
    public int sqrt(int A) {
        if(A==1)return 1;
        long ans =0;

        if(A>1){
            int s=1;
            int e = A;
            int mid =0;
            while(s<=e){
                mid = (s+e)/2;
                if(mid>A/mid){
                    e=mid-1;
                }else if(mid<=A/2){
                    ans = mid;
                    s = mid+1;
                }
            }
        }

        return (int)ans%1000000007;

    }
}

 */