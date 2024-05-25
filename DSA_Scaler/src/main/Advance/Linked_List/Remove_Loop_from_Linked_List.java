package main.Advance.Linked_List;
/*
Problem Description
You are using Google Maps to help you find your way around a new place. But, you get lost and end up walking in a circle. Google Maps has a way to keep track of where you've been with the help of special sensors.These sensors notice that you're walking in a loop, and now, Google wants to create a new feature to help you figure out exactly where you started going in circles.

Here's how we can describe the challenge in simpler terms: You have a Linked List A that shows each step of your journey, like a chain of events. Some of these steps have accidentally led you back to a place you've already been, making you walk in a loop. The goal is to find out the exact point where you first started walking in this loop, and then you want to break the loop by not going in the circle just before this point.




Problem Constraints
1 <= number of nodes <= 1000



Input Format
The first of the input contains a LinkedList, where the first number is the number of nodes N, and the next N nodes are the node value of the linked list.
The second line of the input contains an integer which denotes the position of node where cycle starts.



Output Format
return the head of the updated linked list.



Example Input
Input 1:


1 -> 2
^    |
| - -
Input 2:

3 -> 2 -> 4 -> 5 -> 6
          ^         |
          |         |
          - - - - - -


Example Output
Output 1:

 1 -> 2 -> NULL
Output 2:

 3 -> 2 -> 4 -> 5 -> 6 -> NULL


Example Explanation
Explanation 1:

 Chain of 1->2 is broken.
Explanation 2:

 Chain of 4->6 is broken.



Expected Output
Enter your input as per the following guideline:
There are 1 lines in the input

Line 1 ( Corresponds to arg 1 ) : Elements in the linked list. First number S is the number of nodes. Then S numbers follow indicating the val in each of the nodes in sequence

 */
public class Remove_Loop_from_Linked_List {
}
/*
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }

public class Solution {
    public ListNode solve(ListNode A) {



        ListNode slow = A;
        ListNode fast = A;
        while(slow.next!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)break;
        }

        ListNode p1 = slow;
        ListNode p2 = A;
        ListNode prev = null;

        while(p1!=p2){
            prev = p1;
            p1 = p1.next;
            p2 = p2.next;
        }

        prev.next =null;
        return A;
    }
}

 */