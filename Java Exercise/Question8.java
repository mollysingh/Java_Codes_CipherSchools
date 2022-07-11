//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
import java.util.*;
class Question8{

    public static int calcPower(int x,int n){
        int res=1;
        for(int i=1;i<=n;i++){
            res=res*x;
        }
        return res;
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),n=sc.nextInt();
        System.out.print(calcPower(x,n));
    }
}