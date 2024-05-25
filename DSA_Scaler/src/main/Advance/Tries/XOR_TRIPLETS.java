package main.Advance.Tries;
/*
Problem Description
Given an array of integers A of size N.

A triplet (i, j, k), i < j <= k is called a power triplet if A[i] ^ A[i+1] ^....A[j-1] = A[j] ^.....^A[k].

Where, ^ denotes bitwise xor.

Return the count of all possible power triplets. Since the answer could be large return answer % 109 +7.



Problem Constraints
1 <= N <= 100000
1 <= A[i] <= 100000



Input Format
The first argument given is the integer array A.



Output Format
Return the count of all possible power triplets % 109 + 7.



Example Input
Input 1:

 A = [5, 2, 7]
Input 2:

 A = [1, 2, 3]


Example Output
Output 1:

 2
Output 2:

 2


Example Explanation
Explanation 1:

 All possible power triplets are:
    1. (1, 2, 3) ->  A[1] = A[2] ^ A[3]
    2. (1, 3, 3) ->  A[1] ^ A[2] = A[3]
Explanation 2:

 All possible power triplets are:
    1. (1, 2, 3) ->  A[1] = A[2] ^ A[3]
    2. (1, 3, 3) ->  A[1] ^ A[2] = A[3]
 */
public class XOR_TRIPLETS {
}
/*
//Create a Trie Datastruture to store the XOR values in bits
    //* Trie DataStructure contains a 2-sized Trie DataType Array that stores the Address of next Trie Node
    //* contains repeations variable to keep track of No of repeations of every element in the Node
    //* contains lastIndex variable to keep track of the index that gave the node value

//Start storing all XOR values in the Trie Node starting
//Increment the repeations variable if the XOR value already found
//Update the Index of XOR value
//If any repeations is found use the formula :- Ans = CurrentIndexNoofRepeations - LastIndices;
 */
/*
public class Solution {
    long ans = 0;

    public int solve(int[] A) {
        int n = A.length;
        int mod = 1000000007;
        Tries root = new Tries();
        insertXOR(root, 0, 0);
        int xorVal = 0;
        for(int i=0; i<n; i++){
            xorVal = xorVal^A[i];
            insertXOR(root, i, xorVal);
        }
        return (int)(ans%mod);
    }

    public void insertXOR(Tries r, int currIndex, int value){
        Tries temp = r;
        for(int i=31; i>=0; i–){
            //Check if bit is set or not for the passed XOR Value
            int bit = checksetBit(i,value);
            if(temp.children[bit] == null){
                //Create a new Trie Node
                 temp.children[bit] = new Tries();
            }
            temp = temp.children[bit];
        }
        if(temp.repeations > 0){
            ans = (temp.repeations currIndex) - ans;
        }
        temp.repeations++;
        temp.lastIndex = currIndex+1;
    }
    public int checksetBit(int bit, int val){
        if(((val>>bit)&1) == 1){
            return 1;
        }
        return 0;
    }
}
class Tries{
    int repeations = 0;
    int lastIndex;
    Tries[] children = new Tries[2];
}
 */