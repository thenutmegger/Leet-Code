//strs = ["flower","flow","flight"] Output = "fl"
//strs = ["flower","flow","zebra"] Output = ""

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String solution(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }


        public static void main (String[]args){
            String[] s = {"flower", "flow", "flight"};
            String[] z = {"dog", "racecar", "car"};

            System.out.println(solution(s));
            System.out.println(solution(z));

        }
    }
