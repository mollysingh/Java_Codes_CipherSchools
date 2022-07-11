import java.util.*;
class Updatebit{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int operation=sc.nextInt();
        int n=5;
        int pos=1;

        int bitmask=1<<pos;

        if(operation==1){
            //set
            int newnumber=bitmask | n;
            System.out.print(newnumber);
        }
        else{
            //clear
            int newbitmask= ~(bitmask);
            int newnumber=newbitmask & n;
            System.out.print(newnumber);
        }
    }
}