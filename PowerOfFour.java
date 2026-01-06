public class PowerOfFour {
    public static boolean func(int number) {

        if (number == 1){
            return true;
        }
        if (number < 4 || number % 4 != 0 ){
            return false;
        }


        return func(number/4);

    }

    public static void main(String[] args) {
        System.out.println(func(16));
        System.out.println(func(12));
        System.out.println(func(8));
        System.out.println(func(64));
        System.out.println(func(15));

    }
}
