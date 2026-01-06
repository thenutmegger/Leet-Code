public class Leetcode_2390 {
    public static String removeStars(String s) {
        //try string builder only, else it is failing
        StringBuilder sb = new StringBuilder(s);

        int low = 0;
        int high = 0;
        for (int i = 0; i<s.length(); i++){
            if(sb.charAt(i) == '*'){
                low--;
                high++;

                if (sb.charAt(high) != '*') {
                    char temp = sb.charAt(low);
                    sb.setCharAt(low, sb.charAt(high));
                    sb.setCharAt(high, temp);
                    low++;
                    high++;

                }else{
                    low--;
                    high++;
                }
            }else{
                low++;
                high++;
            }
        }

        return sb.substring(0,low);
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";

        System.out.printf(removeStars(s));
    }
}
