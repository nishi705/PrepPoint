package main.Advance.Stack;
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
    HashMap<Integer,Stack<Integer>> stack_map;
    int max_freq;

    Solution(){
        map = new HashMap<>();
        stack_map = new HashMap<>();
        max_freq = 0;
    }
    int push(int x){

        int currentfreqx =1;

        if(map.containsKey(x)){
            currentfreqx = map.get(x)+1;
            //currentfreqx = currentfreqx+1;
        }
        map.put(x,currentfreqx);

        max_freq = Math.max(max_freq,currentfreqx);

        Stack<Integer> stack;

        if(stack_map.containsKey(currentfreqx)){
            stack = stack_map.get(currentfreqx);
            stack.push(x);
        }else{
            stack = new Stack<Integer>();
            stack.push(x);
        }
        stack_map.put(currentfreqx,stack);

        return  -1;

    }
    int pop(){
        int x =-1;

        if(stack_map.containsKey(max_freq)){
            Stack<Integer> stack = stack_map.get(max_freq);

            x = stack.pop();

            if(stack.isEmpty()){
                stack_map.remove(max_freq);
                max_freq--;
            }

        }
        //here we are updating the frequency
        if(map.containsKey(x)){
            //here we are re
           int currentfreqx = map.get(x)-1;
            if(currentfreqx==0){
                map.remove(x);
            }
            map.put(x,currentfreqx);

        }

        return x;
    }
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<A.size();i++){
            ArrayList<Integer> ans = A.get(i);
            int x = ans.get(0);
            int y = ans.get(1);

           int a =0;
        if(x==1){
             a = push(y);
        }else{
             a = pop();
        }
     al.add(a);
    }
    return al;


    }
}

 */