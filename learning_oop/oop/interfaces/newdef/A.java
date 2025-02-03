package interfaces.newdef;

public interface A {
    default void fun(){
        System.out.println("now i am default and i am in the interface default mode");
    }
}
