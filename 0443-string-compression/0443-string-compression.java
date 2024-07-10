class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1)
            return 1;
        int count = 1;
        int j = 0;
        for(int i = 0 ; i < chars.length ; i++){
            count = 1;
            while(i + 1 < chars.length && chars[i] == chars[i+1]){
                count++;
                i++;
            }
            chars[j++] = chars[i];
            if(count > 1){
                String num = Integer.toString(count);
                for(int k = 0 ; k < num.length() ; k++)
                    chars[j++] = num.charAt(k);
            }
            
        }
        return j;
    }
}