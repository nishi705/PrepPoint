package main.Advance.Binary_Search;
/*
Problem Description
You are given three positive integers, A, B, and C.

Any positive integer is magical if divisible by either B or C.

Return the Ath smallest magical number. Since the answer may be very large, return modulo 109 + 7.

Note: Ensure to prevent integer overflow while calculating.



Problem Constraints
1 <= A <= 109

2 <= B, C <= 40000



Input Format
The first argument given is an integer A.

The second argument given is an integer B.

The third argument given is an integer C.



Output Format
Return the Ath smallest magical number. Since the answer may be very large, return modulo 109 + 7.



Example Input
Input 1:

 A = 1
 B = 2
 C = 3
Input 2:

 A = 4
 B = 2
 C = 3


Example Output
Output 1:

 2
Output 2:

 6


Example Explanation
Explanation 1:

 1st magical number is 2.
Explanation 2:

 First four magical numbers are 2, 3, 4, 6 so the 4th magical number is 6.


 */
public class Ath_Magical_Number {
}
/*
public class Solution {
    static int gcd(int x, int y){
        if(x==0){
            return y;
        }

        return gcd(y%x,x);
    }
    public int solve(int A, int B, int C) {

         long lcm=(long) B*C/gcd(B,C);
        long l=1, r=(long) Math.min(B,C)*A, ans=2;

        while(l<=r){
            long mid=l+((r-l)/2);
            long cntb=mid/B;
            long cntc=mid/C;
            long cntbc=mid/lcm;

            if(cntb + cntc - cntbc >= A){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return (int)(ans%1000000007);
    }
}

 */