package main.Advance.Binary_Search;
/*
Problem Description
The government wants to set up B distribution offices across N cities for the distribution of food packets.

The population of the ith city is A[i]. Each city must have at least 1 office and every person is assigned to exactly one office in their own city.

Let M denote the minimum number of people that are assigned to any of the offices. Find the maximum value of M possible.



Problem Constraints
1 <= N <= 105

1 <= A[i] <= 106

1 <= B <= 5 x 105



Input Format
The first line of input contains an integer array A.

The second line of input contains an integer B.



Output Format
Return one integer representing the maximum number of people who can get food in any single office.



Example Input
Input 1:

  A = [10000, 22000, 36000]
  B = 6
Input 2:

  A = [1, 1, 1]
  B = 4


Example Output
Output 1:

  10000
Output 2:

  0


Example Explanation
Explanation 1:

  1 office can be opened in the first city,
  2 offices in the second city and
  3 in the third. This way ,
  10,000 people can get food in the office in the first city, and
  11,000 people can get food in each office in the second city and
  12,000 people can get food in third city.
  Had we alloted more in some office, we had to allot lesser in some other office which will reduce the answer.
Explanation 2:

  We will have to allot 2 offices to one city. And one of these offices would give food to 0 people.
 */
public class Food_Packets_Distribution {
}
/*
public class Solution {
   public int solve(int[] A, int B) {
    int e = Integer.MAX_VALUE;
    int s=1;
    long sum=0;
    for(int i=0;i<A.length;i++){
        sum+=A[i];
        e= Math.min(e,A[i]);
    }
    int ans =1;
    if(B>sum)return 0;

    while(s<=e){
        int mid = (s+e)/2;
        if(check(A,B,mid)){
            ans = mid;
            s=mid+1;
        }else{
            e=mid-1;
        }
    }
    return ans;

    }
    boolean check(int[] A,int B,int mid){
         int count=0;

        for(int i=0;i<A.length;i++){
            count=count+A[i]/mid;
        }
        if(count>=B)return true;
return false;

    }
}

 */