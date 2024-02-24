class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            set.add(nums[i]);
            if(set.size()==3)return nums[i];
        }
        return nums[n-1];
    }
}

     /* int n=nums.length;//Brute force approach
        int max=Integer.MIN_VALUE; //it does not pass remaining test cases
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        if(n<3) return max;
        System.out.println(max);
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]<max&&nums[i]>secMax){
                secMax=nums[i];
            }
        }
        System.out.println(secMax);
        int thirdMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]<max&&nums[i]<secMax&&nums[i]>thirdMax){
                thirdMax=nums[i];
            }
        }
        if(thirdMax<0) return max;
        System.out.println(thirdMax);
        return thirdMax;
        }
        }*/


/*
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

 

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.

*/
