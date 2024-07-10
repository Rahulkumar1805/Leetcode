class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution= new int[2];
        LinkedHashMap<Integer,Integer> map= new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i = 0;i<nums.length;i++){
            int y = target - nums[i];
            if(map.containsKey(y) && i!=map.get(y)){
                solution[0]=i;
                solution[1]=map.get(y);
                return solution;
            }
        }

        return solution;
    }
}