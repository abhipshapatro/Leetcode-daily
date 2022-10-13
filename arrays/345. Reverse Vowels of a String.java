import java.util.*;;
class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> list = new ArrayList<>(
            Arrays.asList('a','e','i','o','u','A','E','I','O','U')
        );
        
        int i = 0;
        int j = s.length() - 1;
        char str[] = s.toCharArray();
        
        while( i < j ){
            if( list.contains(str[i]) && list.contains(str[j]) ){
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
            else if( list.contains(str[i]) && !list.contains(str[j]) ){
                j--;
            }
            else if( !list.contains(str[i]) && list.contains(str[j]) ){
                i++;
            }
            else if( !list.contains(str[i]) && !list.contains(str[j]) ){
                i++;
                j--;
            }
        }
        
        return new String(str);
        
        
    }
}