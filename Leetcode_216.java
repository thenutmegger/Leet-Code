import java.util.ArrayList;
import java.util.List;

public class Leetcode_216 {
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        Func(res, path, k, n, 1);
        return res;
    }

    void Func(List<List<Integer>> res, List<Integer> path, int k, int reminder, int start){
        if (reminder < 0){
            return;
        }
        if (path.size() == k && reminder == 0){
            res.add(new ArrayList<>(path));
        }

        for (int i = start; i < 10; i++){
            if(path.contains(i)){
                continue;
            }
            path.add(i);
            Func(res, path, k, reminder-i, i+1);
            path.remove(path.size()-1);
        }
    }
}
