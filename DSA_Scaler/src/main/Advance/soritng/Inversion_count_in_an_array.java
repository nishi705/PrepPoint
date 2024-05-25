package main.Advance.soritng;
/*
Problem Description
Given an array of integers A. If i < j and A[i] > A[j], then the pair (i, j) is called an inversion of A. Find the total number of inversions of A modulo (109 + 7).



Problem Constraints
1 <= length of the array <= 105

1 <= A[i] <= 109



Input Format
The only argument given is the integer array A.



Output Format
Return the number of inversions of A modulo (109 + 7).



Example Input
Input 1:

A = [1, 3, 2]
Input 2:

A = [3, 4, 1, 2]


Example Output
Output 1:

1
Output 2:

4


Example Explanation
Explanation 1:

The pair (1, 2) is an inversion as 1 < 2 and A[1] > A[2]
Explanation 2:

The pair (0, 2) is an inversion as 0 < 2 and A[0] > A[2]
The pair (0, 3) is an inversion as 0 < 3 and A[0] > A[3]
The pair (1, 2) is an inversion as 1 < 2 and A[1] > A[2]
The pair (1, 3) is an inversion as 1 < 3 and A[1] > A[3]

 */
public class Inversion_count_in_an_array {
}
/*
public class Solution {
    int mergfunc(int[] A,int s,int e){
        if(s==e)return 0;
        int mod = 1000000007;
        int mid = (s+e)/2;

        int x = mergfunc(A,s,mid)%mod;
        int y = mergfunc(A,mid+1,e)%mod;
        int z = finctioncall(A,s,mid,e)%mod;
        return (x+y+z)%mod;

    }

    int finctioncall(int[] A,int s,int mid,int e){
        int[] c = new int[e-s+1];
        int i = s;
        int j = mid+1;
        int count =0;
        int mod = 1000000007;
        int k=0;

        while(i<=mid && j<=e){
            if(A[i]>A[j]){
                 count+= (mid-i+1)%mod;
                  c[k] = A[j];
                  k++;
                  j++;
            }else{
                c[k] = A[i];
                k++;
                i++;
            }
        }

            while(i<=mid){
                c[k] = A[i];
                i++;
                k++;
            }
            while(j<=e){
                c[k] = A[j];
                j++;
                k++;
            }

          // k = 0;
       for(int m = 0; m <=e-s; m++){
       A[s+m] = c[m];
    //   k++;
       }

            return count%mod;

    }

    public int solve(int[] A) {

        int x = mergfunc(A,0,A.length-1);
        return x;
    }
}

 */