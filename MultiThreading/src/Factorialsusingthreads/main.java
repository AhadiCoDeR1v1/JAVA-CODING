package Factorialsusingthreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class main {
    public static void main(String[] args) {
        Factorials fact=new Factorials();
        Counter counter=new Counter();
        AtomicInteger sum= new AtomicInteger();
        long sttime=System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(17);
        for(int i=1;i<6;i++){
            int facti=i;
            executor.submit(()->{
                int result=fact.factorial(facti);
                System.out.println("Factorial of "+facti+" is "+result);


                sum.set(sum.get() + result);



            });
        }




        executor.shutdown();
        executor.shutdown();
        try{
            executor.awaitTermination(100, TimeUnit.SECONDS);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("final time:"+(System.currentTimeMillis()-sttime));
        System.out.println("so sum is "+sum.get());

    }
}
