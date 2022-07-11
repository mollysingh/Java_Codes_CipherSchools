abstract class Animal{                               //here animal class details are irrelevant for the user because user creates horse or chicken obj not 
                                                          //animal object. hence animal class can be declared abstract
    abstract void walk();                                   //no definition of abstract class. it is added to child classes
}

class Horse extends Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}



public class Abstractionex{
    public static void main(String []args){
        Horse h1=new Horse();
        h1.walk();

        // Animal a1=new Animal();      //now this won't run and will give RTE as animal class is abstract and can't be instantiated
        // a1.walk();          
    }
}