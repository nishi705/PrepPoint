package main.Advance.Backtracking;
/*
Problem Description
Given a digit string A, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.



The digit 0 maps to 0 itself. The digit 1 maps to 1 itself.

NOTE: Make sure the returned strings are lexicographically sorted.



Problem Constraints
1 <= |A| <= 10



Input Format
The only argument is a digit string A.



Output Format
Return a string array denoting the possible letter combinations.



Example Input
Input 1:

 A = "23"
Input 2:

 A = "012"


Example Output
Output 1:

 ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
Output 2:

 ["01a", "01b", "01c"]


Example Explanation
Explanation 1:

 There are 9 possible letter combinations.
Explanation 2:

 Only 3 possible letter combinations.
 */
public class Letter_Phone {
}
/*
public class Solution {

ArrayList<String> ans;

public ArrayList<String> letterCombinations(String A) {

ans = new ArrayList<String>();
StringBuilder sb = new StringBuilder();

HashMap<Integer, ArrayList<Character>> map = new HashMap<Integer, ArrayList<Character>>();
map.put(0, new ArrayList<>(Arrays.asList('0')));
map.put(1, new ArrayList<>(Arrays.asList('1')));
map.put(2, new ArrayList<>(Arrays.asList('a','b','c')));
map.put(3, new ArrayList<>(Arrays.asList('d','e','f')));
map.put(4, new ArrayList<>(Arrays.asList('g','h','i')));
map.put(5, new ArrayList<>(Arrays.asList('j','k','l')));
map.put(6, new ArrayList<>(Arrays.asList('m','n','o')));
map.put(7, new ArrayList<>(Arrays.asList('p','q','r','s')));
map.put(8, new ArrayList<>(Arrays.asList('t','u','v')));
map.put(9, new ArrayList<>(Arrays.asList('w','x','y','z')));

combination(A, map, sb, 0);

return ans;
}

public void combination(String A, HashMap<Integer, ArrayList<Character>> map, StringBuilder sb, int currentPos) {

if(sb.length()==A.length()) {
ans.add(sb.toString());
return;
}

ArrayList<Character> charList = map.get(A.charAt(currentPos)-'0');
for(int i=0; i<charList.size(); i++)
{
sb.append(charList.get(i));
combination(A, map, sb, currentPos+1);
sb.deleteCharAt(sb.length()-1);
}
}
}
 */