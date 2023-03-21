//############################# PROBLEM OF THE DAY - 21th March 2023 #################################################
// -------------------------------------------------------------------------------------------------------------------

// You are going to book a taxi. There are infinite number of points 1, 2, 3... on the X axis and your current position is cur.
// There are N Taxis near you, and the position of those taxis is given as an array pos. 
// Where pos[i] denotes the position of the ith taxi. You are also given an array time.
// Where time[i] denotes the time taken by the ith taxi to cover 1 unit of distance.
// Your task is to find the minimum time to board a taxi.


package potd;
public class taxi_Booking {
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        // code here
        int min_time = Integer.MAX_VALUE;
        for(int i = 0 ; i<N ; i++){
            min_time = (int)Math.min(min_time,Math.abs((pos[i]-cur))*time[i]);
        }
        return min_time;
    }
}
