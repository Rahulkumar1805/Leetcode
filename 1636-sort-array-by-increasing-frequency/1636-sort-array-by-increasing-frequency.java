class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for(int num : nums){
            if(frequencies.containsKey(num)){
                frequencies.put(num , frequencies.get(num) +1);
            }
            else{
                
                frequencies.put(num , 1);
            }
        }
        
        Integer[] temp = new Integer[nums.length];
        for(int i = 0 ; i < temp.length ; i++)
            temp[i] = nums[i];
    
        Arrays.sort(temp, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (frequencies.get(a).equals(frequencies.get(b))) {
                    return b - a;
                } else {
                    return frequencies.get(a) - frequencies.get(b);
                }
            }
        });
        for(int i = 0 ; i < temp.length ; i++)
            nums[i] = temp[i];
        return nums;
    }
}