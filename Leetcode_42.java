public class Leetcode_42 {
    public int trap(int[] height) {

        int n = height.length - 1;
        int sum = 0;

        int low = 0;
        int high = n;

        int leftMax = height[0];
        int rightMax = height[n];

        while (low < high) {
            if (leftMax < rightMax) {
                sum = sum + (leftMax - height[low]);
                low++;
                leftMax = Math.max(leftMax, height[low]);
            }else{
                sum = sum + (rightMax - height[high]);
                high--;
                rightMax = Math.max(rightMax, height[high]);
            }
        }

        return sum;
    }
}
