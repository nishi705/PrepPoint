package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Convert_String_into_array {
    public static void main(String[] args) {
        String str = "Geeks for Geeks";
        Set<String> string_set
                = new HashSet<>(Arrays.asList(str));

        String[] string_array = new String[string_set.size()];

        int index = 0;

        for (String st : string_set) {
            string_array[index++] = str;
        }


        System.out.println("Array of String: "
                + Arrays.toString(string_array));


        String[] str2 = str.split("[ ]+");

        System.out.println("Array of String: "
                + Arrays.toString(str2));


    }


}
