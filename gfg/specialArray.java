// array is special if the sum of all the elements before it should be lesser than it
public class specialArray {
    public static boolean specialArr(int n, int[] arr) {
        // code here
        int sum=0;
        for(int i = 0 ; i<n-1 ;i++){
            sum+=arr[i];
            if(sum>=arr[i+1]) return false;
        }
        return true;
    }
}
