package main.Advance.Arrays;
/*
Problem Description

Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.



Problem Constraints

1 <= length of the array <= 100000
-109 <= A[i], B <= 109



Input Format

The first argument given is the integer array A.
The second argument given is the integer B.



Output Format

Return the minimum number of swaps.



Example Input

Input 1:

 A = [1, 12, 10, 3, 14, 10, 5]
 B = 8
Input 2:

 A = [5, 17, 100, 11]
 B = 20


Example Output

Output 1:

 2
Output 2:

 1


Example Explanation

Explanation 1:

 A = [1, 12, 10, 3, 14, 10, 5]
 After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
 After swapping  the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].
 Now, all elements less than or equal to 8 are together.
Explanation 2:

 A = [5, 17, 100, 11]
 After swapping 100 and 11, A => [5, 17, 11, 100].
 Now, all elements less than or equal to 20 are together.
 */
public class Minimum_Swaps {
}
/*
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {

        //we need to find out the minimum number of swap to get all the
        //element less than B together

        int x=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)<=B){
                x++;
            }
        }

        int y=0;
        for(int i=0;i<x;i++){
            if(A.get(i)>B){
                y++;
            }
        }

         int ans = y;
        for(int i=0,l=x;l<A.size();i++,l++){
            if(A.get(i)>B){
                y--;
            }if(A.get(l)>B){
                y++;
            }

            ans = Math.min(ans,y);
        }

   return ans;
    }
}

 */