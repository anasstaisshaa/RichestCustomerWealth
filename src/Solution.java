class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum1=0;
        for(int i=0;i<accounts.length;i++){
            int sum2 = 0;
            for(int j=0;j<accounts[0].length;j++){
                sum2+=accounts[i][j];
            }
            sum1=Math.max(sum1,sum2);
        }
        return sum1;
    }
}
