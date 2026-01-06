public class Leetcode_1358  {
    public int numberOfSubstrings(String s) {
        int[] last = {-1,-1,-1};

        int count = 0;

        int n = s.length();

        for(int i = 0; i<n; i++){
            last[s.charAt(i) - 'a'] = i; //important concept
            count = count + Math.min(Math.min(last[0], last[1]), last[2])+1;
        }

        return count;
    }
}
