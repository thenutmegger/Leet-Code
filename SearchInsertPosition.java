//Input: nums = [1,3,5,6], target = 5
//        Output: 2

//Input: nums = [1,3,5,6], target = 2
//        Output: 1

//Input: nums = [1,3,5,6], target = 7
//        Output: 4
public class SearchInsertPosition {
    public static int searchInsert (int[] nums, int target){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                return i;
            }
            else if (nums[i] > target){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,6};
        System.out.println(searchInsert(arr1,5));
        System.out.println(searchInsert(arr1,2));
        System.out.println(searchInsert(arr1,7));
    }
}
