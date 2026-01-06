public class Leetcode_1664 {
    public int waysToMakeFair(int[] nums) {
        int[] pfe = new int[nums.length];
        int[] pfo = new int[nums.length];

        pfe[0] = nums[0];
        pfo[0] = 0;

        for (int i = 1; i<nums.length; i++){
            if (i % 2 == 0){
                pfe[i] = pfe[i-1] + nums[i];
            }
            else{
                pfe[i] = pfe[i-1];
            }
        }

        for (int i = 1; i<nums.length; i++){
            if (i % 2 == 0){
                pfo[i] = pfo[i-1];
            }
            else{
                pfo[i] = pfo[i-1] + nums[i];
            }
        }

        int count = 0;
        for (int i = 0; i<nums.length ; i++){
            int sumEven;
            int sumOdd;
            if (i == 0){
                sumEven = pfo[nums.length-1] - pfo[i];
                sumOdd = pfe[nums.length -1] - pfe[i];
            }
            else{
                sumEven = pfe[i-1] + pfo[nums.length-1] - pfo[i];
                sumOdd = pfo[i-1] + pfe[nums.length-1] - pfe[i];
            }

            if (sumEven == sumOdd){
                count++;
            }
        }

        return count;

    }
}
