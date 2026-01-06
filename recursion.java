public class recursion {
    public static void print(int n){
        if (n <= 0){
            return;
        }

        print (n-1);
        System.out.println(n);
    }

    public static int pow(int base, int power){
        if (power == 0){
            return 1;
        }

        return base * pow(base, power-1);
    }

    public static int sumOfDigits(int n){

        if (n<=0){
            return 0;
        }

        return sumOfDigits(n/10) + n%10;
    }

    public static int sumOfDigitsSingleDigit(int n){
            if (n<=0){
                return 0;
            }
            if ((sumOfDigits(n/10) + n%10) % 9 == 0){
                return 9;
            }
            return (sumOfDigits(n/10 + n%10)) % 9;

    }

    public static void main(String[] args) {
        System.out.println(pow(2,3));
        System.out.println(sumOfDigitsSingleDigit(12399999));
        System.out.println(sumOfDigits(12399999));
    }
}
