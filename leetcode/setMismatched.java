class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int curr_ind = nums[i]-1;
            if(nums[i]!=nums[curr_ind]){
                int temp = nums[i];
                nums[i] = nums[curr_ind];
                nums[curr_ind] = temp;
            }
            else i++;
        }
        System.out.println(Arrays.toString(nums));
        for(int j = 0 ; j < nums.length ; j++){
            if((j+1)!= nums[j]) return new int[]{nums[j],j+1};
        }  
        return new int[]{-1,-1};     
    }
}
