class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0,i=m;j<n;j++,i++ ){
            nums1[i]=nums2[j];
        }
        int r=nums1.length;
        mS(nums1,0,r-1);
     }
    public void mer(int[]nums1,int l,int mid,int r){
        ArrayList<Integer>list=new ArrayList<>();
        int left=l;
        int right=mid+1;
        while(left<=mid && right<=r){
            if(nums1[left]<=nums1[right]){
                list.add(nums1[left]);
                left++;
            }else{
                list.add(nums1[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(nums1[left]);
            left++;
        }
        while(right<=r){
            list.add(nums1[right]);
            right++;
        }
        for(int i=l;i<=r;i++){
            nums1[i]=list.get(i-l);
        }
    }
    public void mS(int[] nums1,int l,int r){
        if(l>=r)return;
        int mid=(l+r)/2;
        mS(nums1,l,mid);
        mS(nums1,mid+1,r);
        mer(nums1,l,mid,r);
    }
    
}
/*
Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
*/
