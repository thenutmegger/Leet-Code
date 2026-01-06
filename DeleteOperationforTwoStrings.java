public class DeleteOperationforTwoStrings {

    public static int minDistance(String word1, String word2){
        int count = 0;
        for(int i = 0; i<word1.length(); i++){
            for(int j = 0; j<word2.length(); j++){
                if (word1.charAt(i) == word2.charAt(j)){
                    count++;
                }
            }
        }

        return word1.length()+word2.length()-(count*2);
    }

    public static void main(String[] args) {
        String str_1 = "umbrella";
        String str_2 = "rella";
        System.out.println(minDistance(str_1, str_2));
    }

}
