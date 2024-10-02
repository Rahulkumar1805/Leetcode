class Solution {
    public int findMin(int[] nums) {
        if(nums[0] <= nums[nums.length - 1])
            return nums[0];
        int l = 0;
        int r = nums.length - 1;
        int small = Integer.MAX_VALUE;
        while(l <= r){
            int m = l + (r - l) / 2;
            if(nums[l] <= nums[m]){
                small = Math.min(small , nums[l]);
                l = m + 1;
            }
            else{
                small = Math.min(small , nums[m]);
                r = m - 1;
            }
        }
        return small;
    }
}