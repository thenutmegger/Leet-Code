public class PalindromeNumber{
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
            else{
                break;
            }
        }

        if(sameCount == str.length()/2){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("1234321"));
    }

}