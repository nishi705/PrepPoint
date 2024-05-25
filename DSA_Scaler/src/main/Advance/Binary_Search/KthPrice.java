package main.Advance.Binary_Search;
/*
Given the price list at which tickets for a flight were purchased, figure out the kth smallest price for the flight. kth smallest price is the minimum possible n such that there are at least k price elements in the price list with value <= n. In other words, if the price list was sorted, then A[k-1] ( k is 1 based, while the array is 0 based ).

NOTE You are not allowed to modify the price list ( The price list is read only ). Try to do it using constant extra space.

Example:

A : [2 1 4 3 2]
k : 3

Answer : 2
Constraints :

1 <= number of elements in the price list <= 1000000
1 <= k <= number of elements in the price list
 */
public class KthPrice {
}
/*
public class Solution {
    int findcount(int[] A,int B){
        int count =0;
        for(int i=0;i<A.length;i++){
            if(A[i]<=B)count++;
        }
        return count;
    }
    public int solve(final int[] A, int B) {


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

         int ans = max;
        for(int i=0;i<A.length;i++){
            max = Math.max(A[i],max);
            min= Math.min(A[i],min);
            }

            while(min<=max){
                int mid = min+(max-min)/2;

                int count = findcount(A,mid);
                if(count>=B){
                ans = mid;
                max = mid-1;
                }
                else{
                min = mid+1;
                }
            }

return ans;

    }
}

 */