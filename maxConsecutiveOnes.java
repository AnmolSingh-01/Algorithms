//Given a binary array nums, return the maximum number of consecutive 1's in the array.
//Input: nums = [1,1,0,1,1,1]
//Output: 3
  
//Input: nums = [1,0,1,1,0,1]
//Output: 2    --------------------------------------------- Leetcode array problem

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       
        int count = 0;
        int result =0;
        
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0) count = 0;
            else{
                count++;
                result = Math.max(result,count);
            }
        }
        return result;
        
    }
}
