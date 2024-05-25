package main.Advance.Queue;
/*
Problem Description
You are given a matrix A of size N x 2 which represents different operations.
Assume initially you have a stack-like data structure you have to perform operations on it.

Operations are of two types:

1 x: push an integer x onto the stack and return -1.

2 0: remove and return the most frequent element in the stack. This basically means the element which has the highest count among all the elements currently in the stack.

If there is a tie for the most frequent element, the element closest to the top of the stack is removed and returned.

A[i][0] describes the type of operation to be performed. A[i][1] describe the element x or 0 corresponding to the operation performed.



Problem Constraints
1 <= N <= 100000

1 <= A[i][0] <= 2

0 <= A[i][1] <= 109



Input Format
The only argument given is the integer array A.



Output Format
Return the array of integers denoting the answer to each operation.



Example Input
Input 1:

A = [
            [1, 5]
            [1, 7]
            [1, 5]
            [1, 7]
            [1, 4]
            [1, 5]
            [2, 0]
            [2, 0]
            [2, 0]
            [2, 0]  ]
Input 2:

 A =  [
        [1, 5]
        [2, 0]
        [1, 4]   ]


Example Output
Output 1:

 [-1, -1, -1, -1, -1, -1, 5, 7, 5, 4]
Output 2:

 [-1, 5, -1]


Example Explanation
Explanation 1:

 Just simulate given operations.
Explanation 2:

 Just simulate given operations.
 */
public class Maximum_Frequency_stack {
}
/*
public class Solution {
    HashMap<Integer,Integer> map;
    HashMap<Integer,Stack<Integer>> freqstack;
    int maxfreq;
     Solution(){
         maxfreq =0;
         map = new HashMap<Integer,Integer>();
         freqstack = new HashMap<Integer, Stack<Integer>>();
     }
     public int push(int x){
         int currentfreqofx = 1;
         if(map.containsKey(x)){
             currentfreqofx = map.get(x);
             currentfreqofx = currentfreqofx+1;
         }
         map.put(x,currentfreqofx);


         maxfreq = Math.max(maxfreq, currentfreqofx);

        Stack<Integer> stack;
        //if the frequency is already fresent in the freqstack
        //using freqstack.get(currentfreqofx) we will get the particular stack
        //then we will put the element into the stack
        if(freqstack.containsKey(currentfreqofx)){
            stack = freqstack.get(currentfreqofx);
            stack.push(x);
        }else{
            stack = new Stack<Integer>();
            stack.push(x);
        }
        freqstack.put(currentfreqofx,stack);
         return -1;
     }
     public int pop(){
         int x =-1;

         if(freqstack.containsKey(maxfreq)){
             Stack<Integer> stack = freqstack.get(maxfreq);
             x = stack.pop();

             if(stack.isEmpty()){
                 freqstack.remove(maxfreq);
                 maxfreq--;
             }
         }
               if(map.containsKey(x)){
               int currentfreqofx = map.get(x)-1;
               if(currentfreqofx==0){
                   map.remove(x);
               }else{
                   map.put(x,currentfreqofx);
               }
            }
      return x;
     }
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
      ArrayList<Integer> res = new ArrayList<>();

      for(int i=0;i<A.size();i++){
            ArrayList<Integer> currentval = A.get(i);
            int x = currentval.get(0);
            int y = currentval.get(1);


            int ans =0;
            if(x==1){
              ans = push(y);
            }else{
                ans = pop();
            }
            res.add(ans);
      }
return res;

    }
}

 */