package main.Advance.Linked_List;
/*
Problem Description
Given a sorted linked list, delete all duplicates such that each element appears only once.



Problem Constraints
0 <= length of linked list <= 106



Input Format
First argument is the head pointer of the linked list.



Output Format
Return the head pointer of the linked list after removing all duplicates.



Example Input
Input 1:

 1->1->2
Input 2:

 1->1->2->3->3


Example Output
Output 1:

 1->2
Output 2:

 1->2->3


Example Explanation
Explanation 1:

 Each element appear only once in 1->2.



Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
Arg 1: A Linked List, For e.g [1,2,3]
Enter Input Here

 */
public class Remove_Duplicates_from_Sorted_List {
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
    public ListNode deleteDuplicates(ListNode A) {
        ListNode temp = A;
        ListNode prev = A;

        while(temp.next!=null){
            temp = prev.next;
            if(temp.val == prev.val){
                prev.next = temp.next;
            }else{
                prev = prev.next;
            }
        }

        return A;

    }
}

 */