package main.Advance.Bit_manupulation;
/*
Problem Description
Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
Find the two integers that appear only once.

Note: Return the two numbers in ascending order.


Problem Constraints
2 <= |A| <= 100000
1 <= A[i] <= 109



Input Format
The first argument is an array of integers of size N.



Output Format
Return an array of two integers that appear only once.



Example Input
Input 1:
A = [1, 2, 3, 1, 2, 4]
Input 2:

A = [1, 2]


Example Output
Output 1:
[3, 4]
Output 2:

[1, 2]


Example Explanation
Explanation 1:
3 and 4 appear only once.
Explanation 2:

1 and 2 appear only once.
 */
public class Single_Number_three {
}
/*
public class Solution {
    public int[] solve(int[] A) {

        int xor=0;
        for(int i=0;i<A.length;i++){
            xor = xor^A[i];
        }

        int msb = xor & -xor;
        int x = 0;
        int y=0;

        for(int i=0;i<A.length;i++){

            if((msb&A[i])==0){
                x=x^A[i];
            }else{
                y=y^A[i];
            }
        }
         int ans[] = new int[2];
        if(x<y){
        ans[0] = x;
        ans[1] = y;
        }
        else if(x>y){
        ans[0] = y;
        ans[1] = x;
        }
        return ans;


    }


}

 */