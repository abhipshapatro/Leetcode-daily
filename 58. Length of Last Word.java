class Solution {
    public int lengthOfLastWord(String s) {
        String word = "";
        s = s.trim();
        for(int i = s.length()-1 ; i >=0  ; i--){
            if(s.charAt(i) == ' ')
                break;
            word = s.charAt(i) + word;
        }
        return word.length();  
    }
}