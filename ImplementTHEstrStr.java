//haystack = "hello", needle = "ll" || 2
//haystack = "aaaaa", needle = "bba" || -1
//haystack = "mississippi", needle = "issipi"  || -1


public class ImplementTHEstrStr {
    public static int strStr(String haystack, String needle){

        if (needle.length()>haystack.length()){
            return -1;
        }

        for (int i = 0; i<haystack.length(); i++){
            if (haystack.substring(i).length() >= needle.length()) {
                if (needle.charAt(0) == haystack.charAt(i)) {
                    if (haystack.substring(i, i + needle.length()).equals(needle)) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args){
        System.out.println(strStr("Orphan Account Review December", "Orphan Account Review"));
        System.out.println(strStr("aaaaa", "bba"));
        System.out.println(strStr("mississippi","issipi"));
    }
}

