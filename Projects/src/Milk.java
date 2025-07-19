import java.io.Serializable;

public class Milk extends Person implements Serializable {
    private int TotalinKg;
    private double rate;
    private Person person;

    Milk(){

    }
    Milk(int kg,double r,Person p){
           TotalinKg=kg;
           rate=r;
           person=p;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setTotalinKg(int kg){
        TotalinKg=kg;
    }
    public void setRate(double r){
        rate=r;
    }
    public int getTotalinKg(){
        return TotalinKg;
    }

    public double getRate() {
        return rate;
    }
}
