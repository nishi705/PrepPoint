package main.Advance.Dynamic_Programming;
/*
Problem Description
Given a positive integer A, write a program to find the Ath Fibonacci number.

In a Fibonacci series, each term is the sum of the previous two terms and the first two terms of the series are 0 and 1. i.e. f(0) = 0 and f(1) = 1. Hence, f(2) = 1, f(3) = 2, f(4) = 3 and so on.

NOTE: 0th term is 0. 1th term is 1 and so on.



Problem Constraints
0 <= A <= 44



Input Format
First and only argument is an integer A.



Output Format
Return an integer denoting the Ath Fibonacci number.



Example Input
Input 1:

 A = 4
Input 2:

 A = 6


Example Output
Output 1:

 3
Output 2:

 8
 */
public class Fibonacci_Number {
}
/*
import java.lang.*;
import java.util.*;

public class Main {
    static int[] dp = new int[45];
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = fib(n);
        System.out.print(ans);

    }
    static int fib(int n){
        if(n<=1){
            dp[n] =n;
        return dp[n];
        }
        if(dp[n]!=0){
            return dp[n];
        }
        else{
            dp[n] = fib(n-1) + fib(n-2);
            return dp[n];
        }

    }
}
 */