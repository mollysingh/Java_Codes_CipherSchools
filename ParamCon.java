//parameterized constructor
import java.util.*;

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
}

class ParamCon{
    public static void main(String []args)
    {
        Student s1=new Student("Molly",20);
        s1.printInfo();
    }
}