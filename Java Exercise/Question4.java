import java.util.*;
//Write a function that takes in the radius as input and returns the circumference of a circle.
class Question4{

    public static double calcCircum(int r){
        return 2*3.14*r;
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.print(calcCircum(r));
    }
}