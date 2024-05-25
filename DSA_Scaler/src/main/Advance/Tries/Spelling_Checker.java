package main.Advance.Tries;
/*
Problem Description
Given an array of words A (dictionary) and another array B (which contain some words).

You have to return the binary array (of length |B|) as the answer where 1 denotes that the word is present in the dictionary and 0 denotes it is not present.

Formally, for each word in B, you need to return 1 if it is present in Dictionary and 0 if not.

Such problems can be seen in real life when we work on any online editor (like Google Documnet), if the word is not valid it is underlined by a red line.

NOTE: Try to do this in O(n) time complexity.



Problem Constraints
1 <= |A| <= 1000

1 <= sum of all strings in A <= 50000

1 <= |B| <= 1000



Input Format
First argument is array of strings A.

First argument is array of strings B.



Output Format
Return the binary array of integers according to the given format.



Example Input
Input 1:

A = [ "hat", "cat", "rat" ]
B = [ "cat", "ball" ]
Input 2:

A = [ "tape", "bcci" ]
B = [ "table", "cci" ]


Example Output
Output 1:

[1, 0]
Output 2:

[0, 0]


Example Explanation
Explanation 1:

Only "cat" is present in the dictionary.
Explanation 2:

None of the words are present in the dictionary.
 */
public class Spelling_Checker {
}
/*
public class Solution {
    public int[] solve(String[] A, String[] B) {
        TrieNode root = new TrieNode();
        createTrie(A, root);

        int[] isWordsPresent = new int[B.length];
        validateWords(B, root, isWordsPresent);
        return isWordsPresent;
    }

    private void createTrie(String[] words, TrieNode root){
        for(String word: words){
            TrieNode currNode = root;
            for(Character ch: word.toCharArray()){
                TrieNode chNode = currNode.children.get(ch);
                if(chNode == null){
                    chNode = new TrieNode();
                    currNode.children.put(ch, chNode);
                }
                currNode = chNode;
            }
            currNode.isEndNode = true;
        }
    }

    private void validateWords(String[] words, TrieNode root, int[] isWordsPresent){
        for(int i=0; i<words.length; i++){
            String word = words[i];
            TrieNode currNode = root;
            for(Character ch: word.toCharArray()){
                TrieNode chNode = currNode.children.get(ch);
                if(chNode == null){
                    //isWordsPresent[i]=0; // default0
                    break;
                }
                currNode = chNode;
            }
            if(currNode!=null && currNode.isEndNode == true){
                isWordsPresent[i]=1;
            }
        }
    }
}

class TrieNode{
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isEndNode;
}
 */