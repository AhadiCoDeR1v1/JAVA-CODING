package oop.classesobject;
import oop.packagestatic.sist;


public class Second {
    public static void main(String[]args){
        Student ahad = new Student();
        ahad.greeting();
        // System.out.println(ahad.rno);
        // System.out.println(ahad.name);
        // System.out.println(ahad.marks);
        Student saad = new Student (15,"Saad iqbal",90.8f);
        System.out.println(saad.rno);
        System.out.println(saad.name);
        System.out.println(saad.marks);
        saad.greeting();
        sist obj = new sist();
        obj.Greetings();
    }
}
class Student{
    int rno;
    String name;
    float marks;
    void greeting(){
        System.out.println("Hello my name is "+this.name);
    }
    Student(){
        this.rno=13;
        this.name="Ahad Iqbal";
        this.marks=98.7f;
    }
    Student (int roll,String nam,float mark){
        this.rno=roll;
        this.name=nam;
        this.marks=mark;
    }
}