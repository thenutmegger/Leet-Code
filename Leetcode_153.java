public class Leetcode_153 {
        public static int findMin(int[] nums) {
            int n = nums.length;
            int low = 0;
            int high = n-1;
            int mid = 0;


            if (n==1){
                return nums[0];
            }

            if(nums[low] < nums[high]){
                return nums[low];
            }

            while(low<=high){
                mid = (low+high)/2;

                if (nums[mid] > nums[mid+1]){
                    return nums[mid+1];
                }

                else if (nums[low] <= nums[mid]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }

            return nums[mid];
        }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,1};
        int[] arr_1 = {3,4,5,1,2};
        int[] arr_2 = {3,1,2};
        int[] arr_3 = {4,5,1,2,3};

//        System.out.println(findMin(arr));
//        System.out.println(findMin(arr_1));
//        System.out.println(findMin(arr_2));
        System.out.println(findMin(arr_3));
    }
}
