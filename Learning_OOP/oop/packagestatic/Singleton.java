package packagestatic;

public class Singleton {
    private Singleton(){

    }
    private static Singleton instance;
    public static Singleton getinstance() {
        if (instance==null){
            instance = new Singleton();
        }
        return  instance;
    }
}
