package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class most_frequest_word_in_a_paragraph {
    public static void main(String[] args) {
        String s1 = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] strarr = {"hit"};
        String str =mostCommonWord(s1,strarr);
    }
    public static String mostCommonWord(String paragraph, String[] banned){
       // System.out.println(paragraph);
        paragraph = paragraph.toLowerCase().replaceAll("\\W+","");
       // System.out.println(paragraph);
        String[] strarr = paragraph.split("\\s+");
        for(String a:strarr){
           // System.out.println(a);
        }

        String str = "Geeks for Geeks";
        String arr[] = str.split("[ ]+");
        System.out.println("Array of String: "
                + Arrays.toString(arr));


        HashSet<String> ban = new HashSet<>();
        for(String s:banned){
            ban.add(s);
        }

        HashMap<String,Integer> freq  = new HashMap<>();

        for(String s:strarr){
            if(!freq.containsKey(s)){
                freq.put(s,1);
            }else{
                freq.put(s,freq.get(s)+1);
            }
        }
        int cur=0,max=Integer.MIN_VALUE;
        String ans="";

        for(int i=0;i<strarr.length;i++){
            cur = freq.get(strarr[i]);
            if(cur>max){
                max=cur;
                ans=strarr[i];
            }
        }
     //   System.out.println("ans is :"+ans);


        return null;
    }
}
