public class GFG_insertionSort {
    public void insertionSort(int arr[], int n)
    {
        //code here
        for(int i = 1; i<n; i++){
            int key = i;

            for(int j = 0; j<i; j++){
                if (arr[key] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[key];
                    arr[key] = temp;
                }
            }
        }
    }
}
