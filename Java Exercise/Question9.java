//Write a function that calculates the Greatest Common Divisor of 2 numbers. 
import java.util.*;
class Question9{

    public static int calcGcd(int num1,int num2){
        int gcd=0;
        for(int i=1;i<=num1||i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }


    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt(),num2=sc.nextInt();
        System.out.print(calcGcd(num1,num2));
    }
}