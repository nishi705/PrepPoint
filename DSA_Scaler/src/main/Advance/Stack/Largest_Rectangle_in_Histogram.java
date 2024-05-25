package main.Advance.Stack;
/*
Problem Description
Given an array of integers A.

A represents a histogram i.e A[i] denotes the height of the ith histogram's bar. Width of each bar is 1.

Find the area of the largest rectangle formed by the histogram.



Problem Constraints
1 <= |A| <= 100000

1 <= A[i] <= 10000



Input Format
The only argument given is the integer array A.



Output Format
Return the area of the largest rectangle in the histogram.



Example Input
Input 1:

 A = [2, 1, 5, 6, 2, 3]
Input 2:

 A = [2]


Example Output
Output 1:

 10
Output 2:

 2


Example Explanation
Explanation 1:

The largest rectangle has area = 10 unit. Formed by A[3] to A[4].
Explanation 2:

Largest rectangle has area 2.

 */
public class Largest_Rectangle_in_Histogram {
}
/*
public class Solution {
    public int largestRectangleArea(int[] A) {
        //if(A.length==1)return A[0];
        int[] nsr = new int[A.length];
        int[] nsl = new int[A.length];

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<A.length;i++){
            while(!stack.isEmpty() && A[stack.peek()]>=A[i]){
                stack.pop();
            }if(stack.isEmpty()){
                nsl[i] =-1;
            }else{
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }

       stack.clear();
        for(int i=A.length-1; i>=0; i--){
            while(!stack.isEmpty() && A[stack.peek()]>=A[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nsr[i] = A.length;
            }
            else{
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }

        int sum=0;
        for(int i=0;i<A.length;i++){
            sum=Math.max(A[i]*Math.abs(nsr[i]-nsl[i]-1),sum);
        }
        return sum;
    }
}

 */