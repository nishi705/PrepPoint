import java.util.HashMap;

public class Two_Sum {
    /*
    Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */

    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] nums = {3,3};

        int target = 6;

        int[] res = getTwoSum(nums,target);

        System.out.println(res[0]+","+res[1]);



    }
    static int[]  getTwoSum(int[] nums,int target){
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                res[0] = i;
                res[1] = map.get(target-nums[i]);

            }else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}
