class Solution {
    public int minCostToMoveChips(int[] position) {
        
        int noOfEvenCoins = 0, noOfOddCoins = 0;
        for(int i = 0 ; i < position.length; i++){
            if(position[i] % 2 == 0){
                noOfEvenCoins++;
            }
            else{
                noOfOddCoins++;
            }   
        }
        
        return Math.min(noOfEvenCoins, noOfOddCoins);
    }
}
