package Array;

public class GivenThreeNumbersCanBeMultipleTimerepeated {
    static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
    static void swap(int[] arr,int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void main(String[] args) {

        int[] arr = {3,2,2,3,2,7,2,7,3};

        int j=0;
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] < arr[j]) {
                swap(arr, i, j);
                j++;
            }
        }
         j = arr.length-1;
        for(int i=arr.length-2;i>=0;i--)
        {
                if(arr[i]>arr[j]) {
                    swap(arr, i, j);
                    j--;
                }
        }
      print(arr);
    }

}
