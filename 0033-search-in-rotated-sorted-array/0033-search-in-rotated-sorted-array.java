class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
                return mid;
            //check if the left part is sorted
            if(nums[left] <= nums[mid]){
                //check if the sorted part contains the target
                if(nums[left] <= target && target < nums[mid])
                    right = mid - 1;
                else 
                    left = mid + 1;
            }
            //if the left part is not sorted then the right part must be sorted.
            else{
                //check if the sorted part contains the target.
                if(nums[mid] < target && target <= nums[right])
                    left = mid +  1;
                else 
                    right = mid - 1;   
            }
        }

        return -1;
    }
}