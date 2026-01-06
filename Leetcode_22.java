import java.util.ArrayList;
import java.util.List;

public class Leetcode_22 {
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        Recursion(res, 0, 0, "", n);
        return res;
    }

    static void Recursion(List<String> res, int open, int close, String s, int n){
        if (s.length() == n * 2){
            res.add(s);
            return;
        }
        if(open<n){
            Recursion(res, open+1,close, s+"(" , n);
        }
        if (open>close){
            Recursion(res, open, close+1, s+")", n);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
