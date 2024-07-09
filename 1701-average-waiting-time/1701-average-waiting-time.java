class Solution {
    public double averageWaitingTime(int[][] customers) {
        
        int n = customers.length;
        int[] responseTime = new int[n];
        int lastServedAt = 0;
        for(int i = 0 ; i < n ; i++){
            if(lastServedAt < customers[i][0]){
                responseTime[i] = customers[i][0] + customers[i][1];
                
            }
            else{
                responseTime[i] = lastServedAt + customers[i][1];
            }
            lastServedAt = responseTime[i];
        }
        System.out.println(Arrays.toString(responseTime));
        double totalWaitTime = 0;
        for(int i = 0 ; i < n ; i++){
            totalWaitTime += (responseTime[i] - customers[i][0]);
        }
        System.out.println(totalWaitTime);
        double averageWaitTime = totalWaitTime/n;
        return averageWaitTime;
    }
}