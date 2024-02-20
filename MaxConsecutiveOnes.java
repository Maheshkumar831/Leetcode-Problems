class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max=0;
        int currlength=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                currlength++;
                max=Math.max(max,currlength);

            }
            else{
                currlength=0;
            }

        }
        return max;
       
    }
}
