package main.Intermediate.Subsequence_and_subset;
/*
Problem Description
You are given an array of integers A of size N.

The value of a subarray is defined as BITWISE OR of all elements in it.

Return the sum of value of all subarrays of A % 109 + 7.



Problem Constraints
1 <= N <= 105

1 <= A[i] <= 108



Input Format
The first argument given is the integer array A.



Output Format
Return the sum of Value of all subarrays of A % 109 + 7.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [7, 8, 9, 10]


Example Output
Output 1:

 71
Output 2:

 110


Example Explanation
Explanation 1:

 Value([1]) = 1
 Value([1, 2]) = 3
 Value([1, 2, 3]) = 3
 Value([1, 2, 3, 4]) = 7
 Value([1, 2, 3, 4, 5]) = 7
 Value([2]) = 2
 Value([2, 3]) = 3
 Value([2, 3, 4]) = 7
 Value([2, 3, 4, 5]) = 7
 Value([3]) = 3
 Value([3, 4]) = 7
 Value([3, 4, 5]) = 7
 Value([4]) = 4
 Value([4, 5]) = 5
 Value([5]) = 5
 Sum of all these values = 71
Explanation 2:

 Sum of value of all subarray is 110.

 */
public class SUBARRAY_OR {

/*
public class Solution {
    // checking whether the index bit is set or not in val
    int checkbit( int val, int index ) {
        if( ( val&(1<<index) ) == 0 ) {
            return 0;
        }
        else {
            return 1;
        }
    }
    public int solve(int[] A) {
        int N = A.length;
        long total_subarrays = (long) N * (N+1) / 2;
        int mod = (int) 1e9 + 7; // int mod = 1000000007;
        long count_subarray_with_one = 0;
        long final_ans = 0;
        // Iterate each bit from bit 0 to 31
        for( int i=0; i<31; i++ ) {
            long count_subarray_with_zeros = 0;
            long consecutive_zeros = 0;

            // traverse each element of the array one by one
            for( int j=0; j<N; j++ ) {
                if ( checkbit( A[j], i) == 0 ) { // so ith is unset
                    // Here we keep on increasing the count of consecutive 0's
                    consecutive_zeros += 1;
                }
                else {  // so ith bit is set
                    //as we get ith bit as 1 -> first we store our subarray count with ith bit as 0
                    count_subarray_with_zeros += ( consecutive_zeros * (consecutive_zeros + 1) / 2 );
                    // since we got -> ith bit is 1/set so some A[j]..
                    // ..So for next A[j] -> our consecutive_zeros should be = 0
                    consecutive_zeros = 0;
                }
            }
            // after looping -> if there are consecutive_zeros at the end -> then also..
            // ..we should add it in count_subarray_with_zeros
            count_subarray_with_zeros +=  ( consecutive_zeros * (consecutive_zeros + 1) / 2 ) ;
            count_subarray_with_one = total_subarrays - count_subarray_with_zeros;
            final_ans +=  count_subarray_with_one * (1 << i) ; // only they will contribute
        }
        return  (int) (final_ans % mod) ;
    }
}


/*
Explanation in detail ---------------------------->
Lets say A =  [ 1, 2, 3, 4, 5 ]
                0  1  2  3  4  --> index

our total subarrays formed by N= 5 elements = N* N+1 /2 = 5*6/2 = 15

  val   3   2   1   0  ----> bit number
    1 = 0   0   0   1
    2 = 0   0   1   0
    3 = 0   0   1   1
    4 = 0   1   0   0
    5 = 0   1   0   1

Now,  see the column of 0th bit from the above where all 5 numbers are written in binary format...same is written below.

So, at 0th bit ->
1
0
1
0
1

Out of all the total subarrays; Now just looking for 0th bit ->
How many subarrays which have 0 present on 0th bit ??? ->
1
0  ---> it will form 1 subarray which will have 0 present on 0th bit
1
0  ---> it will form 1 subarray which will have 0 present on 0th bit
1

so total 2 subarrays which will have 0 present on 0th bit

so, total subarrays which will have 1 present on 0th bit = total - 2 = 15 -2 = 13

subarrays which have 1 present on 0th bit -> will only contribute to OR

13 subarrays are there; which have 1 present on 0th bit -> contribution = 13 * (2^0) = 13*1= 13

Now,  see the column of  1st bit from the above where all 5 numbers are written in binary format...same is written below.

Now, at 1th bit ->
0
1
1
0
0

Out of all the total subarrays; Now just looking for 1th bit ->
How many subarrays which have 0 present on 1th bit ??? ->
0  ---> it will form 1 subarray which will have 0 present on 1th bit
1
1
0  ---> it will form 1 subarray which will have 0 present on 1th bit
0  ---> it will form 1 subarray which will have 0 present on 1th bit
due to last two consecutive 0s ->  it will form 1 subarray which will have 0 present on 1th bit
4 are like -> {0, 0, 0, 00}

so total 4 subarrays which will have 0 present on 1th bit

so, total subarrays which will have 1 present on 1th bit = total - 4 = 15 - 4 = 11
Giving how they are 11 -> { 01, 1, 11, 1, 011, 110, 1100, 100, 0110, 01100, etc }

subarrays which have 1 present on 1th bit -> will only contribute to OR

11 subarrays are there; which have 1 present on 1th bit -> contribution = 11 * (2^1) = 11*2= 22

Now,  see the column of 2nd bit from the above where all 5 numbers are written in binary format...same is written below.

Now, at 2nd bit ->
0
0
0
1
1

Out of all the total subarrays; Now just looking for 2th bit ->
How many subarrays which have 0 present on 2th bit ??? ->
0  ---> it will form 1 subarray which will have 0 present on 2th bit
0  ---> it will form 1 subarray which will have 0 present on 2th bit
0  ---> it will form 1 subarray which will have 0 present on 2th bit
1
1
due to two consecutive 0s -> there are some subarrays
00
00
000
so, 3 more subarray which will have 0 present on 2th bit
total 6 subarrays are like -> {0, 0, 0, 00, 00, 000}

so total 6 subarrays which will have 0 present on 2th bit

so, total subarrays which will have 1 present on 2th bit = total - 6 = 15 - 6 = 9
Giving how they are 9 -> {0001, 00011, 0011, 011, 11, 1, 1, 01, 001 }

subarrays which have 1 present on 2th bit -> will only contribute to OR

9 subarrays are there; which have 1 present on 2th bit -> contribution = 9 * (2^2) = 9*4= 36


so total contribution to OR = 13 + 22 + 36 = 71

*/



/*
This u can avoid reading --------------->
just written for myself for Formula recalling ----->
public class Solution {
    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        for( int i=0; i<N; i++ ) {
            // Number of subarrays in which ith element of the array is present = ( (i+1) * (N-i) )

              0  1  2  3  4 -----> i or index
            [ 1, 2, 3, 4, 5 ]

            1 = 0 0 0 1   -->  2^ 0
            2 = 0 0 1 0   -->  2^ 1
            3 = 0 0 1 1   -->  2^ 1 + 2^ 0
            4 = 0 1 0 0   -->  2^ 2
            5 = 0 1 0 1   -->  2^ 2 + 2^ 0

            // Number of subarrays in which ith element of the array is present = ( (i+1) * (N-i) )
            N = 5
            i = 0 -> (0+1) * (5-0) = 1 * 5 = 5
            i = 1 -> (1+1) * (5-1) = 2 * 4 = 8
            i = 2 -> (2+1) * (5-2) = 3 * 3 = 9
            i = 3 -> (3+1) * (5-3) = 4 * 2 = 8
            i = 4 -> (4+1) * (5-4) = 5 * 1 = 5
        }
    }
}
*/

}