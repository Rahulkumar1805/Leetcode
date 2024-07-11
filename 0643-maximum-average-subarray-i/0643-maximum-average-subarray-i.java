class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average = Double.MIN_VALUE;
        double currentAverage = 0;
        int currentSum = 0;
        
        
        for(int i = 0 ; i < k ; i++){
            currentSum += nums[i];
        }
        currentAverage = (double)currentSum / k;
        
        for(int i = k ; i < nums.length ; i++){
            currentSum = currentSum - nums[i - k] + nums[i]; 
            currentAverage = Math.max(currentAverage , (double) currentSum / k);
        }
        
        return currentAverage;
        
    }
}