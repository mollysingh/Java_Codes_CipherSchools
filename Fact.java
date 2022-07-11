import java.util.*;
class Fact{
    public static int factFind(int a)
    {
        if(a<=1){
            return 1;
        }

        else{
            return a*factFind(a-1);
        }
    }


    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(factFind(n));
        
    }
}