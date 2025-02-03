package inherithance;

public class Boxweight extends Box{
    double weight;
    public Boxweight(){
        this.weight=0;
    }
    public Boxweight(double l, double h, double w, double weight){
        super(l,h,w);
        this.weight=weight;
    }
}