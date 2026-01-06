import java.util.ArrayList;
import java.util.List;

public class Leetcode_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int i = 0;

        while(i<n){
            int correctIndex = nums[i]-1;

            if (nums[i] <= n && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int j = 0; j<nums.length;j++){
            if (nums[j] != j+1){
                ans.add(j+1);
            }
        }

        return ans;
    }
}
