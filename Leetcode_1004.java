public class Leetcode_1004 {
    public int longestOnes(int[] nums, int k) {
        int flips = 0;
        int ans = 0;
        int i = 0;
        int j = 0;
        int n = nums.length;

        while(i<n){
            if(nums[i] == 0){
                flips++;
            }

            while(flips>k){
                if (nums[j] == 0){
                    flips--;
                }
                j++;
            }

            ans = Math.max(ans, i-j+1);
            i++;
        }

        return ans;
    }
}
