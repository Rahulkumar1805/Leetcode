class Solution {
    public int minBitFlips(int start, int goal) {
        int temp = start ^ goal;
        String tempBin = Integer.toBinaryString(temp);

        int count = 0;
        for(int i = 0 ; i < tempBin.length() ; i++){
            char ch = tempBin.charAt(i);
            if(ch=='1')
                count++;
        }
        //System.out.println(tempBin);
        return count;
    }
}