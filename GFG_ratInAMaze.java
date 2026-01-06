import java.lang.reflect.Array;
import java.util.ArrayList;

public class GFG_ratInAMaze {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> res = new ArrayList<>();
        String temp = "";
        Func(m,0,0,temp,res);
        return res;
    }

    static void Func(int[][] m, int i, int j, String temp, ArrayList<String> res){
        if (i == m.length-1 && j == m[0].length-1){
            if (m[i][j] == 1){
                res.add(temp);
            }
            return;
        }

        if (i<0 || j<0 || i>m.length-1 || j>m[0].length-1 || m[i][j] == 0){
            return;
        }

        m[i][j] = 0;
        Func(m, i, j+1, temp+'R', res); //To move right
        Func(m, i-1, j, temp+'U', res); //To move up
        Func(m, i, j-1, temp+'L', res); //To move left
        Func(m, i+1, j , temp+'D', res); //To move down

        m[i][j] = 1;

    }
}
