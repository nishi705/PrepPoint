package main.Advance.Heap;
/*
Problem Description
Given an array A of N numbers, you have to perform B operations. In each operation, you have to pick any one of the N elements and add the original value(value stored at the index before we did any operations) to its current value. You can choose any of the N elements in each operation.

Perform B operations in such a way that the largest element of the modified array(after B operations) is minimized.
Find the minimum possible largest element after B operations.



Problem Constraints
1 <= N <= 106
0 <= B <= 105
-104 <= A[i] <= 104



Input Format
The first argument is an integer array A.
The second argument is an integer B.



Output Format
Return an integer denoting the minimum possible largest element after B operations.



Example Input
Input 1:

 A = [1, 2, 3, 4]
 B = 3
Input 2:

 A = [5, 1, 4, 2]
 B = 5


Example Output
Output 1:

 4
Output 2:

 5


Example Explanation
Explanation 1:

 Apply operation on element at index 0, the array would change to [2, 2, 3, 4]
 Apply operation on element at index 0, the array would change to [3, 2, 3, 4]
 Apply operation on element at index 0, the array would change to [4, 2, 3, 4]
 Minimum possible largest element after 3 operations is 4.
Explanation 2:

 Apply operation on element at index 1, the array would change to [5, 2, 4, 2]
 Apply operation on element at index 1, the array would change to [5, 3, 4, 2]
 Apply operation on element at index 1, the array would change to [5, 4, 4, 2]
 Apply operation on element at index 1, the array would change to [5, 5, 4, 2]
 Apply operation on element at index 3, the array would change to [5, 5, 4, 4]
 Minimum possible largest element after 5 operations is 5.
 */
public class Minimum_largest_element {
}
/*
class Pair{
        int val;
        int curval;
        int nextval;
        public  Pair(int val){
            this.val = val;
            this.curval = val;
            this.nextval = val+val;
        }
    }
        class Customcomparator implements Comparator<Pair>{
            public int compare(Pair a,Pair b){
                return a.nextval-b.nextval;
            }
        }
    public class Solution {
    int max = Integer.MIN_VALUE;
    public int solve(int[] A, int B) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new Customcomparator());

        for(int i=0;i<A.length;i++){
            max = Math.max(max,A[i]);
            Pair p = new Pair(A[i]);
            pq.add(p);
        }
        for(int i=0;i<B;i++){
            Pair a = pq.poll();
            max = Math.max(max,a.nextval);
            a.curval = a.nextval;
            a.nextval = a.val+a.nextval;
            pq.add(a);
        }

        return max;
    }
}

 */