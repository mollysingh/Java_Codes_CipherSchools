import java.util.*;
//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
class Stringclength{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i].length();
        }

        System.out.print(sum);
    }
}