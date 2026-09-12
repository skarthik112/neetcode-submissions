class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int left = 0;
        int sum =0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                min = Math.min(min, r-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}