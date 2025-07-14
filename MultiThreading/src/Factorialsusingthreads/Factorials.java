package Factorialsusingthreads;

public class Factorials {
    int fact;
     Factorials(){

    }
    public int factorial(int n){
         if(n==1){
             return 1;
         }
         else{
             return n*factorial(n-1);
         }
    }
}
