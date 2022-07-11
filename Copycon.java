//copy constructor
import java.util.*;

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        }

    Student(Student s1){
        this.name=s1.name;
        this.age=s1.age;
    }

    Student(){}             //empty constructor for s1
}


class Copycon{

    public static void main(String []args){
        Student s1=new Student();
        s1.name="Molly";
        s1.age=20;

        Student s2=new Student(s1);
        s2.printInfo();
    }

}