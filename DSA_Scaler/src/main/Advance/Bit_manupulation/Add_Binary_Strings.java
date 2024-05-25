package main.Advance.Bit_manupulation;
/*
Problem Description
Given two binary strings A and B. Return their sum (also a binary string).


Problem Constraints
1 <= length of A <= 105

1 <= length of B <= 105

A and B are binary strings



Input Format
The two argument A and B are binary strings.



Output Format
Return a binary string denoting the sum of A and B



Example Input
Input 1:
A = "100"
B = "11"
Input 2:
A = "110"
B = "10"


Example Output
Output 1:
"111"
Output 2:
"1000"


Example Explanation
For Input 1:
The sum of 100 and 11 is 111.
For Input 2:

The sum of 110 and 10 is 1000.
 */
public class Add_Binary_Strings {
}
/*
public class Solution {
    public String addBinary(String A, String B) {

        StringBuilder sb = new StringBuilder();

        int i = A.length()-1;
        int j = B.length()-1;
        int s=0;

        while(i>=0 || j>=0 || s==1){
            s+=((i>=0)?A.charAt(i) - '0':0);
            s+=((j>=0)?B.charAt(j) - '0':0);
            sb.append((char)(s%2 +'0'));
            s/=2;
            i--;
            j--;

        }
        return sb.reverse().toString();
    }
}

 */