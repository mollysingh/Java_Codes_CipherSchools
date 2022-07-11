import java.util.*;
//Enter 3 numbers from the user & make a function to print their average.
class Question1{

    public static int calcAverage(int a,int b,int c){
        return (a+b+c)/3;
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.print("Average is: "+calcAverage(a,b,c));
    }
}