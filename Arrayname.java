//Take an array of names as input from the user and print them on the screen.
import java.util.*;
class Arrayname{

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String names[]=new String[n];
        
        for(int i=0;i<n;i++){
            names[i]=sc.next();
        }

        for(int i=0;i<names.length;i++){
            System.out.println("Name "+(i+1)+" is "+names[i]);
        }
    }

}