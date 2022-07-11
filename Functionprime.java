import java.util.*;
class Functionprime{
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPrime(n)){
            System.out.print("True");

        }
        else{
            System.out.print("False");
        }
    }
}