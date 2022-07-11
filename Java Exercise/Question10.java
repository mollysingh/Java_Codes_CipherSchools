import java.util.*;
//Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 21 ..... 
class Question10{

    public static int fib(int a){
        if(a<=1){
            return a;
        }
        return fib(a-1)+fib(a-2);
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fib(i)+" ");
        }
    }
}
