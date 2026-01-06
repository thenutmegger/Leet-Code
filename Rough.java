import java.util.*;


public class Rough {

    //PayPal
    public static void sortArray(int[] nums){

        int low = 0;
        int n = nums.length;
        int high = n-1;


        for(int i = 0; i<n ; i++){
            if (nums[low] == 0 ){
                low++;
            }
            else if (nums[high] == 1){
                high--;
            }
            else{
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                high--;
            }

        }
    }

    //PayPal
    public static boolean compareString(String s1, String s2){
        HashMap<Character, Integer> map = new HashMap<>();

        if (s1.length() != s2.length()){
            return false;
        }

        for(int i = 0; i<s1.length(); i++){
            if (map.containsKey(s1.charAt(i))){
                int frequency = map.get(s1.charAt(i));
                frequency++;
                map.put(s1.charAt(i), frequency);
            }
            else{
                map.put(s1.charAt(i), 1);
            }
        }

        for (int j = 0; j < s2.length(); j++){
            if (map.containsKey(s2.charAt(j)) && map.get(s2.charAt(j)) > 0){

                int frequency = map.get(s2.charAt(j));
                frequency--;
                map.put(s2.charAt(j), frequency);
            }

            else {
                return false;
            }
        }

        return true;



    }

    public static int[][] antiDiagonal(int[][] A){
        int n = A.length;
        int m = A[0].length;

        int ans_row = n + m -1;
        int[][] ans = new int[ans_row][m];

        int row = 0;
        int ansRow = 0;

        for (int col = 0; col<m; col++){
            int i = row;
            int j = col;
            int ansCol = 0;
            while (i<n && j>=0){
                ans[ansRow][ansCol] = A[i][j];
                i++;
                j--;
                ansCol++;
            }
            ansRow++;
        }

        int colDiagonal = m-1;
        for (int rowDiagonal = 1; rowDiagonal<n; rowDiagonal++){
            int i = rowDiagonal;
            int j = colDiagonal;
            int ansCol = 0;
            while (i<n && j>=0){
                ans[ansRow][ansCol] = A[i][j];
                i++;
                j--;
                ansCol++;
            }
            ansRow++;
        }
        return ans;
    }

    public static boolean isLowerCase(char A){
        return A >= 97 && A <= 122;
    }

    public static boolean isUpperCase(char A){
        return A >= 65 && A <= 90;
    }

    public static String solve(String A) {
        StringBuilder sbWord = new StringBuilder();
        StringBuilder sbSentence = new StringBuilder();

        for (int i = A.length()-1; i>=0; i--){
            System.out.println("ChatAt = " + A.charAt(i));
            if (isLowerCase(A.charAt(i)) || isUpperCase(A.charAt(i))){
                sbWord.append(A.charAt(i));
                System.out.println("sbWord = " + sbWord);
            }else if(!isLowerCase(A.charAt(i)) && !isUpperCase(A.charAt(i))){
                sbWord.reverse();
                sbSentence.append(sbWord);
                sbSentence.append(" ");
                sbWord.delete(0, sbWord.length());
            }
        }

        sbWord.reverse();
        sbSentence.append(sbWord);

        System.out.println("length = " + sbSentence.length());

        return sbSentence.toString().trim();

    }

    public static String longestPalindrome(String A) {

        StringBuilder sb = new StringBuilder();
        int ans = 0;
        int n = A.length();
        for (int i = 0; i<n; i++){
            int length = 1;
            int left = i-1;
            int right = i+1;
            while(left>=0 && right<n){
                if (A.charAt(left) == A.charAt(right)){
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
                sb.append(A, left+1, right-1);
            }

            int left_even = i;
            int right_even = i+1;
            int length_even = 0;

            while(left_even>=0 && right_even<n){
                System.out.println("Here");
                if (A.charAt(left_even) == A.charAt(right_even)){
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
                sb.append(A, left_even+1, right_even);
            }
        }

        return sb.toString();
    }

    public static int consecutiveOnes(String A) {
        int n = A.length();

        int onesCount = 0;
        for (int i = 0; i<n; i++){
            if (A.charAt(i) == '1'){
                onesCount++;
            }
        }

        if (onesCount == n){
            return onesCount;
        }

        int ans = 0;

        for (int i = 0; i<n; i++){
            if (A.charAt(i) == '0'){
                int leftCount = 0;
                int j = i-1;

                while(j>=0 && A.charAt(j) == '1'){
                    leftCount++;
                    j--;
                }

                int rightCount = 0;
                int k = i+1;
                while (k<n && A.charAt(k) == '1'){
                    rightCount++;
                    k++;
                }

                if (onesCount == (leftCount+rightCount)){
                    ans = Math.max(ans, (leftCount+rightCount));
                }else{
                    ans = Math.max(ans, (leftCount+rightCount+1));
                }
            }

        }

        return ans;
    }

    public static int majorityElement(final int[] A) {
        //Moore's voting algorithm

        int majorityElement = A[0];
        int frequency = 0;

        for (int i = 0; i<A.length; i++){
            if (A[i] == majorityElement){
                frequency++;
            }else{
                if (frequency != 0){
                    frequency--;
                }
                if (frequency == 0){
                    majorityElement = A[i];
                    frequency = 1;
                }
            }
        }

        return majorityElement;

    }

    public static int repeatedNumber(int[] A) {
        //Boyer-Moore's voting algorithm
        if (A.length == 1){
            return A[0];
        }

        int first = 0;
        int second = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0 ; i<A.length; i++){
            if (A[i] == first){
                count1++;
            }else if (A[i] == second){
                count2++;
            }else if (count1 == 0){
                first = A[i];
                count1 = 1;
            }else if (count2 == 0){
                second = A[i];
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int i = 0; i<A.length; i++){
            if (A[i] == first){
                count1++;
            }else if (A[i] == second){
                count2++;
            }
        }

        if (count1 > A.length/3){
            return first;
        }
        if (count2 > A.length/3){
            return second;
        }

        return -1;

    }

    public static int anagramStrings(String A, String B) {

        if (A.length() != B.length()) {
            return 0;
        }

        int[] freqA = new int[26];
        int[] freqB = new int[26];

        for (char a : A.toCharArray()){
            int count = a - 'a';
            freqA[count]++;
        }

        for (char a : B.toCharArray()){
            int count = a - 'a';
            freqB[count]++;
        }

        if (Arrays.equals(freqA, freqB)) {
            return 1;
        }

        return 0;
    }



    public static int colorful(int A) {
        String s = String.valueOf(A);
        int n = s.length();

        HashSet<Integer> set = new HashSet<>();

        // Generate all consecutive substrings
        for (int i = 0; i < n; i++) {
            int product = 1;

            for (int j = i; j < n; j++) {
                int digit = s.charAt(j) - '0';
                product *= digit;

                // If product already exists, not colorful
                if (set.contains(product)) {
                    return 0;
                }

                set.add(product);
            }
        }

        return 1;

    }

    public static void main(String[] arr) {

    }
}