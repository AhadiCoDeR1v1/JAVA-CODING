package Practice;

public class main {
    public static void main(String[] args)  {
       try{
           Data data = new Data();

           Thread t1 = new Thread(() -> {
               for (int i = 0; i < 10; i++) {
                   data.produce(i);
               }
           }, "Producer");
           Thread t2 = new Thread(() ->{
               for (int i = 0; i < 10; i++) {
               int datac = data.consume();
               }}, "Consumer");
           t1.start();
           t2.start();

           t1.join();
           t2.join();
       }
       catch (InterruptedException e){
           System.out.println(e);
       }

    }
}
