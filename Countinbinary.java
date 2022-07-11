//Write a program to count the number of 1’s in a binary representation of the number.
import java.util.*;
class Countinbinary{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        String binary=Integer.toBinaryString(n);
        //System.out.print(binary);
        

        int count1=0;
        int count0=0;

        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                count1++;
            }
            else{
                count0++;
            }
        }

        System.out.println("Count of 0 :"+count0);
        System.out.println("Count of 1 :"+count1);

    }
}