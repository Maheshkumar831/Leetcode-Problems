class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){//2>0=swap-0,0,,2>1=swap=0,0,1,,2>1=swap=0
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;

                }
            }
        }
    
        
    }
}
/*
Example 1:

Input: nums = [2,0,2,1,1,0]               Time Complexity: O(n^2)
Output: [0,0,1,1,2,2]                     Space Complexity: O(1)
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 */
