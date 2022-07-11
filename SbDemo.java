import java.util.*;
class SbDemo{
    public static void main(String []args){
        StringBuilder sb=new StringBuilder("Tony");
        
        //sb.delete(0,'S');
        //System.out.print(sb);
        sb.delete(2,3);
        System.out.print(sb);
    }
}