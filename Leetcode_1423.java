public class Leetcode_1423 {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int ans = 0;
        for (int i = 0; i<k; i++){
            sum = sum + cardPoints[i];
        }
        ans = sum;
        int low = k-1;
        int high = cardPoints.length -1;

        while(low>=0){
            sum = sum - cardPoints[low] + cardPoints[high];
            low--;
            high--;
            ans = Math.max(ans, sum);
        }

        return ans;
    }
}
