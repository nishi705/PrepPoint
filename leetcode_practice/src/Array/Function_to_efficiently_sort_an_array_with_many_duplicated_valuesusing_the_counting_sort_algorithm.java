package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Function_to_efficiently_sort_an_array_with_many_duplicated_valuesusing_the_counting_sort_algorithm {
    static void callsort(int[] arr){
        int[] freq = new int[arr.length];

        for(int i: arr)
        {
            freq[i]++;
        }

        int k=0;
        for(int i=0;i<freq.length;i++)
        {
            while (freq[i]-- > 0) {
                arr[k++] = i;
            }
        }

    }

    public static void main(String[] args) {


//        List<Integer> arr = Arrays.asList(1, 1, 2,2,3,3,2,2,3,1,1,1,1,2);
//
//        ArrayList<Integer> A = new ArrayList<>();
//
//int count =0;
//        for(int i:arr)
//        {
//             count = Collections.frequency(arr, arr.get(i));
//        }
//        System.out.println(count);


        int[] arr = {1,1,1,1,2,1,2,2,3,3,3,1};

        callsort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
