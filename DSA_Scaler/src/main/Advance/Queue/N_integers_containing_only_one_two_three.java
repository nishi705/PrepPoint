package main.Advance.Queue;
/*
Problem Description
Given an integer, A. Find and Return first positive A integers in ascending order containing only digits 1, 2, and 3.

NOTE: All the A integers will fit in 32-bit integers.



Problem Constraints
1 <= A <= 29500



Input Format
The only argument given is integer A.



Output Format
Return an integer array denoting the first positive A integers in ascending order containing only digits 1, 2 and 3.



Example Input
Input 1:

 A = 3
Input 2:

 A = 7


Example Output
Output 1:

 [1, 2, 3]
Output 2:

 [1, 2, 3, 11, 12, 13, 21]


Example Explanation
Explanation 1:

 Output denotes the first 3 integers that contains only digits 1, 2 and 3.
Explanation 2:

 Output denotes the first 7 integers that contains only digits 1, 2 and 3.
 */
public class N_integers_containing_only_one_two_three {
}
/*
public class Solution {
    public ArrayList<Integer> solve(int A) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        ArrayList<Integer> ll = new ArrayList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        int count =3;

        while(count<=A){
            int x = q.poll();
            x = x*10;
            q.add(x+1);
            q.add(x+2);
            q.add(x+3);
            ll.add(x+1);
            ll.add(x+2);
            ll.add(x+3);
            count+=3;
        }

        return new ArrayList<Integer>(ll.subList(0,A));
    }
}

 */