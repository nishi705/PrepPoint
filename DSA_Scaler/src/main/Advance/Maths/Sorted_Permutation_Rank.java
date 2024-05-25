package main.Advance.Maths;
/*
Problem Description
Given a string A. Find the rank of the string amongst its permutations sorted lexicographically.
Assume that no characters are repeated.

Note: The answer might not fit in an integer, so return your answer % 1000003



Problem Constraints
1 <= |A| <= 1000



Input Format
First argument is a string A.



Output Format
Return an integer denoting the rank of the given string.



Example Input
Input 1:

A = "acb"
Input 2:

A = "a"


Example Output
Output 1:

2
Output 2:

1


Example Explanation
Explanation 1:

Given A = "acb".
The order permutations with letters 'a', 'c', and 'b' :
abc
acb
bac
bca
cab
cba
So, the rank of A is 2.
Explanation 2:

Given A = "a".
Rank is clearly 1.
 */
public class Sorted_Permutation_Rank {
}
/*
public class Solution {
    static long fact(long a){
        //if(a==0)return 1;
        long getfact =1;
        for(int i=1;i<=a;i++){
            getfact = (getfact*i)%1000003;
        }
        return getfact%1000003;
    }
    public int findRank(String A) {
       long n = A.length();
        String s1 = A;

        char[] c = A.toCharArray();
        Arrays.sort(c);

        ArrayList<Character> al = new ArrayList<>();
        for(int i=0;i<c.length;i++){
            al.add(c[i]);
        }
        long total = 1;
        for(int i=0;i<A.length();i++){
            long len = n-1;
            len = len - i;
            char c1 = A.charAt(i);
            long count = 0;
            for(int j=0;j<al.size();j++){
                if(c1==al.get(j)){
                    al.remove(al.get(j));
                    break;
                }else{
                    count++;
                }
            }
            total = (total + ((fact(len)*count)%1000003))%1000003;
        }
        total = total+1000003;
        total = total%1000003;
         return (int)total;
    }
}

 */