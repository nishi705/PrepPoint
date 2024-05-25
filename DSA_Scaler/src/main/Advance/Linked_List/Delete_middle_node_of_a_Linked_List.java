package main.Advance.Linked_List;
/*
Given a singly linked list, delete middle of the linked list.

For example, if given linked list is 1->2->3->4->5 then linked list should be modified to 1->2->4->5

If there are even nodes, then there would be two middle nodes, we need to delete the second middle element.

For example, if given linked list is 1->2->3->4->5->6 then it should be modified to 1->2->3->5->6.

Return the head of the linked list after removing the middle node.

If the input linked list has 1 node, then this node should be deleted and a null node should be returned.


Input Format

The only argument given is the node pointing to the head node of the linked list
Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
Arg 1: A Linked List, For e.g [1,2,3]
Enter Input Here
Run
 */
public class Delete_middle_node_of_a_Linked_List {
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
    // int findmidnode(ListNode A){
    //     Node slow = head;
    //     Node fast = head;

    //     Node temp = head;
    //     while(fast!= null && fast.next != null){
    //       slow = slow.next;
    //       fast = fast.next.next;
    //     }
    //      return slow;
    // }
    public ListNode solve(ListNode A) {

        // ListNode temp = A;
        // int count =0;
        // while(temp!=null){
        //     temp= temp.next;
        //     count++;
        // }

        // int mid =0;
        // if(count%2 ==0){
        //     mid = findmidnode(ListNode A);
        // }else{
        //      mid =  findmidnode(ListNode A);
        // }
        // Node curret = head;
        // while(temp!=null){
        //     if(temp.next == mid){
        //         temp.next = mid.next;
        //     }
        //     temp = temp.next;
        // }
        // return head;

        ListNode fast=A;
        ListNode slow=A;
        ListNode prev=null;

        if(A==null || A.next==null) return null;
        while(fast.next!=null && slow.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
            if(fast==null) break;
        }
        prev.next=slow.next;
        return A;
    }
}

 */