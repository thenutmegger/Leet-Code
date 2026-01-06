import java.util.HashMap;

public class GFG_arraySubset {
    public String isSubset( long a1[], long a2[], long n, long m) {
        if (a2.length > a1.length) {
            return "No";
        }

        HashMap<Long, Integer> map = new HashMap<>();


        for (long num : a1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        for (long num : a2) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) - 1);
                if (map.get(num) == 0) {
                    map.remove(num);
                }
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}
