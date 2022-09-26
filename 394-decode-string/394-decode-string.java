class Solution {
    int i = 0; //loop control
    public String decodeString(String s) {
        
       StringBuilder str = new StringBuilder();
        int counter = 0 ;
        while(i < s.length()){
            char ch = s.charAt(i);
            i++;
            if(Character.isLetter(ch)){
                str.append(ch);
            }
            else if(Character.isDigit(ch)){
                counter = counter * 10 + Character.getNumericValue(ch); //n*10+5
            }
            else if(ch == ']'){
                break;
            }
            else if(ch == '['){
                String repeat = decodeString(s);
                while (counter > 0) {
                    str.append(repeat);
                    counter--;
                } 
            }
        }
        return str.toString();
    }
}