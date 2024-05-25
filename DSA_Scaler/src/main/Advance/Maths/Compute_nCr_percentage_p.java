package main.Advance.Maths;
/*
Problem Description
Given three integers A, B, and C, where A represents n, B represents r, and C represents p and p is a prime number greater than equal to n, find and return the value of nCr % p where nCr % p = (n! / ((n-r)! * r!)) % p.

x! means factorial of x i.e. x! = 1 * 2 * 3... * x.

NOTE: For this problem, we are considering 1 as a prime.



Problem Constraints
1 <= A <= 106
1 <= B <= A
A <= C <= 109+7


Input Format
The first argument given is the integer A ( = n).
The second argument given is the integer B ( = r).
The third argument given is the integer C ( = p).



Output Format
Return the value of nCr % p.



Example Input
Input 1:

 A = 5
 B = 2
 C = 13
Input 2:

 A = 6
 B = 2
 C = 13


Example Output
Output 1:

 10
Output 2:

 2


Example Explanation
Explanation 1:

 nCr( n=5 and r=2) = 10.
 p=13. Therefore, nCr%p = 10.
 */
public class Compute_nCr_percentage_p {
}
/*
public class Solution {
    long fact(int A,int C){
        if(A==0)return 1;
       long factsum = 1;
        for(int i=1;i<=A;i++){
           factsum=(factsum*i)%C;
        }
     return factsum%C;
    }
    int pow(int A,int B,int C){

       if(A==0)return 0;
       if(B==0)return 1;

       long p = pow(A,B/2,C)%C;
       p = (p*p)%C;

       if((B%2)!=0){
           p=(p*A)%C;
       }
       return (int)p%C;

    }
    public int solve(int A, int B, int C) {
        long factA = fact(A,C);
        int factB = (int)fact(B,C);
        long aminusbFact= fact((A-B),C);
        long x = ((long)pow(factB,C-2,C)%C * pow((int)aminusbFact,C-2,C)%C)%C;
        return (int) ((factA * x) % C);

}
}
 */