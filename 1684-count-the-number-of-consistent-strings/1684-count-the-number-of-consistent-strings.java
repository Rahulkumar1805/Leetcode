class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        HashSet<Character> not_allowed = new HashSet<>();
        
        for(char ch = 'a' ; ch <= 'z' ; ch++){
            if(allowed.indexOf(ch) == -1){
                not_allowed.add(ch);
            }
        }

        int count = 0;

        for(int i = 0 ; i < words.length ; i++){
            boolean flag = true;
            for(int j = 0 ; j < words[i].length() ; j++){
                char ch = words[i].charAt(j);
                if(not_allowed.contains(ch)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}