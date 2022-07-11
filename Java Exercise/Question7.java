import java.util.*;
//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
class Question7{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int p=0,neg=0,z=0;
        System.out.println("Press 1 to continue and 0 to exit: ");
        int n=sc.nextInt();
        while(n==1){
            System.out.println("Enter number :");
            int num=sc.nextInt();
            if(num>0){
                p++;
            }
            else if(num==0){
                z++;
            }
            else{
                neg++;
            }
        

            System.out.println("Press 1 to continue and 0 to exit: ");
            n=sc.nextInt();
        }

        System.out.println("Positives: "+p);
        System.out.println("Negatives: "+neg);
        System.out.println("Zeroes: "+z);
    }
}