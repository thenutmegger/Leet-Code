//        Example 1:
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

//        Example 2:
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]

//        Example 3:
//        Input: nums = [3,3], target = 6
//        Output: [0,1]

import java.util.HashMap;

public class Leetcode_1 {

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

    public static int[] twoSum_1(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        int [] result = new int[2];

        for(int i = 0; i<nums.length; i++){
            int x = target-nums[i];
           if (map.containsKey(x)){
               return new int[]{map.get(x), i};
           }
           else{
               map.put(nums[i], i);
           }
        }

        return new int[] {};
    }

    public static void main(String[] args) {

        int[] test_case_1 = {2,7,11,15};
        int[] output = twoSum(test_case_1, 9);

        for(int element : output){
            System.out.println(element);
        }
    }

}
