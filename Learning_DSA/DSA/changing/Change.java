package changing;

public class Change {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        change(a,b);
        System.out.println(a+""+b);
        {
            a=a+b;
        }
        System.out.println(a+""+b);

    }
    static int change(int a,int b){
        int temp =a;
        a=b;
        b=temp;
        return a;
    }
}
