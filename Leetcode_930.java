import java.util.HashMap;
import java.util.Map;

public class Leetcode_930 {

    public static int mapSum(Map<Integer, Integer> map){
        int sum = 0;
        for(int key: map.keySet()){
            sum = sum + map.get(key)*key;
        }

        return sum;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,5);
        map.put(2,10);
        map.put(0,5);

        System.out.println(mapSum(map));;
    }
}
