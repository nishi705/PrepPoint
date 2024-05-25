package main.Advance.Queue;
/*
Problem Description
Given an integer A, you have to find the Ath Perfect Number.

A Perfect Number has the following properties:

It comprises only 1 and 2.
The number of digits in a Perfect number is even.
It is a palindrome number.
For example, 11, 22, 112211 are Perfect numbers, where 123, 121, 782, 1 are not.



Problem Constraints
1 <= A <= 100000



Input Format
The only argument given is an integer A.



Output Format
Return a string that denotes the Ath Perfect Number.



Example Input
Input 1:

 A = 2
Input 2:

 A = 3


Example Output
Output 1:

 22
Output 2:

 1111


Example Explanation
Explanation 1:

First four perfect numbers are:
1. 11
2. 22
3. 1111
4. 1221
Return the 2nd Perfect number.
Explanation 2:

First four perfect numbers are:
1. 11
2. 22
3. 1111
4. 1221
Return the 3rd Perfect number.
 */
public class Perfect_Numbers {
}
/*
public class Solution {
    public String solve(int A) {
        Queue<Long> q = new LinkedList<>();

        if(A==1)return "11";
        if(A==2)return "22";
        int count =0;
        count+=2;
        q.add(1L);
        q.add(2l);

        while(count<=A){
            long x = q.poll();
            x=x*10;
            q.add(x+1);
            q.add(x+2);
            count+=1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(""+q.poll());

        return sb.toString()+sb.reverse().toString();
    }
}

 */