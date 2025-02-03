package oop.inherithance;

public class main {
    public static void main(String[] args) {
        // Box obj =new Box(4);
        // Box obj1 = new Box(obj);
        // System.out.println(obj1.l);
        // Boxweight obj2 = new Boxweight();
        // Boxweight obj3 =new Boxweight(2,4,6,8);

        
        // System.out.println(obj3.l);
        // System.out.println(obj3.w);
        // System.out.println(obj3.h);
        // System.out.println(obj3.weight);
        Boxprice obj =new Boxprice(50, 40,5 ,6 ,3 );

        System.out.println(obj.weight);
        System.out.println(obj.price);
        System.out.println(obj.w);
        System.out.println(obj.l);
        System.out.println(obj.h);

    }
}
