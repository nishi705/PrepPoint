package main.Advance.Stack;
/*
Problem Description
Given two strings A and B. Each string represents an expression consisting of lowercase English alphabets, '+', '-', '(' and ')'.

The task is to compare them and check if they are similar. If they are identical, return 1 else, return 0.

NOTE: It may be assumed that there are at most 26 operands from ‘a’ to ‘z’, and every operand appears only once.



Problem Constraints
1 <= length of the each String <= 100



Input Format
The given arguments are string A and string B.



Output Format
Return 1 if they represent the same expression else return 0.



Example Input
Input 1:

 A = "-(a+b+c)"
 B = "-a-b-c"
Input 2:

 A = "a-b-(c-d)"
 B = "a-b-c-d"


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 The expression "-(a+b+c)" can be written as "-a-b-c" which is equal as B.
Explanation 2:

 Both the expression are different.

 */
public class Check_two_bracket_expressions {
}
/*
public class Solution {
    public int solve(String A, String B) {
        char[] set1 = simplify(A);
        char[] set2 = simplify(B);

        return Arrays.equals(set1, set2) ? 1 : 0;
    }

    public char[] simplify(String A){
        char sign = ‘+’;
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        char chArr[] = new char[26];
        st.push(’+’);

        for(char c : A.toCharArray()){
            if(c == ‘-’ || c == ‘+’) sign = c;
            else if(c >= ‘a’ && c <= ‘z’){
                char signOfOperand = ‘+’;
                if(st.peek() == sign) signOfOperand = ‘+’;
                else signOfOperand = ‘-’;
                chArr[c - ‘a’] = signOfOperand;
            }else{
                if(c == ‘(’){
                    if(st.peek() == sign) st.push(’+’);
                    else st.push(’-’);
                    sign = ‘+’;
                }else{
                    st.pop();
                }
            }
        }

        return chArr;
    }
}
 */