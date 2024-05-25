package main.Advance.Queue;
/*
Problem Description
Given an array of integers A and an integer B, we need to reverse the order of the first B elements of the array,
leaving the other elements in the same relative order.

NOTE: You are required to the first insert elements into an auxiliary queue then perform Reversal of first B elements.


Problem Constraints
1 <= B <= length of the array <= 500000
1 <= A[i] <= 100000


Input Format
The argument given is the integer array A and an integer B.


Output Format
Return an array of integer after reversing the first B elements of A using queue.


Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
 B = 3
Input 2:

 A = [5, 17, 100, 11]
 B = 2


Example Output
Output 1:

 [3, 2, 1, 4, 5]
Output 2:

 [17, 5, 100, 11]


Example Explanation
Explanation 1:

 Reverse first 3 elements so the array becomes [3, 2, 1, 4, 5]
Explanation 2:

 Reverse first 2 elements so the array becomes [17, 5, 100, 11]
 */
public class Reversing_Elements_Of_Queue {
}
/*
public class Solution {
    public int[] solve(int[] A, int B) {

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<A.length;i++){
            q.add(A[i]);
        }
    Stack<Integer> stack = new Stack<>();
        int count=0;
        while(count<B){
            stack.push(q.poll());
            count++;
        }

        while(!stack.isEmpty()){
            q.add(stack.pop());
        }

        int size = q.size()-B;
        while(size!=0){
            q.add(q.poll());
            size--;
        }

        for(int i=0;i<A.length;i++){
            A[i] = q.poll();
        }


return A;


    }
}

 */