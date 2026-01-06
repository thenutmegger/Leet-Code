import java.util.Arrays;
import java.util.Queue;

public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int sum = 0;
        for (int i = 0; i< nums.length; ){
            sum = sum + nums[i];
            i=i+2;
        }

        int[] decompressedArray = new int[sum];

        int counter = 0;
        for (int i =0; i<nums.length;){
            for (int j = 0; j<nums[i]; j++){
                decompressedArray[counter] = nums[i+1];
                counter++;
            }
            i = i +2;
        }
        return decompressedArray;
    }
}
