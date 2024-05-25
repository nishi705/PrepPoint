package main.Intermediate.Subsequence_and_subset;
/*
Given an array of integers A of size, N. Find the longest subsequence of A, which is odd-even.

A subsequence is said to be odd-even in the following cases:

The first element of the subsequence is odd; the second element is even, the third element is odd, and so on. For example: [5, 10, 5, 2, 1, 4], [1, 2, 3, 4, 5]

The first element of the subsequence is even, the second element is odd, the third element is even, and so on. For example: [10, 5, 2, 1, 4, 7], [10, 1, 2, 3, 4]

Return the maximum possible length of odd-even subsequence.

Note: An array B is a subsequence of an array A if B can be obtained from A by deleting several (possibly, zero, or all) elements.


Input Format

The only argument given is the integer array A.
Output Format

Return the maximum possible length of odd-even subsequence.
Constraints

1 <= N <= 100000
1 <= A[i] <= 10^9
For Example

Input 1:
    A = [1, 2, 2, 5, 6]
Output 1:
    4
    Explanation 1:
        Maximum length odd even subsequence is [1, 2, 5, 6]

Input 2:
    A = [2, 2, 2, 2, 2, 2]
Output 2:
    1
    Explanation 2:
        Maximum length odd even subsequence is [2]
 */
public class Odd_Even_Subsequences {
}
/*
public class Solution {
    public int solve(int[] A) {

     boolean val = (A[0]%2==0)?true:false;
     int count=0;


    for(int i=0;i<A.length;i++){
        if(val){
            if(A[i]%2==0){
                count++;
                val = false;
            }
            }else{
                if(A[i]%2!=0){
                    count++;
                    val = true;
                }
            }
        }



    return count;






    }
}

 */