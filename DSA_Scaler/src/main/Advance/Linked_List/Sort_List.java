package main.Advance.Linked_List;
/*
Problem Description
Sort a linked list, A in O(n log n) time.



Problem Constraints
0 <= |A| = 105



Input Format
The first and the only arugment of input contains a pointer to the head of the linked list, A.



Output Format
Return a pointer to the head of the sorted linked list.



Example Input
Input 1:

A = [3, 4, 2, 8]
Input 2:

A = [1]


Example Output
Output 1:

[2, 3, 4, 8]
Output 2:

[1]


Example Explanation
Explanation 1:

 The sorted form of [3, 4, 2, 8] is [2, 3, 4, 8].
Explanation 2:

 The sorted form of [1] is [1].
 */
public class Sort_List {
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
    ListNode mergelist(ListNode A,ListNode B){
        if(A==null)return B;
        if(B==null)return A;

        if(A.val<B.val){
            A.next = mergelist(A.next,B);return A;
        }else{
            B.next = mergelist(A,B.next);return B;
        }
    }

    public ListNode sortList(ListNode A) {

        if(A==null || A.next == null){
            return A;
        }
        ListNode slow = A;
        ListNode fast = A;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode p1 = A;
        ListNode p2 = slow.next;
        slow.next = null;

        ListNode left = sortList(p1);
        ListNode right = sortList(p2);

        return mergelist(left,right);
    }
}

 */