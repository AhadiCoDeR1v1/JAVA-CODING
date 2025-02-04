package generics_ArrayList;

public class Lambdafunctions {
    private int a;
    private int b;
    public Lambdafunctions(int a,int b){

    }
    Lambda sum = (a,b) -> a+b;
    Lambda prod = (a,b) -> a*b;
    Lambda sub = (a,b) -> a-b;

    private  int lambda1 (int a,int b,Lambda op){
         return op.lambda(a,b);
    }

}
interface Lambda {
    int lambda (int a, int b);
}
