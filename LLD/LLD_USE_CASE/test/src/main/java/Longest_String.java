//public class Longest_String {
//    static int[] getMaxLength(String s,int i,int j){
//
//        while(i>=0 && j<=s.length()-1 && s.charAt(i)==s.charAt(j)){
//            i--;
//            j++;
//        }
//        return new int[]{i+1,j-1};
//      //  System.out.println(s.substring(i+1,j));
//       // return j-i-1;
//    }
//    public static void main(String[] args) {
//        String s = "babad";
//
//        String str = longestPalindrome(s);
//
//
//    }
//
//    public static String longestPalindrome(String s) {
//
//        int ans =0;
//        String target = "";
//
//        for(int i=0;i<s.length();i++){
//            int[] len1 = getMaxLength(s,i,i);
//
//            int[] len2 = getMaxLength(s,i,i+1);
//            int diff1 = len1[1]-len1[0]+1;
//            System.out.println(diff1);
//            int diff2 = len2[1]-len2[0]+1;
//            System.out.println(diff2);
//
//            if(ans<diff1)
//            {
//                target = s.substring(len1[0],len1[1]+1);
//            }
//            if(ans<diff2)
//            {
//                target = s.substring(len1[0],len1[1]+1);
//            }
//
//            ans = Math.max(ans,Math.max(diff1,diff2));
//
//
//
////            if(len>0){
////                ans = len;
////                mid = i;
////            }
//        }
//
//        if(ans%2==0)return s.substring(mid+1-ans/2, mid+ans/2+1);
//        return s.substring(mid-ans/2, mid+1+ans/2);
//
//
//
//    }
//}
