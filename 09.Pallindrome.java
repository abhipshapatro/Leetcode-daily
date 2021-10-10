public class Pallindrome {
    
    public boolean isPallindrome(int x){

        int r , s =0 , x1 = x;
        while( x1 > 0){
            r = x1 % 10;
            s= s * 10 + r;
            x1 /= 10;
        }
        if ( s == x)
        return true;
        else
        return false;
    }
}
