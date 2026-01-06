public class Leetcode_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int tempSum = 0;
        for (int i = 0; i<nums.length; i++){

            if (nums[i] == 1){
                tempSum++;
            }

            else{
                if (tempSum>res){
                    res = tempSum;
                    tempSum = 0;
                }
                else{
                    tempSum = 0;
                }
            }

        }

        if (tempSum > res){
            return tempSum;
        }
        return res;
    }
}
