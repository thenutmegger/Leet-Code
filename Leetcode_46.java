import java.util.ArrayList;
import java.util.List;

public class Leetcode_46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        Func(list, temp, nums);

        return list;
    }

    void Func(List<List<Integer>> list, List<Integer> temp, int[] nums){
        if (temp.size() == nums.length){
            list.add(new ArrayList<>(temp));
        }

        for(int i = 0; i<nums.length; i++){
            if (temp.contains(nums[i])){
                continue;
            }
            temp.add(nums[i]);
            Func(list, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
}
