package main.Advance.Linked_List;
/*
Problem Description
Given a singly linked list A, determine if it's a palindrome. Return 1 or 0, denoting if it's a palindrome or not, respectively.



Problem Constraints
1 <= |A| <= 105



Input Format
The first and the only argument of input contains a pointer to the head of the given linked list.



Output Format
Return 0, if the linked list is not a palindrome.

Return 1, if the linked list is a palindrome.



Example Input
Input 1:

A = [1, 2, 2, 1]
Input 2:

A = [1, 3, 2]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 The first linked list is a palindrome as [1, 2, 2, 1] is equal to its reversed form.
Explanation 2:

 The second linked list is not a palindrom as [1, 3, 2] is not equal to [2, 3, 1].
 */
public class Palindrome_List {
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
    public int lPalin(ListNode A) {

        ListNode mid = findMid(A);
        ListNode B = mid.next;
        mid.next = null;
        B = reverseList(B);
        return comapreList(A,B);


    }
    ListNode reverseList(ListNode B){

        ListNode prev = null;
        ListNode temp = null;
        ListNode curr = B;

        while(curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    int comapreList(ListNode A,ListNode B){

        //  while (A != null && B != null) {
        //     if (A.val != B.val) return 0;
        //     A = A.next;
        //     B = B.next;
        // }
        // if (A == null && B == null) return 1;
        // if (A.next == null && B == null) return 1;
        // return 0;




        while(A!=null && B!=null){
            if(A.val==B.val){
                A= A.next;
                B= B.next;
            }else{
                return 0;
            }
        }
        return 1;
    }
    ListNode findMid(ListNode A){

        ListNode slow = A;
        ListNode fast = A;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

 */