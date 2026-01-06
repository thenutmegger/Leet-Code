public class Leetcode_121 {
    class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length <= 1){
                return 0;
            }

            int ans = 0;
            int n = prices.length - 1;
            int max = prices[n];

            for (int i = n ; i>=0; i--){
                if (prices[i] > max){
                    max = prices[i];
                }

                ans = Math.max(ans, max-prices[i]);
            }

            return ans;
        }
    }
}
