package main.Advance.Hashing;
/*
Problem Description
Given an array A of N integers.

Find the largest continuous sequence in a array which sums to zero.



Problem Constraints
1 <= N <= 106

-107 <= A[i] <= 107



Input Format
Single argument which is an integer array A.



Output Format
Return an array denoting the longest continuous sequence with total sum of zero.

NOTE : If there are multiple correct answers, return the sequence which occurs first in the array.



Example Input
A = [1,2,-2,4,-4]


Example Output
[2,-2,4,-4]


Example Explanation
[2,-2,4,-4] is the longest sequence with total sum of zero.
 */
public class Largest_Continuous_Sequence_Zero_Sum {
}
/*
public class Solution {
    public int[] lszero(int[] A) {
         int[] ps = new int[A.length];
        ps[0] = A[0];
        int sum =0;
        for(int i=1;i<A.length;i++){
            ps[i] = A[i]+ps[i-1];
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        int start_inx =0;
        int diff =0;
        int ans =0;
        int start =0;

          map.put(0,-1);

        for(int i=0;i<A.length;i++){
            if(map.containsKey(ps[i])){
                start_inx =map.get(ps[i]);
                diff = i-start_inx;

                if(diff>ans){
                    start =start_inx;
                    ans = diff;
                }
            }else{
                map.put(ps[i],i);
            }
        }

        if(ans ==0)return new int[]{};

        int[] res= new int[ans];

        for(int i=0;i<ans;i++){
            ++start;
            res[i] = A[start];
        }

        return res;
    }
}

 */