package Array;

public class BestTimeToBuyAndSell {
    public static void main(String[] args) {

       int[] A = {4,1,2,-2,3,2,5};
        int n = A.length;

        int ans = 0;

        //PS for even indexed:
        int[] pse = new int[n];
        pse[0] = A[0];
        for(int i=1;i<n;i++)
        {
            if(i%2==0)
            {
                pse[i] = pse[i-1] + A[i];
            }
            else
            {
                pse[i] = pse[i-1];
            }
        }
       // System.out.println(pse[n-1]);

       // PS for odd indexed:
        int[] pso = new int[n];
        pso[0] = A[1];
        pso[1] =A[1];
        for(int i=2;i<n;i++)
        {
            if(i%2==1)
            {
                pso[i] = pso[i-1] + A[i];
            }
            else
            {
                pso[i] = pso[i-1];
            }
        }
        //System.out.println(pso[n-1]);

        int se = 0;
        int so = 0;

        for(int i=1;i<n-1;i++)
        {
            se = pse[i-1] + (pso[n-1] + pso[i]);
            so = pso[i-1] + (pse[n-1] + pse[i]);

            if(pse==pso)
            {
                ans++;
            }
        }



    }
}
