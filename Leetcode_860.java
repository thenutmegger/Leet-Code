public class Leetcode_860 {

    public static boolean lemonadeChange(int[] bills) {
        int count_five = 0;
        int count_ten = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                count_five++;
            }

            if (bills[i] == 10) {
                if (count_five > 0) {
                    count_five--;
                    count_ten++;
                }
                else {
                    return false;
                }
            }

            if (bills[i] == 20) {
                if (count_five > 0 && count_ten > 0) {
                    count_five--;
                    count_ten--;
                }

                else if (count_ten == 0 && count_five > 2) {
                    count_five = count_five - 3;
                }
                else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] test = {5,5,5,5,10,5,10,10,10,20};
        System.out.println(lemonadeChange(test));

    }
}
