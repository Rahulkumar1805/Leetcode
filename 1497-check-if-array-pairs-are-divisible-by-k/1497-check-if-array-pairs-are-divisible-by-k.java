class Solution {
    public boolean canArrange(int[] arr, int k) {

        int n = arr.length;
        int[] freq = new int[k];

        for(int i = 0 ; i < n ; i++){
            arr[i] = ((arr[i] % k)+ k)%k;
            freq[arr[i]]++;
        }
        if(freq[0] % 2 != 0)
            return false;
        for(int i = 1 ; i <= k/2 ; i++){
            int comp = k - i;
            if(freq[comp] != freq[i])
                return false;
        }
        return true;
    }
}