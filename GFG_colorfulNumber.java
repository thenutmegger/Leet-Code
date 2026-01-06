import java.util.HashSet;

public class GFG_colorfulNumber {
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
}
