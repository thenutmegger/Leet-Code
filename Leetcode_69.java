public class Leetcode_69 {
    public static int mySqrt(int x) {
        long low = 1;
        long high = x;
        long mid;
        long tempAns = 0;
        if (x==0){
            return 0;
        }
        while(low<=high){
            mid = (low + high)/2;
            System.out.println("Mid = " + mid);

            if(mid * mid <= x){
                tempAns = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return (int)tempAns;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }
}
