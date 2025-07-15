class Solution {
    public int removeDuplicates(int[] nums) {
      
        int writeIndex = 1; // where to write next unique value

        for (int readIndex = 1; readIndex < nums.length; readIndex++) {
            if (nums[readIndex] != nums[readIndex - 1]) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }

        return writeIndex;
    }
}
