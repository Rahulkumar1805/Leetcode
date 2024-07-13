class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length + 1];
        for(int i = 1 ; i < arr.length ; i++){
            arr[i] = arr[i-1] + gain[i-1];
        }
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}