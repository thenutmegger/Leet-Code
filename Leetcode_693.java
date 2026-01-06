public class Leetcode_693 {
    public boolean hasAlternatingBits(int n) {
        int xor = n ^ (n>>1);

        if ((xor & (xor+1)) == 0){
            return true;
        }

        return false;
    }
}
