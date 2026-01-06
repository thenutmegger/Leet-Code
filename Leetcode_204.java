public class Leetcode_204 {
    public int countPrimes(int n) {
        //Seive of Eratosthenes algorithm

        if (n<=2){
            return 0;
        }

        boolean[] composite = new boolean[n];
        int limit = (int) Math.sqrt(n);

        for (int i = 2; i<=limit; i++){
            if (composite[i] == false){
                for(int j = i*i; j<n; j=j+i){
                    composite[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i<n; i++){
            if (composite[i] == false){
                count++;
            }
        }

        return count;

        //Time Complexity - O(sqrt(n) * log(log(n)))
        //Space Complexity - O(n)
    }
}
