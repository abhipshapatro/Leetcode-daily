class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder s = new StringBuilder();
        
        while(columnNumber > 0){
            columnNumber--;
            int rem = columnNumber % 26;
            char c = (char) ('A' + rem);
            columnNumber /= 26;
            s.append(c);
        }
        
        s.reverse();
        return s.toString();
    }
}