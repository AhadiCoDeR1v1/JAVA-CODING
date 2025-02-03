package oop.interfaces.newdef;

class main implements A,B {

    public void greet(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        main main = new main();
        main.fun();
        main.greet();
    }
}