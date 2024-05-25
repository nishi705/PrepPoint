package main.Advance.Tries;
/*
Problem Description
Given an array, A of integers of size N. Find the subarray AL, AL+1, AL+2, ... AR with 1<=L<=R<=N, which has maximum XOR value.

NOTE: If there are multiple subarrays with the same maximum value, return the subarray with minimum length. If the length is the same, return the subarray with the minimum starting index.



Problem Constraints
1 <= N <= 100000
0 <= A[i] <= 109



Input Format
First and only argument is an integer array A.



Output Format
Return an integer array B of size 2. B[0] is the starting index(1-based) of the subarray and B[1] is the ending index(1-based) of the subarray.



Example Input
Input 1:

 A = [1, 4, 3]
Input 2:

 A = [8]


Example Output
Output 1:

 [2, 3]
Output 2:

 [1, 1]


Example Explanation
Explanation 1:

 There are 6 possible subarrays of A:
 subarray            XOR value
 [1]                     1
 [4]                     4
 [3]                     3
 [1, 4]                  5 (1^4)
 [4, 3]                  7 (4^3)
 [1, 4, 3]               6 (1^4^3)

 [4, 3] subarray has maximum XOR value. So, return [2, 3].
Explanation 2:

 There is only one element in the array. So, the maximum XOR value is equal to 8 and the only possible subarray is [1, 1].
 */
public class Maximum_XOR_Subarray {
}
/*
class Pair{
int lxor;
int idx;
Pair(int a,int b){
lxor = a;
idx = b;
}
}
class Trie{
boolean isEof;
HashMap<Integer,Trie> children;
int n;
Trie(){
isEof = false;
children = new HashMap<>();
n =0;
}
public void insert(int a,int n,int i){
Trie node = this;
while(n >= 0){
int temp = ((a & (1<<n)) !=0) ? 1:0;
if(!node.children.containsKey(temp)) node.children.put(temp,new Trie());
node = node.children.get(temp);
n--;
}
node.isEof=true;
node.n = i;
// System.out.println(i+" "+a);
}
public Pair search(int a,int n){
Trie node = this;
int lxor = 0,idx =0;
while(n >=0){
int temp = a & (1<<n);
if(temp!=0){
if(node.children.containsKey(0)){
lxor = lxor | (1<<n);
node = node.children.get(0);
}
else
node = node.children.get(1);
}
else{
if(node.children.containsKey(1)){
lxor = lxor | (1<<n);
node = node.children.get(1);
}
else
node = node.children.get(0);
}
n--;
if(node.isEof==true)
idx = node.n;
}
Pair p = new Pair(lxor,idx);
return p;
}
}
public class Solution {
public ArrayList<Integer> solve(ArrayList<Integer> A) {
ArrayList<Integer> pfXor = new ArrayList<>();
ArrayList<Integer> res = new ArrayList<>();
Trie root = new Trie();
pfXor.add(0);
for(int i=1;i<=A.size();i++) pfXor.add(pfXor.get(i-1) ^ A.get(i-1));
int maxi = Collections.max(pfXor);
int count = 0,l=1,r=1,lmin=0,rmin=A.size();
while (maxi != 0) {
count++;
maxi >>= 1;
}
maxi=0;
for(int i=0;i<pfXor.size();i++) root.insert(pfXor.get(i),count-1,i);
for(int i=0;i<pfXor.size();i++) {
Pair temp = root.search(pfXor.get(i),count-1);
l = Math.min(temp.idx,i)+1;
r = Math.max(temp.idx,i);
if(maxi< temp.lxor || (maxi==temp.lxor && Math.abs(l-r)<Math.abs(lmin-rmin))) {
lmin=l;
rmin=r;
maxi=temp.lxor;
}
}
res.add(lmin);
res.add(rmin);
return res;
}
}
 */