** Solution in Python:

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        my_dict = {}
        for i in range(len(nums)):
            complement = target - nums[i]
            if complement in my_dict:
                return i, my_dict[complement]
            else:
                my_dict[nums[i]] = i

        


***************************************************************************************
** Solution in Java:

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] indices = new int [2];

        for (int i =0; i< nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return indices;
    }
}


    
