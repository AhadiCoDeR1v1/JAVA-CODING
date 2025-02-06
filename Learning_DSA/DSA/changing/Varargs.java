package changing;

public class Varargs {
    public static void main(String[] args) {
         fun(3,3,3,3,3,3,3,3,3);
    }
    static void fun(int ...v){
        System.out.println(v.length);

    }
}
