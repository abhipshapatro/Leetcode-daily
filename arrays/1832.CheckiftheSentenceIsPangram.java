class Solution {
    public boolean checkIfPangram(String sentence) {
        
        String letters = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i<letters.length();i++){
            if(sentence.indexOf(letters.charAt(i)) == -1)
                return false;
        }
        return true;
    }
}