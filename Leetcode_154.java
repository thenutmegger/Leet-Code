public class Leetcode_154 {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        if (nums[low] < nums[high]){
            return nums[low];
        }

        while(low<high){
            int mid = (low+high)/2;

            if (nums[mid] == nums[high]){
                high--;
            } else if (nums[mid] > nums[high]) {
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {

    }
}
