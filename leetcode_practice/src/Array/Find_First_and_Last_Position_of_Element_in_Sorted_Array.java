package Array;

import java.util.ArrayList;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    static int first(int[] arr, int f, int l, int t, int n) {
        while(f<=l)
        {
            int mid = f+(l-f)/2;
            if((mid == 0 || t > arr[mid - 1]) && arr[mid] == t)
                return mid;
            else if (t>arr[mid] )
               return (first(arr, mid + 1, l, t, n));
            else
                return (first(arr, f ,mid-1,t,n));

        }
        return -1;

    }
    static int second(int[] arr, int f, int l, int t, int n) {
        while(f<=l)
        {
            int mid = f+(l-f)/2;
            if(arr[mid] == t)
                return mid;
            else if (t > arr[mid])
                return (second(arr, mid + 1, l, t, n));
            else
                return (second(arr, f ,mid-1,t,n));

        }
        return -1;


    }
    public static void main(String[] args) {
        int[] arr= {5,7,7,8,8,10};
        int t = 8;
        int n = arr.length;
        System.out.println(1/2);

        //1. BRUTE FORCE APPROACH
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (t != arr[i])
                continue;
            if (first == -1)
                first = i;
               last = i;

        }
        if (first != -1) {
            System.out.println("First Occurrence = " + first);
            System.out.println("Last Occurrence = " + last);
        }
        else
            System.out.println("Not Found");





        //2. BINARY SEARCH
        System.out.println(first(arr,0,n-1,t,n));
        System.out.println(second(arr,0,n-1,t,n));




        //3.Using ARRAYLIST
        ArrayList<Integer> al = new ArrayList<>();
        for(int i: arr)
        {
            al.add(i);
        }
        customcall(al,t);
    }
    static void customcall(ArrayList<Integer> al,int x){

        //For the first index of X
        System.out.println(al.indexOf(x));

        //For the last index of x
        System.out.println(al.lastIndexOf(x));

    }
}
