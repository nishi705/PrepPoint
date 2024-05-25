package main.Advance.Linked_List;
/*
Problem Description
Given a linked list A, remove the B-th node from the end of the list and return its head.
For example, given linked list: 1->2->3->4->5, and B = 2.
After removing the second node from the end, the linked list becomes 1->2->3->5.

NOTE: If B is greater than the size of the list, remove the first node of the list.

Try doing it using constant additional space.



Problem Constraints
1 <= |A| <= 106


Input Format
The first argument of input contains a pointer to the head of the linked list. The second argument of input contains the integer B.


Output Format
Return the head of the linked list after deleting the B-th element from the end.


Example Input
Input 1:
A = 1->2->3->4->5
B = 2
Input 2:
A = 1
B = 1


Example Output
Output 1:
1->2->3->5
Output 2:



Example Explanation
Explanation 1:
In the first example, 4 is the second last element.
Explanation 2:
In the second example, 1 is the first and the last element.



Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
Arg 1: A Linked List, For e.g [1,2,3]
Enter Input Here
Arg 2: A single Integer, For e.g 9
Enter Input Here

 */
public class Remove_Nth_Node_from_List_End {
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
    public ListNode removeNthFromEnd(ListNode A, int B) {

        ListNode temp = A;
        int count =0;
        while(count<B){
            if(temp.next==null)return A.next;
            temp = temp.next;
            count++;
        }

        ListNode slow = A;
        while(temp.next!=null){
            slow=slow.next;
            temp = temp.next;
        }
        slow.next = slow.next.next;
        return A;
    }
}

 */