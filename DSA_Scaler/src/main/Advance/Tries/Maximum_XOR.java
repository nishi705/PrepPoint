package main.Advance.Tries;
/*
Problem Description
Given an array of integers A, find and return the maximum result of A[i] XOR A[j], where i, j are the indexes of the array.



Problem Constraints
1 <= length of the array <= 100000
0 <= A[i] <= 109



Input Format
The only argument given is the integer array A.



Output Format
Return an integer denoting the maximum result of A[i] XOR A[j].



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [5, 17, 100, 11]


Example Output
Output 1:

 7
Output 2:

 117


Example Explanation
Explanation 1:

 Maximum XOR occurs between element of indicies(0-based) 1 and 4 i.e. 2 ^ 5 = 7.
Explanation 2:

 Maximum XOR occurs between element of indicies(0-based) 1 and 2 i.e. 17 ^ 100 = 117.

 */
public class Maximum_XOR {
}
/*
public class Solution {
    public int solve(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE;

        int bit = (A.get(0) >> 31) & 1;
        TrieNode root = new TrieNode(bit);

        for (int num : A) {
            insertElement(root, num);
            max = Math.max(max, searchElement(root, num));
        }

        return max;
    }


     int searchElement(TrieNode root, int data) {
            TrieNode temp = root;

            for (int i = 31; i >= 0; i--) {
                int bit = (data >> i) & 1;
                int opposite = bit ^ 1;

                if (temp.child[opposite] != null) {
                    temp = temp.child[opposite];
                } else {
                    temp = temp.child[bit];
                }
            }

            return temp.value ^ data;
        }

    void insertElement(TrieNode root, int data) {
        TrieNode temp = root;

        for (int i = 31; i >= 0; i--) {
            int bit = (data >> i) & 1;

            if (temp.child[bit] == null) {
                temp.child[bit] = new TrieNode(bit);
            }

            temp = temp.child[bit];

        }

        temp.value=data;
    }
}

   class TrieNode {
        int value;
        TrieNode[] child;
        TrieNode(int x) {
            value = x;
            child = new TrieNode[2];
        }
    }

 */