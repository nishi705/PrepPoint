package main.Advance.soritng;
/*
Problem Description
Find the Bth smallest element in given array A .

NOTE: Users should try to solve it in less than equal to B swaps.



Problem Constraints
1 <= |A| <= 100000

1 <= B <= min(|A|, 500)

1 <= A[i] <= 109



Input Format
The first argument is an integer array A.

The second argument is integer B.



Output Format
Return the Bth smallest element in given array.



Example Input
Input 1:

A = [2, 1, 4, 3, 2]
B = 3
Input 2:

A = [1, 2]
B = 2


Example Output
Output 1:

 2
Output 2:

 2


Example Explanation
Explanation 1:

 3rd element after sorting is 2.
Explanation 2:

 2nd element after sorting is 2.
 */
public class Kth_Smallest_Element {
}
/*
public class Solution {
    public int kthsmallest(final int[] A, int B) {
      for(int i=0;i<A.length-1;i++){
          int min_idx = i;
          for(int j=i+1;j<A.length;j++)
              if(A[j]<A[min_idx])
              min_idx = j;

          int temp = A[min_idx];
          A[min_idx] = A[i];
          A[i] = temp;

      }

      return A[B-1];
    }
}

 */