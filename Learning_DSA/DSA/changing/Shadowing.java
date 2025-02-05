package changing;

public class Shadowing {
    static int x=50;
    public static void main(String[] args) {
        System.out.println(x);
        int x =40;
        System.out.println(x);
        {
            x=70;
        }
        System.out.println(x);
        fun();
        System.out.println(x);
    }
    static void fun(){
        System.out.println(x);
        int x=100;
        System.out.println(x);
    }
}
