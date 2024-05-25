package main.Advance.Stack;
/*
Problem Description
Given an array of integers A.

The value of an array is computed as the difference between the maximum element in the array and the minimum element in the array A.

Calculate and return the sum of values of all possible subarrays of A modulo 109+7.



Problem Constraints
1 <= |A| <= 100000

1 <= A[i] <= 1000000



Input Format
The first and only argument given is the integer array A.



Output Format
Return the sum of values of all possible subarrays of A modulo 109+7.



Example Input
Input 1:

 A = [1]
Input 2:

 A = [4, 7, 3, 8]


Example Output
Output 1:

 0
Output 2:

 26


Example Explanation
Explanation 1:

Only 1 subarray exists. Its value is 0.
Explanation 2:

value ( [4] ) = 4 - 4 = 0
value ( [7] ) = 7 - 7 = 0
value ( [3] ) = 3 - 3 = 0
value ( [8] ) = 8 - 8 = 0
value ( [4, 7] ) = 7 - 4 = 3
value ( [7, 3] ) = 7 - 3 = 4
value ( [3, 8] ) = 8 - 3 = 5
value ( [4, 7, 3] ) = 7 - 3 = 4
value ( [7, 3, 8] ) = 8 - 3 = 5
value ( [4, 7, 3, 8] ) = 8 - 3 = 5
sum of values % 10^9+7 = 26
 */
public class MAX_and_MIN {
}
/*
public class Solution {
    public int solve(int[] A) {
        int mod = 1000 * 1000 * 1000 + 7;
        Stack<Integer> stack = new Stack<>();
       int[] nsl = new int[A.length];
        for(int i=0;i<A.length;i++){
            while(!stack.isEmpty() && A[stack.peek()]>=A[i]){
                stack.pop();
            }if(stack.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        //NSR next smaller element on right side
        int[] nsr = new int[A.length];
        for(int i=A.length-1;i>=0;i--){
            while(!stack.isEmpty() && A[stack.peek()]>=A[i]){
                stack.pop();
            }if(stack.isEmpty()){
                nsr[i] = A.length;
            }else{
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        //NGL next greatest element on the left side
        int[] ngl = new int[A.length];
        for(int i=0;i<A.length;i++){
            while(!stack.isEmpty() && A[stack.peek()]<=A[i]){
                stack.pop();
            }if(stack.isEmpty()){
                ngl[i] = -1;
            }else{
                ngl[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        //NGR next greates element on the right side
        int[] ngr = new int[A.length];
        for(int i=A.length-1;i>=0;i--){
            while(!stack.isEmpty() && A[stack.peek()]<=A[i]){
                stack.pop();
            }if(stack.isEmpty()){
                ngr[i] = A.length;
            }else{
                ngr[i] = stack.peek();
            }
            stack.push(i);
        }


        long ans = 0;
     for (int i = 0; i < A.length; i++) {

      //subarray in which A[i] is min
      int p1 = nsl[i];
      int p2 = nsr[i];
      long x = (1L*(i - p1) * (p2 - i))%mod;
      long x1 = (x * A[i]) % mod;

      int p3 = ngl[i];
      int p4 = ngr[i];
      long y = (1L*(i - p3) * (p4 - i)) % mod;
      long y1 = (y * A[i]) % mod;


      ans = (ans%mod)+((y1-x1)%mod);
      ans = ans%mod;
    }
    if (ans<0) {
      ans = (ans+mod)%mod;
    }
    return (int)(ans%mod);

    }
}

 */