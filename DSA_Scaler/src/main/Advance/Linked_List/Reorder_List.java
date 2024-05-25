package main.Advance.Linked_List;
/*
Problem Description
Given a singly linked list A

 A: A0 → A1 → … → An-1 → An
reorder it to:

 A0 → An → A1 → An-1 → A2 → An-2 → …
You must do this in-place without altering the nodes' values.



Problem Constraints
1 <= |A| <= 106



Input Format
The first and the only argument of input contains a pointer to the head of the linked list A.



Output Format
Return a pointer to the head of the modified linked list.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [1, 2, 3, 4]


Example Output
Output 1:

 [1, 5, 2, 4, 3]
Output 2:

 [1, 4, 2, 3]


Example Explanation
Explanation 1:

 The array will be arranged to [A0, An, A1, An-1, A2].
Explanation 2:

 The array will be arranged to [A0, An, A1, An-1, A2].



Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
Arg 1: A Linked List, For e.g [1,2,3]
Enter Input Here

 */
public class Reorder_List {
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
    ListNode reversethesecondhalf(ListNode A){

        ListNode temp =A;
        ListNode prev = null;
        ListNode fast = null;
        while(temp != null){
            fast = temp.next;
            temp.next= prev;
            prev = temp;
            temp = fast;
        }
        return prev;

    }
    public ListNode reorderList(ListNode A) {
        if(A==null && A.next==null)return A;
        ListNode slow = A;
        ListNode fast    =A;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }

        ListNode p1 = A;
        ListNode p2 = slow.next;
        slow.next = null;
        p2 = reversethesecondhalf(p2);

        A = new ListNode(0);
        ListNode curr = A;

        while(p1!=p2){
            if(p1!=null){
                curr.next=p1;
                curr = curr.next;
                p1 = p1.next;

            }if(p2!=null){
                curr.next = p2;
                curr=curr.next;
                p2 = p2.next;

            }
        }

        return A.next;
    }
}

 */