package main.Advance.Tries;
/*
Problem Description

Given two arrays of strings A of size N and B of size M.

Return a binary string C where C[i] = '1' if B[i] can be found in dictionary A using exactly one modification in B[i], Else C[i] = '0'.

NOTE: modification is defined as converting a character into another character.



Problem Constraints

1 <= N <= 30000

1 <= M <= 2500

1 <= length of any string either in A or B <= 20

strings contains only lowercase alphabets



Input Format

First argument is the string arrray A.

Second argument is the string array B.



Output Format

Return a binary string C where C[i] = '1' if B[i] can be found in dictionary A using one modification in B[i], Else C[i] = '0'.



Example Input

Input 1:

 A = [data, circle, cricket]
 B = [date, circel, crikket, data, circl]
Input 2:

 A = [hello, world]
 B = [hella, pello, pella]


Example Output

Output 1:

 "10100"
Output 2:

 "110"


Example Explanation

Explanation 1:

 1. date = dat*(can be found in A)
 2. circel =(cannot be found in A using exactly one modification)
 3. crikket = cri*ket(can be found in A)
 4. data = (cannot be found in A using exactly one modification)
 5. circl = (cannot be found in A using exactly one modification)
Explanation 2:

 Only pella cannot be found in A using only one modification.
 */
public class Modified_Search {
}
/*
public class Solution {
    class trie{
        char s;
        HashMap<Character,trie> child=new HashMap<>();
        boolean isend;
        trie(char s)
        {
            this.s=s;
            this.isend=false;
        }
    }
    public int flag;
    public String solve(String[] A, String[] B) {
        trie root=new trie(‘0’);
        build(A,root);
        String ans="";
        for(int i=0;i<B.length;i++)
        {
            trie r=root;
            flag=0;
            dfs(r,B[i],0,0);
            if(flag==1)
            {
                ans=ans+“1”;
            }
            else
                ans=ans+“0”;
        }
        return ans;
    }
    public void build (String[] A, trie root)
    {
        for(int i=0;i<A.length;i++)
        {
            String curstr=A[i];
            trie r=root;
            for(int j=0;j<curstr.length();j++)
            {
                char p=curstr.charAt(j);
                if(r.child.containsKey(p))
                {
                    r=r.child.get(p);
                }
                else
                {
                    trie temp=new trie(p);
                    r.child.put(p,temp);
                    r=temp;
                }
            }
            r.isend=true;
        }
    }
    public void dfs(trie root,String str,int index,int count)
    {
        if(count>1)
            return;
        if(index==str.length())
        {
            if(count==1 && root.isend==true)
                flag=1;
            return;
        }
        if(root.isend==true && (str.length()-1-index)>=1)
        {
            flag=2;
            return;
        }
        char p=str.charAt(index);
        for(char q: root.child.keySet())
        {
            if(q==p)
                dfs(root.child.get(q),str,index+1,count);
            else
                dfs(root.child.get(q),str,index+1,count+1);
        }
    }
}
 */