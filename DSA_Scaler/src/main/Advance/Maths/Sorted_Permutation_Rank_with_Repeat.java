package main.Advance.Maths;
/*
Problem Description
Given a string A, find the rank of the string amongst its permutations sorted lexicographically.

Note that the characters might be repeated. If the characters are repeated, we need to look at the rank in unique permutations.

Look at the example for more details.

NOTE:

The answer might not fit in an integer, so return your answer % 1000003 where 1000003 is a prime number.
String A can consist of both lowercase and uppercase letters. Characters with lesser ASCII values are considered smaller, i.e., 'a' > 'Z'.


Problem Constraints
1 <= len(A) <= 1000000



Input Format
First argument is a string A.



Output Format
Return an integer denoting the rank.



Example Input
Input 1:

 A = "aba"
Input 2:

 A = "bca"


Example Output
Output 1:

 2
Output 2:

 4


Example Explanation
Explanation 1:

 The order permutations with letters 'a', 'a', and 'b' :
    aab
    aba
    baa
 So, the rank is 2.
Explanation 2:

 The order permutations with letters 'a', 'b', and 'c' :
    abc
    acb
    bac
    bca
    cab
    cba
 So, the rank is 4.
 */
public class Sorted_Permutation_Rank_with_Repeat {
}
/*
long long factorial(int num, int modulo) {
long long fact = 1;
for(int i=1;i<=num;i++) {
fact = (i * fact) % modulo;
}
return fact;
}
long long fastExponentiation(int base, int exponent, int modulo) {
if(exponent == 0) {
return 1;
}
long long halfPow = fastExponentiation(base, exponent/2, modulo);
halfPow = ( halfPow * halfPow ) % modulo;
if(exponent % 2 == 1) {
return (halfPow * base) % modulo;
}
return halfPow;
}
int Solution::findRank(string A) {
int mod = 1000003;
int len = A.size();
long long ans = 0;
vector<int> arr(58, -1);
for(int i=0;i<len;i++) {
int ind = A[i] - 'A';
if(arr[ind] == -1) {
arr[ind] = 1;
} else {
arr[ind]++;
}
}
for(int i=0;i<len;i++) {
char ch = A[i];
int ind = ch - 'A';
if(arr[ind] == 1) {
arr[ind] = 0;
} else {
arr[ind]--;
}
int countOFCharsNotVisited = 0;
for(int j=0;j<ind;j++) {
if(arr[j] > 0) {
countOFCharsNotVisited += arr[j];
}
}
if(countOFCharsNotVisited != 0) {
long long numOfPermutations = factorial(len - i - 1, mod);
for(int j=0;j<58;j++) {
int currNum = j!=ind ? arr[j] : arr[j]+1;
long long factCurrNum = 1;
if (currNum > 1) {
for(int i=1;i<=currNum;i++) {
factCurrNum = (factCurrNum*i)%mod;
}
long long factCurrNumExp = fastExponentiation(factCurrNum, mod-2, mod);
numOfPermutations = ( numOfPermutations * factCurrNumExp ) % mod;
}
}
long long count = ( numOfPermutations * countOFCharsNotVisited ) % mod;
ans = ( ans + count)%mod;
}
if(countOFCharsNotVisited == 0 && i == len-1) {
ans = (ans+1)%mod;
}
}
return ans;
}
 */