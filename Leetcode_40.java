import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        Func(list, temp, candidates, target, 0);
        return list;
    }

    void Func(List<List<Integer>> list, List<Integer> temp, int[] nums, int rem, int start){
        if (rem < 0){
            return;
        }

        if (rem == 0){
            list.add(new ArrayList<>(temp));
        }

        for (int i = start; i<nums.length; i++){
            if(i > start && nums[i]==nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            Func(list, temp, nums, rem-nums[i], i+1);
            temp.remove(temp.size()-1);
        }
    }
}
