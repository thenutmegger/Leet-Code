public class Leetcode_2427 {
    public int commonFactors(int a, int b) {
        int count = 0;
        if (a >= b){
            for (int i = 1; i<=b; i++){
                if (b%i == 0 && a%i==0){
                    count++;
                }
            }
        }
        else{
            for (int i = 1; i<a; i++){
                if (b%i == 0 && a%i==0){
                    count++;
                }
            }
        }

        return count;
    }
}
