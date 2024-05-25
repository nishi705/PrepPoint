package main.Advance.soritng;
/*
Problem Description
Given an array of integers A, we call (i, j) an important reverse pair if i < j and A[i] > 2*A[j].
Return the number of important reverse pairs in the given array A.



Problem Constraints
1 <= length of the array <= 105

-2 * 109 <= A[i] <= 2 * 109



Input Format
The only argument given is the integer array A.



Output Format
Return the number of important reverse pairs in the given array A.



Example Input
Input 1:

 A = [1, 3, 2, 3, 1]
Input 2:

 A = [4, 1, 2]


Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

 There are two pairs which are important reverse pair
 i.e  (1, 4) => A[1] > 2 * A[4] => 3 > 2 * 1 => 3 > 2 and
      (3, 4) => A[3] > 2 * A[4] => 3 > 2 * 1 => 3 > 2.
Explanation 2:

 There is only one pair
 i.e (0, 1) => A[0] > 2 * A[1] => 4 > 2 * 1 => 4 > 1

 */
public class Reverse_pairs {
}
/*
public class Solution {
    int merge(ArrayList<Integer> A,int s,int mid,int e){
        ArrayList<Integer> al = new ArrayList<>();

        int x = s;
        int y = mid+1;
        int ans =0;

        while(x<=mid && y<=e){
            if((long)A.get(x)>2*(long)A.get(y)){
                ans+= mid-x+1;
                y++;
            }else{
                x++;
            }
        }

       x= s;
       y=mid+1;
       while(x<=mid && y<=e){
           if(A.get(x)<A.get(y)){
               al.add(A.get(x));
               x++;
           }else{
               al.add(A.get(y));
               y++;
           }
       }


       while(x<=mid){
           al.add(A.get(x));
           x++;
       }

       while(y<=e){
           al.add(A.get(y));
           y++;
       }

        for(int i=0;i<al.size();i++){
            A.set(s+i,al.get(i));
        }

      return ans;
    }

     int reversepair(ArrayList<Integer> A,int s,int e){
        if(s==e)return 0;
          int mid = (s+e)>>1;
        int x = reversepair(A,s,mid);
        int y= reversepair(A,mid+1,e);
        int mergepair = merge(A,s,mid,e);
        return x+y+mergepair;
    }
    public int solve(ArrayList<Integer> A) {

      int s= 0;
      int e = A.size()-1;
     return reversepair(A,s,e);

    }
}

 */