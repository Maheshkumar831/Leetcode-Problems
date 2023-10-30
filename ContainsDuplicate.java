class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>set=new HashSet<>();   //OPTIMAL APPROACH  it takes less time.
        for(int n:nums){                   //TC:O(N) SC:O(N)
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;
        
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
 BETTER APPROACH
       int n=nums.length;                     //Too much of Time taken TC:O(N) SC:O(Nlogn)
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
 BRUTE FORCE APPROACH:
        int n=nums.length;                //Time Limit Exceeded TC:O(N^2) SC:O(1)
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
