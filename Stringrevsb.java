import java.util.*;
//reverse a string using stringbuilder
class Stringrevsb{
    public static void main(String []args){
        StringBuilder sb=new StringBuilder("hello");
        for(int i=0;i<sb.length()/2;i++){   //loop runs till half of string length
            int front=i;
            int back=sb.length()-1-i;

            char Frontchar=sb.charAt(front);
            char Backchar=sb.charAt(back);

            sb.setCharAt(front,Backchar);
            sb.setCharAt(back,Frontchar);

        }
        System.out.print(sb);
    }
}