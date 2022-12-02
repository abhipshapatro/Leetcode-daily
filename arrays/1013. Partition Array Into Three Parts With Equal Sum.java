class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0,c=0,sum=0;
        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }
        if(totalSum % 3 != 0)
            return false;
        
        int eachSum = totalSum/3;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum == eachSum){
                c++;
                sum = 0;
            }
        }
        // it is always c==3 but in case of [0,0,0,0] Tsum=0 and c > 3
        if(c >= 3)
            return true;
        
        return false;
        
    }
}

