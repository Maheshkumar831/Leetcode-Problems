class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        for(int i:nums){    //Brute force     TC:O(N^2)     SC:(O(1))
            int count=0;
            for(int j:nums){
                if(i==j){
                    count++;
                }
            }
            if(count>n/2){
                return i;
            }

        }
        return -1;
       
        
    }
}

---------------------------------------------------------------------------------------------------------------------------------------------
      int count=0;                             //Optimal Approach
        int ele=-1;
        for(int i=0;i<nums.length;i++){        //Moore Voting algorithm     TC:O(N)  SC:O(1)
            if(count==0){
                count=1;
                ele=nums[i];
            }
            else if(ele==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return ele;

----------------------------------------------------------------------------------------------------------------------------------------------
        
/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 
*/
