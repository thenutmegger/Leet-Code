public class Leetcode_191 {
    public int hammingWeight(int n) {
        /*
        int count = 0;

        while(n>0){
            n = n & (n-1);
            count++;
        }

        return count;
        */

        int count = 0;

        int maskbit = 1;

        for (int i = 0; i<32; i++){
            if ((maskbit & n) != 0){
                count ++;

            }
            maskbit = maskbit<<1;
        }

        return count;
    }
}
