public class Leetcode_35 {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int startIndex = 0;
        int lastIndex = n-1;
        int ans = 0;

        while(startIndex <= lastIndex){
            int mid = (startIndex+lastIndex)/2;
            ans = mid;

            if(nums[mid] == target){
                return mid;
            }
            else if(target< nums[mid]){
                lastIndex = mid-1;
            }
            else {
                startIndex = mid+1;
            }
        }

        if (target < nums[ans] && ans != 0){
            return ans;
        }

        else if (target > nums[ans]){
            return ans+1;
        }

        return 0;

    }
}
