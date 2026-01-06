//[3,2,2,3] [3] -- [2,2,_,_] -- return 2
//[0,1,2,2,3,0,4,2] [2] -- [0,1,3,0,4,_,_,_] -- return 5

public class RemoveElement {
    public static int solution (int[] nums, int val){
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}
