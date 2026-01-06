public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        for (int num : nums) {
            int count = 0;
            for (int i : nums) {
                if (num == i) {
                    count++;
                }
            }
            if (count > 1) {
                return true;
            }

        }
        return false;
    }
}
