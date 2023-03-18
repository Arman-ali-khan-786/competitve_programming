public class findThePositionOfSetBit {


    // Given a number N having only one ‘1’ and all other ’0’s in its binary representation,
    //  find position of the only set bit. If there are 0 or more than 1 set bit the answer should be -1. 
    // Position of  set bit '1' should be counted starting with 1 from LSB side in binary representation of the number.
    
    static int findPosition(int N) {
        // code here
        if(N==0){
            return -1;
        }
        String str = "";
        int c = 0;
        int pos =0 ;
        while(N>0){
            int rem = N%2;
            if(rem == 1){
                c++;
            }else{
                pos++;
            }
            if(c>1){
                return -1;
            }
            str = rem+str;
            N/=2;
        }
        return pos+c;
    }
}
