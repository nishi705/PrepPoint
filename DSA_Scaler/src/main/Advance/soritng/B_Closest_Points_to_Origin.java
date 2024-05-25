package main.Advance.soritng;
/*
Problem Description
You are developing a feature for Zomato that helps users find the nearest restaurants to their current location. It uses GPS to determine the user's location and has access to a database of restaurants, each with its own set of coordinates in a two-dimensional space representing their geographical location on a map. The goal is to identify the "B" closest restaurants to the user, providing a quick and convenient way to choose where to eat.

Given a list of restaurant locations, denoted by A (each represented by its x and y coordinates on a map), and an integer B representing the number of closest restaurants to the user. The user's current location is assumed to be at the origin (0, 0).

Here, the distance between two points on a plane is the Euclidean distance.

You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in.)

NOTE: Euclidean distance between two points P1(x1, y1) and P2(x2, y2) is sqrt( (x1-x2)2 + (y1-y2)2).


Problem Constraints
1 <= B <= length of the list A <= 105
-105 <= A[i][0] <= 105
-105 <= A[i][1] <= 105



Input Format
The argument given is list A and an integer B.



Output Format
Return the B closest points to the origin (0, 0) in any order.



Example Input
Input 1:

 A = [
       [1, 3],
       [-2, 2]
     ]
 B = 1
Input 2:

 A = [
       [1, -1],
       [2, -1]
     ]
 B = 1


Example Output
Output 1:

 [ [-2, 2] ]
Output 2:

 [ [1, -1] ]


Example Explanation
Explanation 1:

 The Euclidean distance will be sqrt(10) for point [1,3] and sqrt(8) for point [-2,2].
 So one closest point will be [-2,2].
Explanation 2:

 The Euclidean distance will be sqrt(2) for point [1,-1] and sqrt(5) for point [2,-1].
 So one closest point will be [1,-1].

 */
public class B_Closest_Points_to_Origin {
}
/*
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class Solution {
    public int[][] solve(int[][] A, int B) {

    ArrayList<ArrayList<Integer>> hm=new ArrayList<>();

    for(int i=0;i<A.length;i++){
        ArrayList<Integer> row=new ArrayList<>();
        row.add(A[i][0]);
        row.add(A[i][1]);
        hm.add(row);
    }

    Collections.sort(hm,new Comparator<ArrayList<Integer>>(){
        public int compare(ArrayList<Integer> a,ArrayList<Integer> b){

            int c=a.get(0);
            int d=a.get(1);

            int x=(c*c)+(d*d);

            int e=b.get(0);
            int f=b.get(1);

             int y=(e*e)+(f*f);

             if(x<y){
                 return -1;
             }
             else if(x>y){
                 return 1;
             }
             else{
                 return 0;
             }

        }
    });

    int mm[][]=new int[B][2];

    for(int i=0;i<B;i++){

        mm[i][0]=hm.get(i).get(0);
        mm[i][1]=hm.get(i).get(1);



    }

    return mm;
}
}
 */