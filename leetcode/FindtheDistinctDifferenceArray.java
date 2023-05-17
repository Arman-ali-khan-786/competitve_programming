class Solution {
    public int checkDisk(int[] arr,int pos ,int dir){
        if(pos == 0 && dir==0){
            // System.out.println(dir+" "+pos);
            return 1;
        } 
        if(pos == arr.length && dir==1){
            // System.out.println(dir+" "+pos);
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        if(dir == 0){
            for(int i=0;i<=pos;i++){
                set.add(arr[i]);
            }
            
        }else{
            for(int i = pos+1;i<arr.length;i++){
                set.add(arr[i]);
            }
        }
        // System.out.println(set+" "+pos);

        return set.size();


    }
    public int[] distinctDifferenceArray(int[] nums) {
        int res[] = new int[nums.length];
        for(int i = 0 ; i<nums.length ;i++){
            System.out.println( checkDisk(nums,i,0)+" "+checkDisk(nums,i,1));
            res[i] = (checkDisk(nums,i,0)-checkDisk(nums,i,1));
        }

        return res;
    }
}
