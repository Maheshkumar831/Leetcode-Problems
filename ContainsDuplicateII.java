class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer>set=new HashSet<>();   //OPTIMAL APPROACH TC:O(N) SC:O(N)
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>k){
                set.remove(nums[i-k-1]);
            }
            if(!set.add(nums[i])){
                return true;
            }
            
        }
        return false;
       
    }
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
BRUTE FORCE APPROACH
    int n=nums.length;
          for(int i=0;i<n-1;i++){                       //Too much of time complexity not run the all test cases. TC:O(N^2)  SC:O(1)
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]&& Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false; 
