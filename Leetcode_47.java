import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_47 {
    class Solution {
        public static List<List<Integer>> permuteUnique(int[] nums) {
            List<List<Integer>> list = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();
            Arrays.sort(nums); // Sort the array to handle duplicates
            boolean[] used = new boolean[nums.length];

            Func(list, temp, nums, used);

            return list;
        }

        public static void Func(List<List<Integer>> list, List<Integer> temp, int[] nums, boolean[] used) {
            if (temp.size() == nums.length) {
                list.add(new ArrayList<>(temp));
                return;
            }

            for (int i = 0; i < nums.length; i++) {
                if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                    continue; // Skip duplicates
                }

                temp.add(nums[i]);
                used[i] = true;
                Func(list, temp, nums, used);
                used[i] = false;
                temp.remove(temp.size() - 1);
            }
        }

        public static void main(String[] args) {
            System.out.println("This is working");
            int[] nums = {1,2,3,4};
            System.out.println(permuteUnique(nums));
        }
    }

}
