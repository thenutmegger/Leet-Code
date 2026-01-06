import java.util.Arrays;

public class MakeTwoArraysEqualByReversingSubArrays {

    public static boolean solution(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);

        int count = 0;

        for(int i =0; i<target.length; i++){
            if(target[i] == arr[i]){
                count++;
            }
        }

        if (count == target.length){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] target_1 = {1,2,3,4};
        int[] arr_1 = {2,4,1,3};
        System.out.println(solution(target_1, arr_1));

        int[] target_2 = {7};
        int[] arr_2 = {7};
        System.out.println(solution(target_2, arr_2));

        int[] target_3 = {1,5,7};
        int[] arr_3 = {1,5,9};
        System.out.println(solution(target_3, arr_3));
    }
}
