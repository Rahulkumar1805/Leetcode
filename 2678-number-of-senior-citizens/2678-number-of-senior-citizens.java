class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i = 0 ; i < details.length ; i++){
            String num = details[i].substring(11,13);
            int curr_age = Integer.parseInt(num);
            if(curr_age > 60)
                count++;
        }
        return count;
    }
}