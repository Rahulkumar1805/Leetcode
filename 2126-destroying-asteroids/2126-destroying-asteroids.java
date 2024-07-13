class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        
        int n = asteroids.length;
        for(int i = 0 ; i < n ; i++){
            if(mass >= asteroids[i]){
                mass += asteroids[i];
                if(mass < 0 )
                    return true;
            }
                
            else
                return false;
        }
        return true;
    }
}