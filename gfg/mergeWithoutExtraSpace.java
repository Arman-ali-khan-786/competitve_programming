import java.util.Arrays;

public class mergeWithoutExtraSpace {
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int i = 0;
        int j = 0;
        int k=n-1;
        while(i<n && j<m){
            if(arr1[i]>arr2[j]){
                long t = arr1[k];
                arr1[k] = arr2[j];
                arr2[j] = t;
                j++;
                k--;
            }else{
                i++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
