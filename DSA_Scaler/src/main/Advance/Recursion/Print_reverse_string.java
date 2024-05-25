package main.Advance.Recursion;
/*
Problem Description
Write a recursive function that takes a string, S, as input and prints the characters of S in reverse order.



Problem Constraints
1 <= |s| <= 1000



Input Format
First line of input contains a string S.



Output Format
Print the character of the string S in reverse order.



Example Input
Input 1:

 scaleracademy
Input 2:

 cool


Example Output
Output 1:

 ymedacarelacs
Output 2:

 looc


Example Explanation
Explanation:

 Print the reverse of the string in a single line.
 */
public class Print_reverse_string {
}
/*
import java.lang.*;
import java.util.*;

public class Main {
    static void reverseString(String s){
        if(s==null||s.length() <= 1){
            System.out.print(s);
        }else{
            System.out.print(s.charAt(s.length()-1));
            reverseString(s.substring(0,s.length()-1));
        }
    }
    public static void main(String[] args) {

       Scanner scn = new Scanner(System.in);
       String s = scn.next();

       reverseString(s);

    }
}
 */