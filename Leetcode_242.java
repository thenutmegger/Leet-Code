import java.util.Arrays;

public class Leetcode_242 {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] freqA = new int[26];
        int[] freqB = new int[26];

        for (char a : s.toCharArray()){
            int count = a - 'a';
            freqA[count]++;
        }

        for (char a : t.toCharArray()){
            int count = a - 'a';
            freqB[count]++;
        }

        if (Arrays.equals(freqA, freqB)) {
            return true;
        }

        return false;

    }
}
