package Array;

public class FindRepeatingElement {
    static int customcall(int[] A)
    {
        //check the positive number
        int value = 0;
        for(int i=0;i<A.length;i++) {
            if (A[Math.abs(A[i])] >=0){
                A[Math.abs(A[i])] = - A[Math.abs(A[i])];
            }
            else
            {
                value = Math.abs(A[i]);
            }
        }
        return value;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,1,5,6,7,6};
        customcall(arr);

    }
}
