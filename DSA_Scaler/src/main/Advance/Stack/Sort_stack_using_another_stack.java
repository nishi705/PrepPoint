package main.Advance.Stack;
/*
Problem Description
Given a stack of integers A, sort it using another stack.

Return the array of integers after sorting the stack using another stack.



Problem Constraints
1 <= |A| <= 5000

0 <= A[i] <= 109



Input Format
The only argument is a stack given as an integer array A.



Output Format
Return the array of integers after sorting the stack using another stack.



Example Input
Input 1:

 A = [5, 4, 3, 2, 1]
Input 2:

 A = [5, 17, 100, 11]


Example Output
Output 1:

 [1, 2, 3, 4, 5]
Output 2:

 [5, 11, 17, 100]


Example Explanation
Explanation 1:

 Just sort the given numbers.
Explanation 2:

 Just sort the given numbers.
 */
public class Sort_stack_using_another_stack {
}
/*
import java.util.stream.Collectors;
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<A.size();i++){
            stack.push(A.get(i));
        }

           List<Integer> al =  sortList(stack).stream().collect(Collectors.toList());
       return (ArrayList<Integer>) al;


    }
    Stack<Integer> sortList(Stack<Integer> stack){
        if(stack.size() <= 1){
            return stack;}


        Stack<Integer> stack1 = new Stack<>();

        for(int i=0;i<stack.size()/2;i++){
            stack1.push(stack.pop());
        }

        Stack<Integer> a = sortList(stack);
        Stack<Integer> b = sortList(stack1);

        return merge(a,b);
    }
   //Stack<Integer> merge(Stack<Integer> a1, Stack<Integer> a2)
   Stack<Integer> merge(Stack<Integer> a , Stack<Integer> b){

        Stack<Integer> helper = new Stack<>();
        while(!a.isEmpty() && !b.isEmpty()){
            if(a.peek()>=b.peek()){
                helper.push(a.pop());
            }else{
                helper.push(b.pop());
            }
        }


        while(!a.isEmpty()){
            helper.push(a.pop());
        }

        while(!b.isEmpty()){
            helper.push(b.pop());
        }

        while(!helper.isEmpty()){
            a.push(helper.pop());
        }

        return a;
    }
}

















 */