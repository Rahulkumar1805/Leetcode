class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++){
            set.add(arr[i]);
        }
        int[] sorted = new int[set.size()];
        int i = 0;
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            sorted[i++] = it.next();
        }
        Arrays.sort(sorted);
        
        for(i = 0 ; i < arr.length ; i++){
            int n = binary(sorted,0, sorted.length-1, arr[i]);
            arr[i] = n;
        }
        return arr;
    }
    public int binary(int[] arr, int f, int l, int key){
        int mid = f + (l-f)/2;
        if(arr[mid] == key)
            return mid+1;
        if(arr[mid] < key){
            return binary(arr, mid+1, l , key);
        }
        else return binary(arr, 0 , mid-1 , key);
    }
}