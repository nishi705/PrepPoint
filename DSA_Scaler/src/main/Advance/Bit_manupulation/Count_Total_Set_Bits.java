package main.Advance.Bit_manupulation;
/*
Problem Description
Given a positive integer A, the task is to count the total number of set bits in the binary representation of all the numbers from 1 to A.

Return the count modulo 109 + 7.



Problem Constraints
1 <= A <= 109



Input Format
First and only argument is an integer A.



Output Format
Return an integer denoting the ( Total number of set bits in the binary representation of all the numbers from 1 to A )modulo 109 + 7.



Example Input
Input 1:

 A = 3
Input 2:

 A = 1


Example Output
Output 1:

 4
Output 2:

 1


Example Explanation
Explanation 1:

 DECIMAL    BINARY  SET BIT COUNT
    1          01        1
    2          10        1
    3          11        2
 1 + 1 + 2 = 4
 Answer = 4 % 1000000007 = 4
Explanation 2:

 A = 1
  DECIMAL    BINARY  SET BIT COUNT
    1          01        1
 Answer = 1 % 1000000007 = 1
 */
public class Count_Total_Set_Bits {
}
/*
public class Solution {
   static int max(int a){
        int c= 0;

        while((1<<c)<=a){
            c++;
        }
        return c-1;
    }
    public int solve(int A) {
        int mod = 1000000007;

       if(A==0){
        return 0;
    }
         long x = max(A);
         long a1 = (x*(1 << (x-1)))%mod;
         long a2 =  ((A- (1<<x) +1))%mod;
         int rest = A - (1<<x);
         long ans =   a1 + a2 + solve(rest);
         return (int)ans % mod;


}

}

 */