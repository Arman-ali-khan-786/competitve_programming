/*
//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends
*/
class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int merged[] = new int[r-l+1];
         int idx1 = l, idx2 = m+1, x = 0;
         while(idx1<=m && idx2 <= r){
             if(arr[idx1]<=arr[idx2]) merged[x++] = arr[idx1++];
             else merged[x++] = arr[idx2++];
         }
         while(idx1<=m){ merged[x++] = arr[idx1++];}
         
         while(idx2<=r){ merged[x++] = arr[idx2++];}
         
         for(int i = 0 , j = l ; i<merged.length ; i++,j++){
             arr[j] = merged[i];
         }
         
    }
  // in-place sorting
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l>=r) return;
        int mid = l + (r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}
