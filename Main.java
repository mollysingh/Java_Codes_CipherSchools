import java.util.*;
class Main{
    public static int fib(int n){
        
        if(n<=1){
            return n;
        }

        return fib(n-1)+fib(n-2);
        
    }


    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        //int ans=fib(a)%10;
        //System.out.print(ans);
        for(int i=0;i<=a;i++){
            System.out.print(fib(i)+" ");
        }
    }
}