import java.util.Arrays;

public class nonRepeatingNumbers {
    public int[] singleNumber(int[] nums)
    {
        // Code here
        
        int res= 0;
        int ans[] = new int[2];
        for(int i : nums){
            res = res^i;
        }
        int setBit = res & ~(res-1);
        for(int i : nums){
            if((i&setBit) == 0){
                ans[0]^=i;
            }else{
                ans[1]^=i;
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}
