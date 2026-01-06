import java.util.HashMap;

public class GFG_largestSubarrayWith0Sum {

        int maxLen( int[] arr, int n)
        {
            // Your code here
            HashMap<Integer, Integer> map = new HashMap<>();
            int sum  = 0;
            int ans  = 0;

            for (int i = 0; i<arr.length; i++){
                sum = sum + arr[i];

                if (sum == 0){
                    ans = i+1;
                }

                if (map.containsKey(sum)){
                    ans = Math.max(ans, i - map.get(sum));
                }
                else{
                    map.put(sum, i);
                }
            }

            return ans;
        }

}
