class Solution {
    public int maxVowels(String s, int k) {
        int currentVowel = 0;
        int maxVowel = 0;
        
        
        for(int i = 0 ; i < k ; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            currentVowel += 1;
        }
        
        maxVowel = currentVowel;
        for(int i = k ; i < s.length() ; i++){
            char going = s.charAt(i-k);
            char incoming = s.charAt(i);
            if(going == 'a' || going == 'e' || going == 'i' || going == 'o' || going == 'u')
                currentVowel -= 1;
            if(incoming == 'a' || incoming == 'e' || incoming == 'i' || incoming == 'o' || 
               incoming == 'u')
                currentVowel += 1;
            maxVowel = Math.max(currentVowel , maxVowel);

        }
        
        return maxVowel;
    }
}