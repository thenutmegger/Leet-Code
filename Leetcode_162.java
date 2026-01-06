public class Leetcode_162 {

    //Time complexity is O(N)
    public static int findPeakElement_(int[] nums) {
        int previousPointer = 0;

        for (int i = 1; i<nums.length; i++){
            if (nums[i]>nums[previousPointer]){
                previousPointer++;
            }
            else{
                return previousPointer;
            }
        }

        return previousPointer;
    }

    //Time complexity O(log(N))
    public static int findPeakElement(int[] nums) {
        int n = nums.length;

        if(n == 1){
            return 0;
        }

        if(n == 2){
            if (nums[0] > nums[1]){
                return 0;
            }
            return 1;
        }

        if(nums[n-1] > nums[n-2]){
            return n-1;
        }

        if (nums[0] > nums[1]){
            return 0;
        }

        int low = 1;
        int high = n-2;

        while(low<=high){
            int mid = (low+high)/2;

            if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                return mid;
            }

            if (nums[mid-1] > nums[mid]){
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }

        return -1;
    }
}
