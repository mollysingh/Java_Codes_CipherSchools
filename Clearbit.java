import java.util.*;
class Clearbit{
    public static void main(String []args){
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        int notbitmask=~(bitmask);
        int newnumber=notbitmask & n;
        System.out.print(newnumber);
    }
}