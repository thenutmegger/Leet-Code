import java.util.HashMap;
import java.util.Map;

public class Leetcode_904 {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();

        int n = fruits.length;
        int low = 0;
        int high = 0;
        int ans = 0;

        while(high<n){

            map.put(fruits[high], map.getOrDefault(fruits[high], 0) + 1);

            while(map.size()>2){
                map.put(fruits[low], map.get(fruits[low])-1);

                int frequency_1 = map.get(fruits[low]);

                if (frequency_1 == 0){
                    map.remove(fruits[low]);
                }
                low++;
            }
            ans = Math.max(ans, high-low+1);
            high++;
        }

        return ans;
    }
}
