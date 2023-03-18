public class minJumps {
    static int minimumJumps(int[] arr){
        // your code here
        if(arr.length == 0){
            return -1;
        }
        int far=0,jumps=0,curr=0;
        for(int i = 0 ; i < arr.length -1; i++){
            far = Math.max(far,arr[i]+i);
            if(i==curr){
                curr=far;
                jumps++;
            }
        }
        if(curr<arr.length-1) return -1;
        
        return jumps;
    }
}
