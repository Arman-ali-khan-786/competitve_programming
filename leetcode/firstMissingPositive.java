class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int curr_ind = nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[curr_ind]){
                int temp = nums[i];
                nums[i] = nums[curr_ind];
                nums[curr_ind] = temp;
            }else i++;
        }
        for(int j = 0 ; j<nums.length;j++){
            if(j+1!=nums[j]) return j+1;
        }
        return nums.length+1;
    }
}
