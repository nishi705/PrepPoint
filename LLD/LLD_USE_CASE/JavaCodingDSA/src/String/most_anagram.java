package String;

import java.util.HashMap;
import java.util.*;

public class most_anagram {
    public static void main(String[] args) {
        String S = "be be silent be and silent"
                + " to what the be professor be silent be";
        String arr[] = S.split("[ ]+");

        int[] prime = {2, 3, 5, 7, 11, 13, 17,
                19, 23, 29, 31, 37, 41,
                43, 47, 53, 59, 61, 67, 71,
                73, 79, 83, 89, 97, 101 };

        HashMap<Integer,String> map = new HashMap<>();
        HashMap<Integer,Integer> pro = new HashMap<>();


                for(String str:arr){
                    char[] chararr = str.toCharArray();
                    int prod =1;

                    for(char c:chararr) {
                        prod = prod * prime[c-'a'];
                    }

                    if(map.containsKey(prod)){
                        pro.put(prod,pro.get(prod)+1);
                    }else{
                        map.put(prod,str);
                        pro.put(prod,1);

                    }
                }
int max =-1;
                int maxprod =-1;
                for(Map.Entry<Integer,Integer>  e : pro.entrySet()){
                    if(max< e.getValue()){
                        max = e.getValue();
                        maxprod = e.getKey();
                    }
                }

        System.out.println(map.get(maxprod));
    }
}
