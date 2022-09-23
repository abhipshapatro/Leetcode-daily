class Solution{
    public int[] plusOne(int[] digits){
        int lastPos = digits.length - 1;
        for(int i = lastPos; i>0 ; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;

        }

        //incase of {9,9,9}
        int newArr[] = new int[digits.length + 1];
        newArr[0] = 1;
        return newArr;
    }
}