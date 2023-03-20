import java.util.ArrayList;

public class valueEqualToIndexValue {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < n ;i++){
            if(arr[i] == i+1){
                ans.add(arr[i]);
            }
        }
        
        return ans;
    }
}
