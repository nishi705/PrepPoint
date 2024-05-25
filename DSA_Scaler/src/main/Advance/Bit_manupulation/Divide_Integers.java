package main.Advance.Bit_manupulation;
/*
Problem Description
Divide two integers without using multiplication, division and mod operator.

Return the floor of the result of the division.

Also, consider if there can be overflow cases i.e output is greater than INT_MAX, return INT_MAX.

NOTE: INT_MAX = 2^31 - 1



Problem Constraints
-231 <= A, B <= 231-1

B != 0



Input Format
The first argument is an integer A denoting the dividend.
The second argument is an integer B denoting the divisor.



Output Format
Return an integer denoting the floor value of the division.



Example Input
Input 1:

 A = 5
 B = 2
Input 2:

 A = 7
 B = 1


Example Output
Output 1:

 2
Output 2:

 7


Example Explanation
Explanation 1:

 floor(5/2) = 2
 */
public class Divide_Integers {
}
/*
public class Solution {
    public int divide(int A, int B) {
       if(A==-1)return -1;

        if(A==Integer.MIN_VALUE && B== -1)return Integer.MAX_VALUE;
         A = Math.abs(A);
         B = Math.abs(B);

        int ans =0;

        while((A-B)>=0){
            int x = 0;
            while((A-(B<<1<<x))>=0){
                x++;
            }
            ans+= 1<<x;
            A= A-(B<<x);
        }

        return ans;
    }
}

 */