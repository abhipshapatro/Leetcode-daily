class Solution {
    public int maxNumberOfBalloons(String text) {
        String str = "balloon";
        int[] countArray = new int[26];
        int count = Integer.MAX_VALUE;
        for(int i = 0 ; i < text.length() ; i++){
            countArray[text.charAt(i) - 'a']++;
        }
        countArray['l' - 'a'] /= 2;
        countArray['o' - 'a'] /= 2;
        
        for (int i = 0; i < 7; i++) {
            count = Math.min(count, countArray[str.charAt(i)-'a']);
        }
         return count;
    }
}
