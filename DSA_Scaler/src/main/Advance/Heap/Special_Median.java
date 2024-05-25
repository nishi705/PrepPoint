package main.Advance.Heap;
/*
Problem Description
You are given an array A containing N numbers. This array is called special if it satisfies one of the following properties:

There exists an element A[i] in the array such that A[i] is equal to the median of elements [A[0], A[1], ...., A[i-1]]
There exists an element A[i] in the array such that A[i] is equal to the median of elements [A[i+1], A[i+2], ...., A[N-1]]
The Median is the middle element in the sorted list of elements. If the number of elements is even then the median will be (sum of both middle elements) / 2.

Return 1 if the array is special else return 0.

NOTE:

Do not neglect decimal point while calculating the median
For A[0] consider only the median of elements [A[1], A[2], ..., A[N-1]] (as there are no elements to the left of it)
For A[N-1] consider only the median of elements [A[0], A[1], ...., A[N-2]]


Problem Constraints
1 <= N <= 1000000.
A[i] is in the range of a signed 32-bit integer.



Input Format
The first and only argument is an integer array A.



Output Format
Return 1 if the given array is special else return 0.



Example Input
Input 1:

 A = [4, 6, 8, 4]
Input 2:

 A = [2, 7, 3, 1]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explantion 1:

 Here, 6 is equal to the median of [8, 4].
Explanation 2:

 No element satisfies any condition.
 */
public class Special_Median {
}



/*
public class Solution {
    public int solve(int[] A) {

        int n = A.length;

        if( n == 1 ){
            return 0;
        }
        double left[] = new double[n];

        double right[] = new double[n];

        PriorityQueue<Integer> leftMaxPq = new PriorityQueue<>(Collections.reverseOrder());

        PriorityQueue<Integer> leftMinPq = new PriorityQueue<>();

        left[0] = A[0];

        left[1] = ( ((double)A[0] + A[1]) / 2);

        leftMaxPq.offer(Math.min( A[0] , A[1] ));

        leftMinPq.offer(Math.max( A[0] , A[1] ));

        int index = 2;

        for(int i=2; i<n ; i++){

               if(A[i] <= leftMaxPq.peek()){
                leftMaxPq.offer(A[i]);

                if( leftMaxPq.size() - leftMinPq.size() > 1){
                    leftMinPq.offer(leftMaxPq.poll());
                }
            }
            else{
                leftMinPq.offer(A[i]);

                if(leftMinPq.size() - leftMaxPq.size() > 1){
                    leftMaxPq.offer(leftMinPq.poll());
                }
            }

            if(leftMaxPq.size() == leftMinPq.size()){
                left[index] = ((double)leftMaxPq.peek() + leftMinPq.peek())/2;
            }
            else if( leftMaxPq.size() > leftMinPq.size() ){
                left[index] = leftMaxPq.peek();
            }
            else{
                left[index] = leftMinPq.peek();
            }
            index++;
        }

        PriorityQueue<Integer> rightMaxPq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> rightMinPq = new PriorityQueue<>();

        right[n-1] = A[n-1];
        right[n-2] = ( ((double)A[n-1]+ A[n-2]) / 2 );

        rightMaxPq.offer(Math.min(A[n-1] , A[n-2]));
        rightMinPq.offer(Math.max(A[n-1] , A[n-2]));

        index = n-3;

        for(int i=n-3 ; i>=0; i--){

                if( A[i] <= rightMaxPq.peek()){

                rightMaxPq.offer(A[i]);

                if( rightMaxPq.size() - rightMinPq.size() > 1){
                    rightMinPq.offer(rightMaxPq.poll());
                }
            }
            else{
                rightMinPq.offer(A[i]);

                if( rightMinPq.size() - rightMaxPq.size() > 1){
                    rightMaxPq.offer(rightMinPq.poll());
                }
            }

            if( rightMaxPq.size() == rightMinPq.size()){
                right[index] = ( (double)rightMaxPq.peek() + rightMinPq.peek() ) / 2;
            }
            else if( rightMaxPq.size() > rightMinPq.size()){
                right[index] = rightMaxPq.peek();
            }
            else{
                right[index] = rightMinPq.peek();
            }
            index--;
        }


        for(int i=0; i<n; i++){

            if( i==0 ){
                if((double)A[i] == right[i+1]){
                    return 1;
                }
            }
            else if( i==n-1 ){
                if( (double)A[i] == left[n-2]){
                    return 1;
                }
            }
            else{
                if((double)A[i] == left[i-1] || (double)A[i] == right[i+1]){
                    return 1;
                }
            }
        }
        return 0;
    }


}
 */