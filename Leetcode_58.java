//"   fly me   to   the moon  "
//"Hello World"
public class Leetcode_58 {
    public static int lengthOfLastWord(String s) {
        int lengthOfString = s.length();
        int wordLength = 0;
        int lastBlanks = 0;

        for(int i = lengthOfString-1; i>= 0; i--){
            if (s.charAt(i) == ' '){
                lastBlanks++;
            }
            else {
                break;
            }
        }
//        System.out.println("Length of string = " + lengthOfString);
//        System.out.println("Last blank = " + lastBlanks);

        int j = lengthOfString - lastBlanks -1;
        while (s.charAt(j) != ' '){
            wordLength++;
            if (j == 0){
                break;
            }
            j--;
        }

        return wordLength;
    }

    public static void main(String[] args) {
        String str1 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(str1));

        String str2 = "Hello World";
        System.out.println(lengthOfLastWord(str2));

        String str3 = "luff is still joy boy";
        System.out.println(lengthOfLastWord(str3));

        String str4 = "a";
        System.out.println(lengthOfLastWord(str4));
    }
}

