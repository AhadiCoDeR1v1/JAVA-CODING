package oop.classesobject;

import java.util.*;
public class First{
    public static void main(String[]args){
         Student1 ahad = new Student1();
         ahad.rno=13;
         ahad.name="Ahad Iqbal";
         ahad.marks=98.7f;
        System.out.println(ahad.rno);
        System.out.println(ahad.name);
        System.out.println(ahad.marks);
        

    }
}
class Student1{
    int rno;
    String name;
    float marks;
}
