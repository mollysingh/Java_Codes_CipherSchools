import java.util.*;
public class Functionsum{

    public static int calculateSum(int m,int n){
        int sum=m+n;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(calculateSum(a,b));
    }
}