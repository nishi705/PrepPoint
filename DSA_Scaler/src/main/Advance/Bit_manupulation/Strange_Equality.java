package main.Advance.Bit_manupulation;
/*
Problem Description
Given an integer A.
Two numbers, X and Y, are defined as follows:

X is the greatest number smaller than A such that the XOR sum of X and A is the same as the sum of X and A.
Y is the smallest number greater than A, such that the XOR sum of Y and A is the same as the sum of Y and A.
Find and return the XOR of X and Y.

NOTE 1: XOR of X and Y is defined as X ^ Y where '^' is the BITWISE XOR operator.

NOTE 2: Your code will be run against a maximum of 100000 Test Cases.



Problem Constraints
1 <= A <= 109



Input Format
First and only argument is an integer A.



Output Format
Return an integer denoting the XOR of X and Y.



Example Input
A = 5


Example Output
10


Example Explanation
The value of X will be 2 and the value of Y will be 8. The XOR of 2 and 8 is 10.
 */
public class Strange_Equality {
}
/*
public class Solution {
    public int solve(int A) {

int tmp = A;
// setting all bits right of MSB of A as 1, eg : 0001010101 => 0001111111
A = A | (A >> 1);
A = A | (A >> 2);
A = A | (A >> 4);
A = A | (A >> 8);
A = A | (A >> 16);
return (A & (~tmp))^(A + 1);


    }
}

 */