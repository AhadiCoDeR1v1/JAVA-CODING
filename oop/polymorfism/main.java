package oop.polymorfism;

public class main {
    public static void main(String[] args) {
        Circle obj1 =new Circle();
        Shapes obj = new Shapes();
        Square obj2 = new Square();
        Shapes obj3 = new Circle();

        // obj.area();
        // obj1.area();
        // obj2.area();
        // obj3.area();
        // obj3.area2();

        obj1.greetings();
        obj2.greetings();
        obj3.greetings();
        obj1.greetings1();

        
    }
        ;
}
