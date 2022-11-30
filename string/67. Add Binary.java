class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0, sum = 0, lastDigit = 0;
        String res ="";
        while(i >= 0 || j>= 0 || carry == 1 ){
            sum = carry;
            if( i >= 0){
                sum += a.charAt(i) - '0';
                i--;
            }
            if( j >= 0){
                sum += b.charAt(j) - '0';
                j--;
            }
            
            carry = sum / 2;
            lastDigit = sum % 2;
            res = lastDigit + res;
            
        }
        return res;
    }
}