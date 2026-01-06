public class Leetcode_2114 {
    public static int mostWordsFound(String[] sentences) {

        int maxCount = 0;

        for (String sen: sentences){

            String[] splited = sen.split(" ");
            if(splited.length > maxCount){
                maxCount = splited.length;
            }

        }

        return maxCount;
    }

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
}