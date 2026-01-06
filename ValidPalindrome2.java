public class ValidPalindrome2 {

    public static Boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        int sameCount = 0;

        while(i<j){
            if(str.charAt(i) == str.charAt(j)){
                sameCount++;
                i++;
                j--;
            }
        }

        if(sameCount == str.length()/2){
            return true;
        }

        return false;
    }

    public static Boolean solution(String s){

        if (isPalindrome(s)){
            return true;
        }

        int i = 0;
        int j = s.length()-1;


        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{ //why else
                break;
            }
        }

        if (isPalindrome(s.substring(i, j - 1)) || isPalindrome(s.substring(i + 1, j))){
            return true;
        }
        return false;
    }

}
