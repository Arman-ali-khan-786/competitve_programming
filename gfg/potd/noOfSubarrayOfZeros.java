//############################# PROBLEM OF THE DAY - 17th March 2023 #################################################
// -------------------------------------------------------------------------------------------------------------------


package potd;

// Number of Subarrays of 0's  

public class noOfSubarrayOfZeros {
    long no_of_subarrays(int N, int [] arr) {
		//Write your code here
		long zeros = 0;
		long no_of_subarrays = 0;
		for(int curr : arr){
		    if(curr==0){
		        zeros++;
		    }if(curr==1){
		        no_of_subarrays += (long)(zeros*(zeros+1)/2);
		        zeros = 0;
		    }
		}
		no_of_subarrays += (long)(zeros*(zeros+1)/2);
		
		return no_of_subarrays;
    }
    
}
