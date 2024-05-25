package Array;

public class Equillibrium_Index {
    public static int solve(int[] A) {
        int n = A.length;
        int count=-1;
        int ps[] = new int[n];
        ps[0] = A[0];
        for(int i=1;i<n;i++){
            ps[i] = ps[i-1] + A[i];
        }
        if(ps[n-1]==0) {
            return 0;
        }
        int suml =0;
        int sumr =0;
        for(int i=1;i<A.length;i++)
        {
            suml = ps[i-1];
            sumr = ps[n-1] - ps[i];
            if(suml==sumr){
                count=i;
            }
        }
        return count;
    }
    public static void main (String[] args) {
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        int a = solve(A);



        boolean[] present = new boolean[A.length];

        for(int i=0;i<present.length;i++){
            System.out.println(present[i]);
        }
    }

}
