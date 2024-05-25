package main.Advance.Linked_List;
/*
Problem Description
Given a linked list of integers. Find and return the length of the longest palindrome list that exists in that linked list.

A palindrome list is a list that reads the same backward and forward.

Expected memory complexity : O(1)



Problem Constraints
1 <= length of the linked list <= 2000

1 <= Node value <= 100



Input Format
The only argument given is head pointer of the linked list.



Output Format
Return the length of the longest palindrome list.



Example Input
Input 1:

 2 -> 3 -> 3 -> 3
Input 2:

 2 -> 1 -> 2 -> 1 ->  2 -> 2 -> 1 -> 3 -> 2 -> 2


Example Output
Output 1:

 3
Output 2:

 5


Example Explanation
Explanation 1:

 3 -> 3 -> 3 is largest palindromic sublist
Explanation 2:

 2 -> 1 -> 2 -> 1 -> 2 is largest palindromic sublist.
 */
public class Longest_Palindromic_List {
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
    public int solve(ListNode A) {
        int result=0;
        ListNode prev=null;
        ListNode curr=A;
        ListNode temp=null;

        while(curr!=null){
            temp = curr.next;
            curr.next =prev;

            result = Math.max(result,2*countNode(prev,temp)+1);
            result = Math.max(result,2*countNode(curr,temp));

            prev = curr;
            curr = temp;

        }
        return result;
    }

    int countNode(ListNode h1,ListNode h2){

        int count=0;
        while(h1!=null && h2!=null){

            if(h1.val==h2.val){
                count++;
                h1=h1.next;
                h2=h2.next;
            }else{
                break;
            }
        }

        return count;
    }
}

 */