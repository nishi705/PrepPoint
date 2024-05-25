package main.Advance.soritng;
/*
Problem Description
Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.

Note: A linear time complexity is expected and you should avoid use of any library function.


Problem Constraints
-2×109 <= A[i], B[i] <= 2×109
1 <= |A|, |B| <= 5×104


Input Format
First Argument is a 1-D array representing  A.
Second Argument is also a 1-D array representing B.


Output Format
Return a 1-D vector which you got after merging A and B.


Example Input
Input 1:

A = [4, 7, 9]
B = [2, 11, 19]
Input 2:

A = [1]
B = [2]


Example Output
Output 1:

[2, 4, 7, 9, 11, 19]
Output 2:

[1, 2]


Example Explanation
Explanation 1:

Merging A and B produces the output as described above.
Explanation 2:

 Merging A and B produces the output as described above.
 */
public class Merge_Two_Sorted_Arrays {
}
/*
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {

        ArrayList<Integer> al = new ArrayList<>();
        int M = A.size();
        int N = B.size();

        int i=0;
        int j=0;
        int k=0;

        while(i<M && j<N){
            if(A.get(i)<B.get(j)){
                al.add(A.get(i));
                i++;
                k++;
            }else{
                al.add(B.get(j));
                k++;
                j++;
            }
        }

        while(i<M){
            al.add(A.get(i));
            i++;
            k++;
        }

        while(j<N){
            al.add(B.get(j));
            j++;
            k++;
        }

        return al;
    }
}

 */