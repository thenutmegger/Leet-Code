import java.util.ArrayList;

public class GFG_mergeSort {

    void merge(int arr[], int l, int m, int r)
    {
        // Your code here
        int i = l;
        int j = m+1;
        ArrayList<Integer> temp = new ArrayList<>();

        while(i<=m && j<=r){
            if(arr[i] < arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;
            }
        }

        while(i<=m){
            temp.add(arr[i]);
            i++;
        }
        while(j<=r){
            temp.add(arr[j]);
            j++;
        }

        for(int k = l; k<=r; k++){
            arr[k] = temp.get(k-l);
        }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l<r){
            int m = (l+r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
}
