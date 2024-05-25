package main.Intermediate.Subsequence_and_subset;
/*
Problem Description

Little Ponny has been given a string A, and he wants to find out the lexicographically minimum subsequence from it of size >= 2. Can you help him?

A string a is lexicographically smaller than string b, if the first different letter in a and b is smaller in a. For example, "abc" is lexicographically smaller than "acc" because the first different letter is 'b' and 'c' which is smaller in "abc".





Problem Constraints

1 <= |A| <= 105

A only contains lowercase alphabets.



Input Format

The first and the only argument of input contains the string, A.



Output Format

Return a string representing the answer.



Example Input

Input 1:

 A = "abcdsfhjagj"
Input 2:

 A = "ksdjgha"


Example Output

Output 1:

 "aa"
Output 2:

 "da"


Example Explanation

Explanation 1:

 "aa" is the lexicographically minimum subsequence from A.
Explanation 2:

 "da" is the lexicographically minimum subsequence from A.
 */
public class Little_Ponny_and_two_Subsequence {
}
/*
public class Solution {
    public String solve(String A) {
         int n = A.length();
        char min='z',max ='z';
        String res = "";
        for(int i=0 ; i < n ; i++){
            if( i != n-1 && A.charAt(i) < min){
                min = A.charAt(i);
            }else if( i != 0 && A.charAt(i)< max){
                max = A.charAt(i) ;
            }

        }
        res = res + min;
        res = res + max;
        return res;
    }
}

 */