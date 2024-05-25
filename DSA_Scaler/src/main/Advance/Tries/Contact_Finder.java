package main.Advance.Tries;
/*
Problem Description

We want to make a custom contacts finder applications as part of our college project. The application must perform two types of operations:

Type 1: Add name B[i] ,denoted by 0 in vector A where B[i] is a string in vector B denoting a contact name. This must store B[i] as a new contact in the application.

Type 2: Find partial for B[i] ,denoted by 1 in vector A where B[i] is a string in vector B denoting a partial name to search the application for. It must count the number of contacts starting with B[i].

You have been given sequential add and find operations. You need to perform each operation in order.

And return as an array of integers, answers for each query of type 2(denoted by 1 in A) .



Problem Constraints

1 <= |A| <= 10000

1 <= |length of strings in B| <= 10



Input Format

First argument is the vector A, which denotes the type of query.

Second argument is the vector B, which denotes the string for corresponding query.



Output Format

Return an array of integers, denoting answers for each query of type 1.



Example Input

Input 1:

A = [0, 0, 1, 1]
B = ["hack", "hacker", "hac", "hak"]
Input 2:

A = [0, 1]
B = ["abcde", "abc"]


Example Output

Output 1:


[2, 0]
Output 2:

[1]


Example Explanation

Explanation 1:


We perform the following sequence of operations:
Add a contact named "hack".
Add a contact named "hacker".
Find the number of contact names beginning with "hac". There are currently two contact names in the application and both of them start with "hac", so we have 2.
Find the number of contact names beginning with "hak". There are currently two contact names in the application but neither of them start with "hak", so we get0.
Explanation 2:


Add "abcde"
Find words with prefix "abc". We have answer as 1.
 */
public class Contact_Finder {
}
/*
public class Solution {
public static class Node{
public Node link [] = new Node[26];
public boolean isEnd = false;
public int freq =0;
public Node() {
}
public boolean containsKey(char ch) {
return (link[ch-'a']!=null);
}
public void put(char ch, Node node) {
link[ch-'a']=node;
}
public Node get(char ch) {
return link[ch-'a'];
}
void setEnd() {
isEnd = true;
}
boolean getEnd() {
return isEnd;
}

public int getFreq() {
return freq;
}
}
public static void insert(String word,Node root) {
Node node = root;
for (int i = 0; i < word.length(); i++) {
if (!node.containsKey(word.charAt(i))) {
node.put(word.charAt(i), new Node());
}
node = node.get(word.charAt(i));
node.freq++;
}
node.setEnd();
}

public static int prefixSearch(String word,Node root) {
Node node = root;
for (int i = 0; i < word.length(); i++) {
if (!node.containsKey(word.charAt(i))) {
return 0;
}
node = node.get(word.charAt(i));
}
return node.freq;
}
public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<String> B) {
int n = A.size();
int m = B.size();
ArrayList ans = new ArrayList<>();
int cnt =0;
Node root = new Node();
for(int i = 0; i < n; i++) {
if(A.get(i)==0){
insert(B.get(i),root);
}else{
ans.add(prefixSearch(B.get(i),root));
}
}
return ans;
}
}
 */