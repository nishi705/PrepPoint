package main.Advance.soritng;
/*
Problem Description
Given an array A of non-negative integers of size N. Find the minimum sub-array Al, Al+1 ,..., Ar such that if we sort(in ascending order) that sub-array, then the whole array should get sorted. If A is already sorted, output -1.

Note :
Follow 0-based indexing, while returning the sub-array's starting and ending indexes.



Problem Constraints
1 <= N <= 106
1 <= A[i] <= 106



Input Format
First and only argument is an array of non-negative integers of size N.



Output Format
Return an array of length two where,
the first element denotes the starting index(0-based) and
the second element denotes the ending index(0-based) of the sub-array.
If the array is already sorted, return an array containing only one element i.e. -1.


Example Input
Input 1:

A = [1, 3, 2, 4, 5]
Input 2:

A = [1, 2, 3, 4, 5]


Example Output
Output 1:

[1, 2]
Output 2:

[-1]


Example Explanation
Explanation 1:

If we sort the sub-array [A1, A2] then the whole array A gets sorted.
Explanation 2:

A is already sorted.
 */
public class Maximum_Unsorted_Subarray {
}
/*
public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        int start =0;
        int end =0;
        int j=0;
        for(j=0;j<A.size()-1;j++){
            if(A.get(j)>A.get(j+1)){
                start = j;
                break;
            }
        }

        ArrayList<Integer> al = new ArrayList<>();
         if(j==A.size()-1){
             al.add(-1);
             return al;
         }
        for(int i=A.size()-1;i>0;i--){
            if(A.get(i)<A.get(i-1)){
                end =i;
                break;
            }
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=start;i<=end;i++){
            min = Math.min(min,A.get(i));
            max = Math.max(max,A.get(i));
        }

        for(int i=0;i<A.size();i++){
            if(A.get(i)>min){
                start =i;
                break;
            }
        }

        for(int i=A.size()-1;i>=0;i--){
            if(A.get(i)<max){
                end = i;
                break;
            }
        }


        al.add(0,start);
        al.add(1,end);

        return al;


    }
}

 */