import java.util.*;

class Pen{
    String color;
    String type;

    public void printColor(){
        System.out.println(this.color);
    }
    
}

class oops1{
    public static void main(String []args){
        Pen pen1=new Pen();
        pen1.color="blue";

        Pen pen2=new Pen();
        pen2.color="red";

        pen1.printColor();
        pen2.printColor();

    }
}