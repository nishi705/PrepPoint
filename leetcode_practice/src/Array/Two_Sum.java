package Array;

public class Two_Sum {
    static int[] findtwosum(int[] arr,int target)
    {
        //Two POINTERS:
        int[] x = {-1,-1};
        int j=0;

        for(int i=1;i<arr.length;i++)
        {
            if((arr[i] +arr[j]) == target)
            {
                x[0] = i;
                x[1] = j;
            }
            j++;
        }

return x;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,10,11,15};
        int a = 9;

        //Two pointers:
        int[] x = findtwosum(arr,a);
        System.out.println(x[0]);
        System.out.println(x[1]);


        //BRUTEFORCE:
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=i+1;j<arr.length;j++)
//            {
//                if((arr[i] +arr[j]) == a)
//                {
//                    System.out.println(i);
//                    System.out.println(j);
//                }
//            }
//        }




    }
}
