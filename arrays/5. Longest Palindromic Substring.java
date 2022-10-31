class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++){
            int curLen = Math.max(getLen(s, i, i), getLen(s, i, i+1));
            if(curLen > maxLen){
                maxLen = curLen;
                start = i - (curLen - 1)/2;
            }
        }
        return s.substring(start, start + maxLen);
    }
    private static int getLen(String s, int l, int r){
        while(l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r - l - 1;
    }
}