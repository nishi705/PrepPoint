package main.Advance.Linked_List;
/*
Problem Description

Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Try solving it using constant additional space.

Constraints:

0 <= size of linked list <= 106
1 <= value of nodes <= 109

Example:

Input:

                  ______
                 |     |
                 \/    |
        1 -> 2 -> 3 -> 4

Return the node corresponding to node 3.



Expected Output
Enter your input as per the following guideline:
There are 2 lines in the input

Line 1 ( Corresponds to arg 1 ) : Elements in the linked list. First number S is the number of nodes. Then S numbers follow indicating the val in each of the nodes in sequence
	For example, LinkedList: "5 --> 9 --> 7" will be written as "3 5 9 7"(without quotes).

Line 2 : Integer X corresponding to a node position. If the integer is -1, then there is no loop. Otherwise, the end node has a next edge to node number X.
	For example, Integer: "-1" will be written as "-1"(without quotes).
 */
public class List_Cycle {
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
    public ListNode detectCycle(ListNode a) {

        ListNode slow = a;
        ListNode fast = a;
        boolean flag = false;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                flag = true;
                break;
            }
        }

        if(flag==false){
            return null;
        }

        ListNode p1 = slow;
        ListNode p2 = a;


        while(p1!=p2){

            p1=p1.next;
            p2=p2.next;
        }


        return p1;
    }
}

 */