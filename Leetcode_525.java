import java.util.HashMap;

public class Leetcode_525 {
    public int findMaxLength(int[] nums) {
        int ans = 0;
        int sum = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if (nums[i] == 0){
                sum = sum - 1;
            }else{
                sum = sum + nums[i];
            }

            if (sum == 0){
                ans=i+1;
            }

            if(map.containsKey(sum)){
                ans = Math.max(ans, i-map.get(sum));
            }else{
                map.put(sum, i);
            }
        }

        return ans;
    }
}
