import java.util.*;
class HollwB{
    public static void main(String []args){
        int n=4;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
        System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
        System.out.println();
        }
    }
}