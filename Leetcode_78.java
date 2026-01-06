import java.util.ArrayList;
import java.util.List;

public class Leetcode_78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Func (nums, 0 , path, res);
        return res;
    }

    public static void Func(int[] nums, int start, List<Integer> path, List<List<Integer>> res){
        System.out.println("Path = " + path);
        res.add(new ArrayList<>(path));
        System.out.println("Res = " + res);

        for(int i = start; i<nums.length; i++){
            path.add(nums[i]);
            System.out.println("Path inside for = " + path);
            Func(nums, i+1, path, res);
            path.remove(path.size()-1);
            System.out.println("Path after remove = " + path);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
}
