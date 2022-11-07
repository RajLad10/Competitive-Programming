/* 
 1. Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Example:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j,sum=0;
        int len = nums.length;
        int[] result = new int[2];
        
        for(i=0;i<len;i++)
        {
            for(j=i+1;j<len;j++)
            {
                           
                sum = nums[i] + nums[j];
                
                if(sum == target)
                {
                    result[0] = i;
                    result[1] = j;
                }    
            }
        }
        return result;
    }
}