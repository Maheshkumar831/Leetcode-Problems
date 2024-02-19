class Solution {
    public int longestConsecutive(int[] nums) {
       int n=nums.length;
       HashSet<Integer>set=new HashSet<Integer>();
       for(int i:nums){
           set.add(i);
       }
       int maxLen=0;
      
       for(int i=0;i<n;i++){
           int num=nums[i];
           if(set.contains(num-1))
                continue;
           int currLen=0;
           while(set.contains(num)){
               currLen++;
               num+=1;
           }
           maxLen=Math.max(maxLen,currLen);

       }
       return maxLen;
        
    }
}

/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 
*/
