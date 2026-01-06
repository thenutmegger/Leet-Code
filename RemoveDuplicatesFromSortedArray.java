//[0,0,1,1,1,2,2,3,3,4] -- [0,1,2,3,4,_,_,_,_,_]

import java.util.Stack;

public class RemoveDuplicatesFromSortedArray {

    public static int solution (int[] nums){

        Stack<Integer> stack = new Stack<>();
        stack.push(nums[0]);
        for (int i = 1; i<nums.length; i++){
            if (nums[i] != stack.peek()){
                stack.push(nums[i]);
            }
        }
        int k = stack.size();

        for (int i = stack.size()-1; i>=0; i--){
            nums[i] = stack.peek();
            stack.pop();
        }

        return k;
    }
}
