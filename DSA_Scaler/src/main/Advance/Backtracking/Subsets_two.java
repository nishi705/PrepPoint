package main.Advance.Backtracking;
/*
Problem Description
Given a collection of integers denoted by array A of size N that might contain duplicates, return all possible subsets.

NOTE:

Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
The subsets must be sorted lexicographically.


Problem Constraints
0 <= N <= 16



Input Format
Only argument is an integer array A of size N.



Output Format
Return a 2-D vector denoting all the possible subsets.



Example Input
Input 1:

 A = [1, 2, 2]
Input 2:

 A = [1, 1]


Example Output
Output 1:

 [
    [],
    [1],
    [1, 2],
    [1, 2, 2],
    [2],
    [2, 2]
 ]
Output 2:

 [
    [],
    [1],
    [1, 1]
 ]


Example Explanation
Explanation 1:

All the subsets of the array [1, 2, 2] in lexicographically sorted order.
 */
public class Subsets_two {
}
/*
public class Solution {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>(); //class variable
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        Collections.sort(A);
        //Map tp dealing with frequency of integers
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<A.size(); i++){
            set.add(A.get(i));
        }

        //process function that contains the core logic
        process(A, set, new ArrayList<Integer>(), 0);

        //To sort the subsets lexographically
        Collections.sort(ans, new Comparator<ArrayList<Integer>>(){
            public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2){
                for(int i=0; i<list1.size() && i<list2.size(); i++){
                    if(list1.get(i) < list2.get(i)){
                        return -1;
                    }else if(list1.get(i) > list2.get(i)){
                        return 1;
                    }
                }

                if(list1.size() > list2.size()){
                    return 1;
                }else{
                    return -1;
                }
            }
        });

        return ans;
    }

    public void process(ArrayList<Integer> A, HashSet<Integer> set, ArrayList<Integer> curr, int index){
        if(index == A.size()){
            ArrayList<Integer> arr = new ArrayList<Integer>(curr);
            Collections.sort(arr);
            // Only include unique subsets
            if(!ans.contains(arr)){
                ans.add(arr);
            }
            return;
        }

        // include
        curr.add(A.get(index));
        process(A, set, curr, index+1);
        curr.remove(curr.size()-1);
        // don't include
        process(A, set, curr, index+1);
    }
}

 */