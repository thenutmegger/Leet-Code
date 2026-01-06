public class Leetcode_2259 {
    public static String solution(String number, char digit) {
        String result = "";
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String a = number.substring(0, i) + number.substring(i + 1);
                if (result.compareTo(a) < 0){
                    result = a;
                }
            }
        }

        return result;
    }
}