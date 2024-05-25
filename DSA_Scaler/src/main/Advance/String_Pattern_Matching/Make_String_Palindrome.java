package main.Advance.String_Pattern_Matching;
/*
Problem Description
Given a string A of size N consisting only of lowercase alphabets. The only operation allowed is to insert characters in the beginning of the string.

Find and return how many minimum characters are needed to be inserted to make the string a palindrome string.



Problem Constraints
1 <= N <= 106



Input Format
The only argument given is a string A.



Output Format
Return an integer denoting the minimum characters needed to be inserted in the beginning to make the string a palindrome string.



Example Input
Input 1:

 A = "abc"
Input 2:

 A = "bb"


Example Output
Output 1:

 2
Output 2:

 0


Example Explanation
Explanation 1:

 Insert 'b' at beginning, string becomes: "babc".
 Insert 'c' at beginning, string becomes: "cbabc".
Explanation 2:

 There is no need to insert any character at the beginning as the string is already a palindrome.
 */
public class Make_String_Palindrome {
}
/*
public class Solution {

    public int solve(String A) {

        StringBuilder sb = new StringBuilder(A);
        sb.reverse();

      String  s = A+"$"+sb;

      int[] LPS = new int[s.length()];
      createLPS(s,LPS);

      return A.length() - LPS[LPS.length-1];
    }
    void createLPS(String s,int[] LPS){

        LPS[0] = 0;

        for(int i=1;i<LPS.length;i++){

            int x = LPS[i-1];
            while(s.charAt(i)!=s.charAt(x)){
                if(x==0){x=-1;
                break;}
                  x= LPS[x-1];
            }
            LPS[i] = x+1;
        }
    }
}

 */