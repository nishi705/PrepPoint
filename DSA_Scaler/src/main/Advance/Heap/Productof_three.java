package main.Advance.Heap;
/*
Problem Description
Given an integer array A of size N.

You have to find the product of the three largest integers in array A from range 1 to i, where i goes from 1 to N.

Return an array B where B[i] is the product of the largest 3 integers in range 1 to i in array A. If i < 3, then the integer at index i in B should be -1.



Problem Constraints
1 <= N <= 105
0 <= A[i] <= 103



Input Format
First and only argument is an integer array A.



Output Format
Return an integer array B. B[i] denotes the product of the largest 3 integers in range 1 to i in array A.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [10, 2, 13, 4]


Example Output
Output 1:

 [-1, -1, 6, 24, 60]
Output 2:

 [-1, -1, 260, 520]


Example Explanation
Explanation 1:

 For i = 1, ans = -1
 For i = 2, ans = -1
 For i = 3, ans = 1 * 2 * 3 = 6
 For i = 4, ans = 2 * 3 * 4 = 24
 For i = 5, ans = 3 * 4 * 5 = 60

 So, the output is [-1, -1, 6, 24, 60].

Explanation 2:

 For i = 1, ans = -1
 For i = 2, ans = -1
 For i = 3, ans = 10 * 2 * 13 = 260
 For i = 4, ans = 10 * 13 * 4 = 520

 So, the output is [-1, -1, 260, 520].


 */
public class Productof_three {
}
/*
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> al = new ArrayList<>();
        PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<A.size();i++){
            max_heap.add(A.get(i));
            if(i<2){
                al.add(-1);
            }else{
                int a = max_heap.poll();
                int b = max_heap.poll();
                int c = max_heap.poll();
                al.add(a*b*c);
                max_heap.add(a);
                max_heap.add(b);
                max_heap.add(c);
            }
        }

        return al;
    }
}

 */