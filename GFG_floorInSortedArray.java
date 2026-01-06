public class GFG_floorInSortedArray {
    static int findFloor(long arr[], int n, long x)
    {
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low+high)/2;

            if (arr[mid] == x){
                return mid;
            }
            else if(x<arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(low);

        if (low == 0) {
            return -1;
        }

        return high;

    }

    public static void main(String[] args) {
        long[] arr = new long[]{71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112};

        int n = 42;

        long x = 68;

        System.out.println(findFloor(arr, n, x));


    }
}
