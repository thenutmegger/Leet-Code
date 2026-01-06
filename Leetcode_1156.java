public class Leetcode_1156 {
    public int maxRepOpt1(String text) {
        int n = text.length();
        int[] freq = new int[26];

        for (char c : text.toCharArray()) {
            freq[c - 'a']++;
        }

        int ans = 0;

        for (int ch = 0; ch < 26; ch++) {
            char target = (char) ('a' + ch);

            int left = 0, right = 0;
            int diff = 0;

            while (right < n) {
                if (text.charAt(right) != target) {
                    diff++;
                }

                while (diff > 1) {
                    if (text.charAt(left) != target) {
                        diff--;
                    }
                    left++;
                }

                int windowLen = right - left + 1;
                ans = Math.max(ans, Math.min(windowLen, freq[ch]));
                right++;
            }
        }

        return ans;
    }
}
