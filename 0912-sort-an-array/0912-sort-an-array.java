class Solution {
    public void mergeSort(int[] nums , int f , int l){
        int mid;
        if(f < l){
            mid = f + (l - f) / 2;
            mergeSort(nums , f , mid);
            mergeSort(nums , mid + 1 , l);
            merge(nums , f , mid , l);
        }
        
    }
    
    public void merge(int[] nums , int f , int mid , int l){
        int[] a = new int[nums.length];
        int p1 = f , p2 = mid+1 , p3 = f;
        while(p1 <= mid && p2 <= l ){
            if(nums[p1] < nums[p2]){
                a[p3++] = nums[p1++];
            }
            else{
                a[p3++] = nums[p2++];
            }  
        }
        
        while(p1 <= mid){
            a[p3++] = nums[p1++]; 
        }
        
        while(p2 <= l ){
            a[p3++] = nums[p2++];
        }
        
        for(int i = f ; i <= l ; i++)
            nums[i] = a[i];
    }
    
    public int[] sortArray(int[] nums) {
        int n = nums.length - 1;
        mergeSort(nums , 0 , n);
        return nums;
    }
}