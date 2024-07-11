class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(k - nums[i])){
                count++;
                if(map.get(k - nums[i]) > 1)
                    map.put(k - nums[i] , map.get(k - nums[i]) - 1);
                else 
                    map.remove(k - nums[i]);
            }
            else{
                if(map.containsKey(nums[i]))
                    map.put(nums[i] , map.get(nums[i]) + 1);
                else 
                    map.put(nums[i] , 1);
            }
        }
        return count;
    }
}

    //another approach :
    /*
    Arrays.sort(nums);
        int i = 0 , j = nums.length - 1;
        int count = 0;
        while(i < j){
            if(nums[i] + nums[j] == k){
                count++;
                i++;
                j--;
            }
            else if(nums[i] + nums[j] < k)
                i++;
            else 
                j--;

        }
        return count;
    */