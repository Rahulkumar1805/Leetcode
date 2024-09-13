class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {

        int[] prefix_XOR = new int[arr.length +1];
        for(int i = 1 ; i < prefix_XOR.length ; i++){
            prefix_XOR[i] = prefix_XOR[i-1] ^ arr[i-1];
        }

        int result[] = new int[queries.length];

        for(int i = 0 ; i < queries.length ; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            if(left == 0)
                result[i] = prefix_XOR[right+1];
            else{
                result[i] = prefix_XOR[left] ^ prefix_XOR[right+1];
            }
        }

        return result;
        
    }
}