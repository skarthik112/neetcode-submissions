class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product =1;
        int left =0;
        int count =0;
        if(k<=1) return 0;
        for(int r=0;r<nums.length;r++){
            product*=nums[r];
            while(product>=k){
                product/=nums[left];
                left++;
            }
            count+=r-left+1;
        }
        return count;
    }
}