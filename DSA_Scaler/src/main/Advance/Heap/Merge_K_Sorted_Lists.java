package main.Advance.Heap;
/*
Problem Description
Given a list containing head pointers of N sorted linked lists.
Merge these given sorted linked lists and return them as one sorted list.



Problem Constraints
1 <= total number of elements in given linked lists <= 100000



Input Format
The first and only argument is a list containing N head pointers.



Output Format
Return a pointer to the head of the sorted linked list after merging all the given linked lists.



Example Input
Input 1:

 1 -> 10 -> 20
 4 -> 11 -> 13
 3 -> 8 -> 9
Input 2:

 10 -> 12
 13
 5 -> 6


Example Output
Output 1:

 1 -> 3 -> 4 -> 8 -> 9 -> 10 -> 11 -> 13 -> 20
Output 2:

 5 -> 6 -> 10 -> 12 ->13


Example Explanation
Explanation 1:

 The resulting sorted Linked List formed after merging is 1 -> 3 -> 4 -> 8 -> 9 -> 10 -> 11 -> 13 -> 20.
Explanation 2:

 The resulting sorted Linked List formed after merging is 5 -> 6 -> 10 -> 12 ->13.
 */
public class Merge_K_Sorted_Lists {
}
/*
public class Solution
{
public ListNode mergeKLists(ArrayList<ListNode> a)
{
PriorityQueue<ListNode>pq=new PriorityQueue<>( (me,other)->{
return me.val-other.val;
});

int k=a.size();

for(int i=0;i<k;i++)
{
if(a.get(i)!=null)
pq.add(a.get(i));
}
ListNode dummy=new ListNode(-999);
ListNode temp=dummy;

while(!pq.isEmpty())
{
ListNode rem=pq.remove();
temp.next=rem;
temp=temp.next;
rem=rem.next;
if(rem!=null)
pq.add(rem);

}
return dummy.next;
}
}

 */