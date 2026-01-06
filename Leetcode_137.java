public class Leetcode_137 {
    public static int singleNumber(int[] nums) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            int sum = 0;
            int maskbit = (1 << i);  // Mask for the current bit position

            // Count the number of 1s at the ith bit position
            for (int num : nums) {
                if ((num & maskbit) != 0) {
                    sum++;
                }
            }

            // If sum is not a multiple of 3, it means the unique number has a 1 in this bit position
            if (sum % 3 != 0) {
                ans |= maskbit;
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        int[] n = {2,2,2,3};
        System.out.printf("ans = " + singleNumber(n));

    }
}
