package main.Advance.Linked_List;
/*
Problem Description
Given a linked list where every node represents a linked list and contains two pointers of its type:

Pointer to next node in the main list (right pointer)
Pointer to a linked list where this node is head (down pointer). All linked lists are sorted.
You are asked to flatten the linked list into a single list. Use down pointer to link nodes of the flattened list. The flattened linked list should also be sorted.



Problem Constraints
1 <= Total nodes in the list <= 100000

1 <= Value of node <= 109



Input Format
The only argument given is head pointer of the doubly linked list.



Output Format
Return the head pointer of the Flattened list.



Example Input
Input 1:

   3 -> 4 -> 20 -> 20 ->30
   |    |    |     |    |
   7    11   22    20   31
   |               |    |
   7               28   39
   |               |
   8               39
Input 2:

   2 -> 4
   |    |
   7    11
   |
   7


Example Output
Output 1:

 3 -> 4 -> 7 -> 7 -> 8 -> 11 -> 20 -> 20 -> 20 -> 22 -> 28 -> 30 -> 31 -> 39 -> 39
Output 2:

 2 -> 4 -> 7 -> 7 -> 11


Example Explanation
Explanation 1:

 The return linked list is the flatten sorted list.

 */
public class Flatten_a_linked_list {
}
/*
/*
class ListNode {
    int val;
    ListNode right, down;
    ListNode(int x) {
        val = x;
        right = down = null;
    }
}

ListNode flatten(ListNode root) {
    if(root==null || root.right==null) {
        return root;
    }

    ListNode mid = findMid(root);
    ListNode newnode = mid.right;
    mid.right = null;

    ListNode h1 = flatten(root);
    ListNode h2 = flatten(newnode);
    return merge(h1,h2);
}
    ListNode merge(ListNode h1,ListNode h2){
        ListNode c1 = h1;
        ListNode c2 = h2;
        ListNode temp = new ListNode(0);
        ListNode curr = temp;

        while(c1!=null && c2!=null){
            if(c1.val<c2.val){
                curr.down = c1;
                c1 = c1.down;
                curr = curr.down;
            }else{
                curr.down = c2;
                c2 = c2.down;
                curr = curr.down;
            }
        }

        if(c1!=null){
            curr.down = c1;
        }
        if(c2!=null){
            curr.down = c2;
        }

        return temp.down;

    }
    ListNode findMid(ListNode root){
        ListNode slow = root;
        ListNode fast = root;

        while(fast.right!=null && fast.right.right!=null){
            slow = slow.right;
            fast = fast.right.right;
        }
        return slow;
    }
 */