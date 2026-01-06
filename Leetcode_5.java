public class Leetcode_5 {
    public String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        int n = s.length();
        for (int i = 0; i<n; i++){
            int length = 1;
            int left = i-1;
            int right = i+1;
            while(left>=0 && right<n){
                if (s.charAt(left) == s.charAt(right)){
                    length = length + 2;
                    left--;
                    right++;
                }
                else{
                    break;
                }
            }

            if (length>ans){
                sb.delete(0, sb.length());
                ans = length;
                sb.append(s, left+1, right);
            }

            int left_even = i;
            int right_even = i+1;
            int length_even = 0;

            while(left_even>=0 && right_even<n){
                if (s.charAt(left_even) == s.charAt(right_even)){
                    length_even = length_even + 2;
                    left_even--;
                    right_even++;
                }else{
                    break;
                }
            }

            if (length_even>ans){
                sb.delete(0, sb.length());
                ans = length_even;
                sb.append(s, left_even+1, right_even);
            }
        }

        return sb.toString();

    }
}
