public class Solution {

  public String intToroman( int n ) {
      String roman[] =  {"I" , "IV", "V", "IX", "X", "XL", "L" ,"XC" ,"C" ,"CD" ,"D", "CM" ,"M"};
      int value[] = {1,5,9,10,40,50,90,100,400,500,900,1000};
      int index = roman.length - 1;
      String str ="";
      while (n>0) {
          while (value[index] <= n) {
              str += roman[index];
              n -= value[index];

          }
          index--;

      }
      return str;
  }
   
}
