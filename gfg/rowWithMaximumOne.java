public class rowWithMaximumOne {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int maxRc = 0,maxRp=-1;
        for(int i = 0 ; i<n ; i++){
            int rc = 0;
            for(int j : arr[i]){
                if(j == 1){
                    rc++;
                }
            }
            if(rc>maxRc){
                maxRc = rc;
                maxRp = i;
            }
        }
        return maxRp;
    }
}
