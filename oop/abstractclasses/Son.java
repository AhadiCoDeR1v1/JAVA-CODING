package oop.abstractclasses;

public class Son extends Parent {
    void name(String name) {
        System.out.println("Name: " + name);
    }
    void age(int age) {
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Parent parent = new Son();
        Son son = new Son();
        son.name("John Doe");
        son.age(25);
    }
}
