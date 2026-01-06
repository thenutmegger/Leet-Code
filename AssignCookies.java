//g = [1,1,2,4,5], s = [1,2,3,1]
//[1,1,2,7]
import java.util.Arrays;

public class AssignCookies {
    public static int solution(int[] g, int[] j){
        Arrays.sort(g);
        Arrays.sort(j);
        int k = 0;
        int count = 0;
        for (int value : g) {
            for (; k < j.length; k++) {
                if (j[k] >= value) {
                    count++;
                }
            }
        }

        return count;
    }
}