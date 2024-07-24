class Solution {
    public int[] dejumbleArray(int[] mapping, int[] nums){
        int n = nums.length;
        int[] dejumbledArr = new int[n];

        for(int j = 0 ; j < n ; j++){
            int dejumbledNum = nums[j];
            if(dejumbledNum == 0){
                dejumbledArr[j] = mapping[0];
                continue;
            }

            int i = 0;
            int result = 0;
            while(dejumbledNum > 0){
                int d = dejumbledNum % 10;
                int newD = mapping[d];
                result = newD * (int) Math.pow(10 , i) + result;
                dejumbledNum = dejumbledNum / 10;
                i++;
            }
            dejumbledArr[j] = result;
        }
        return dejumbledArr;
    }
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int[] dejumbledArr = dejumbleArray(mapping , nums);
        Integer[] index = new Integer[nums.length];
        for(Integer i = 0 ; i < index.length ; i++)
            index[i] = i;
        Arrays.sort(index , new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return dejumbledArr[a] - dejumbledArr[b];
            }   
        });

        int[] result = new int[nums.length];
        int i = 0 ;
        for(int ind : index){
            result[i] = nums[ind];
            i++;
        }
        return result;

    }
}