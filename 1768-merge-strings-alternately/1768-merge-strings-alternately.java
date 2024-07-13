class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0,k=0;
        int len1=word1.length();
        int len2=word2.length();
        StringBuilder str = new StringBuilder();
        while(i<len1&& j<len2){
            if(k%2==0)
                str.append(word1.charAt(i++));
            else
                str.append(word2.charAt(j++));
            k++;
        }
        while(i<len1){
            
            str.append(word1.charAt(i++));
            k++;
        }
        while(j<len2){
            str.append(word2.charAt(j++));
            k++;
        }
        return str.toString();
    }
}