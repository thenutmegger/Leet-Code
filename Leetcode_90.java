import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        Arrays.sort(nums);

        Func(nums, 0, path, res);

        return res;
    }

    void Func(int[] nums, int start, List<Integer> path, List<List<Integer>> res){
        res.add(new ArrayList<>(path));

        for (int i = start; i<nums.length; i++){

            if (i>start && nums[i] == nums[i-1]){
                continue;
            }
            path.add(nums[i]);
            Func(nums, i+1, path, res);
            path.remove(path.size()-1);
        }
    }
}
