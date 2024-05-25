package main.Advance.Tries;
/*
Problem Description
There is a dictionary A of N words, and ith word has a unique weight Wi.

Another string array B of size M contains the prefixes. For every prefix B[i], output atmost 5 words from the dictionary A that start with the same prefix.

Output the words in decreasing order of their weight.

NOTE: If there is no word that starts with the given prefix output -1.



Problem Constraints
1 <= T <= 5

1 <= N <= 20000
1 <= M <= 10000

1 <= Wi <= 106

1 <= length of any string either in A or B <= 30



Input Format
First line is an integer T denoting the number of test cases.
For each test case,

First line denotes two space seperated integer N and M.
Second line denotes N space seperated strings denoting the words in dictionary.
Third line denotes N space seperated integers denoting the weight of each word in the dictionary.
Fourth line denotes M space seperated integers denoting the prefixes.


Output Format
For every prefix B[i], print the space seperated output on a new line.

NOTE: After every output there should be a space.



Example Input
Input 1:

 1
 6 3
 abcd aecd abaa abef acdcc acbcc
 2 1 3 4 6 5
 ab abc a
Input 2:

 1
 5 3
 aaaa aacd abaa abaa aadcc
 3 4 1 2 6
 aa aba abc


Example Output
Output 1:

 abef abaa abcd
 abcd
 acdcc acbcc abef abaa abcd
Output 2:

 aadcc aacd aaaa
 abaa abaa
 -1


Example Explanation
Explanation 1:

 For the prefix "ab" 3 words in the dictionary have same prefix: ("abcd" : 2, "abaa" : 3, "abef" : 4). Ouput them in decreasing order of weight.
 For the prefix "abc" only 1 word in the dictionary have same prefix: ("abcd" : 2).
 For the prefix "a" all 6 words in the dictionary have same prefix: ("abcd" : 2, "aecd" : 1, "abaa" : 3, "abef" : 4, "acdcc" : 6, "acbcc" : 5).
 Since we can output atmost 5 words. Output top 5 weighted words in decreasing order of weight.
Explanation 2:

 For the prefix "aa" 3 words in the dictionary have same prefix: ("aaaa" : 3, "aacd" : 4, "aadcc" : 6). Ouput them in decreasing order of weight.
 For the prefix "aba" 2 words in the dictionary have same prefix: ("abaa" : 1, "abaa" : 2).
 For the prefix "abc" there is no word in the dictionary which have same prefix. So print -1.

 */
public class Auto_Complete {
}
/*
import java.lang.*;
import java.util.*;

public class Main {
    static String[] strings, prefixes;
    static int[] weights;
    static int n, m;
    static Pair[] pairList;
    static HashMap<Integer, String> map;
    static TrieNode root;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t– > 0) {
            n = s.nextInt();
            m = s.nextInt();

            strings = new String[n];
            weights = new int[n];
            prefixes = new String[m];
            root = new TrieNode();
            map = new HashMap<>();
            s.nextLine();
            for (int i = 0; i < n; i++) {
                strings[i] = s.next().trim();
            }

            for (int i = 0; i < n; i++) {
                weights[i] = s.nextInt();
            }
            s.nextLine();

            for (int i = 0; i < m; i++) {
                prefixes[i] = s.next().trim();
            }

            pairList = new Pair[n];
            for (int i = 0; i < n; i++) {
                pairList[i] = new Pair(strings[i], weights[i]);
            }
            sortBasedOnWeights();

            for (Pair pair : pairList) {
                //inserting into map -> to get strings to print at later point in descending order
                map.put(pair.weight, pair.str);
            }
            insertToTrie();
            searchInTrie();
        }
    }

    static void sortBasedOnWeights() {

        Comparator<Pair> comparator = new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.weight - o1.weight;
            }
        };

        Arrays.sort(pairList, comparator);
    }

    static void insertToTrie() {

        for (Pair pair : pairList) {
            TrieNode curr = root;
            String string = pair.str;
            int weight = pair.weight;
            int length = string.length();

            for (int i = 0; i < length; i++) {
                int idx = string.charAt(i) - ‘a’;

                if (curr.ch[idx] == null) {
                    curr.ch[idx] = new TrieNode();
                }
                int wIdx = 0;
                while (wIdx < 5) {
                    if (curr.ch[idx].arr[wIdx] == 0) {
                        //inserting weight at every character of string, would be useful to get the whole string by weight to print as answer.
                        curr.ch[idx].arr[wIdx] = weight;
                        break;
                    }
                    wIdx++;
                }
                curr = curr.ch[idx];
            }
        }
    }

    static void searchInTrie() {
        for (String prefix : prefixes) {
            TrieNode curr = root;
            int length = prefix.length();
            boolean prefixFound = true;
            for (int i = 0; i < length; i++) {
                int idx = prefix.charAt(i) - ‘a’;

                if (curr.ch[idx] == null) {
                    System.out.print("-1 ");
                    prefixFound = false;
                    break;
                }

                curr = curr.ch[idx];
            }
            if (prefixFound) {
                for (int weight : curr.arr) {
                    if (weight == 0) {
                        break;
                    }
                    System.out.print(map.get(weight) + " ");
                }
            }
            System.out.println();
        }
    }
}

class Pair {
    String str;
    int weight;

    public Pair(String str, int weight) {
        this.str = str;
        this.weight = weight;
    }
}

class TrieNode {
    TrieNode[] ch;
    int[] arr;

    public TrieNode() {
        ch = new TrieNode[26];
        arr = new int[5];
    }
}
 */