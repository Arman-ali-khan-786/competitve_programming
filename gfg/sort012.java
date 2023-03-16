class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int beg = 0;
        int mid = 0;
        int end = n-1;
        while(mid<=end){
            int t;
            if(a[mid]==0){
                t = a[beg];
                a[beg] = a[mid];
                a[mid] = t;
                beg++;
                mid++;
            }else if(a[mid]==2){
                t = a[mid];
                a[mid] = a[end];
                a[end] = t;
                end--;
            }
            else{
                mid++;
            }
        }
        
    }
}