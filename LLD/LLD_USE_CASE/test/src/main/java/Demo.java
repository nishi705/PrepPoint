import java.util.ArrayList;

public class Demo {
    //ab12xy34zz006

    //1234
    //-2,0,2,4,5,7
    //4,16,25,49
    public static void main(String[] args) {




        //2,4,5,7\\

        ArrayList<Integer> list = arr.stream().filter(x->(x)%2!=0).map(x->(x*x)).collect(Collectors.toList);


        int[] arr1={-3,-2,-1};
        int[] arr2 = {2,4,5};

        ArrayList<Integer> al = merge(arr1,arr2);

        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }


    }
    static ArrayList<Integer> merge(int[] arr1,int[] arr2){
        ArrayList<Integer> al = new ArrayList<>();

        int i=0;
        int j=0;

        while(i<arr1.length && j<arr2.length) {
            if (arr1[i] < arr2[j]){
            al.add(arr1[i]);
            i++;
        }
                    else{
                        al.add(arr2[j]);
                        j++;

            }
        }


        while(i<arr1.length){
            al.add(arr1[i]);
            i++;
        }

        while(j<arr2.length){
            al.add(arr2[j]);
            j++;
        }
        return al;
    }



}
