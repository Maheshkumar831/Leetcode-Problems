    int n=nums.length;
     for(int i=0;i<n-1;i++){                       //Too much of time complexity not run the all testcases.
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]&& Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false; 
