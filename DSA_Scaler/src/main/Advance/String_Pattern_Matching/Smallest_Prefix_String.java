package main.Advance.String_Pattern_Matching;
/*
Problem Description
Given 2 strings A and B of size N and M respectively consisting of lowercase alphabets, find the lexicographically smallest string that can be formed by concatenating non-empty prefixes of A and B (in that order).
Note: The answer string has to start with a non-empty prefix of string A followed by a non-empty prefix of string B.



Problem Constraints
1 <= N, M <= 100000



Input Format
The first argument is a string A of size N.
The second argument is a string B of size M.



Output Format
Return lexicographically smallest string that can be formed by concatenating non-empty prefixes of A and B (in that order).



Example Input
Input 1:

 A = "abba"
 B = "cdd"
Input 2:

 A = "acd"
 B = "bay"


Example Output
Output 1:

 "abbac"
Output 2:

 "ab"


Example Explanation
Explanation 1:

 We can concatenate prefix of A i.e "abba" and prefix of B i.e "c".
 The lexicographically smallest string will be "abbac".
Explanation 2:

 We can concatenate prefix of A i.e "a" and prefix of B i.e "b".
 The lexicographically smallest string will be "ab".
 */
public class Smallest_Prefix_String {
}
/*
public class Solution {
    public String smallestPrefix(String A, String B) {
        String ans ="";
        ans+=A.charAt(0);
        char val = B.charAt(0);


        int i=1;
        while(i<A.length()&& A.charAt(i)<=val){
          ans+=A.charAt(i);
       if(A.charAt(i)==val)return ans;

          i++;
        }
        ans+=val;

        return ans;


    }
}

 */