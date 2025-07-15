class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int count=0;

        if(nums.length == 0) return;
        if( nums.length ==1) return;

        for(int i=0 ; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
                count++;
            }
        }

        for(int i = count; i< nums.length; i++){
            nums[i] =0;
        }
        
    }
}
