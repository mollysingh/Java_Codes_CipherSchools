//take matrix as input. search for a number x and print the indices at which it occurs.
import java.util.*;
class TwoDArray{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter the number to search: ");
        int key=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==key){
                    System.out.println("Number found at index: "+"["+i+"],["+j+"]");
                }
            }
        }
    }
}