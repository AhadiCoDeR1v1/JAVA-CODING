import java.io.Serializable;
import java.util.ArrayList;

public class Date extends Milk implements Serializable {
    private int currentYear;
    private int currentMonth;
    private int currentDay;
    Person p;
    ArrayList<Milk> milks;
    Date(){

    }
    Date(int currentYear, int currentMonth, int currentDay, Person p,  ArrayList<Milk> m) {
        this.currentYear = currentYear;
        this.currentMonth = currentMonth;
        this.currentDay = currentDay;
        this.p = p;
        this.milks = m;
    }
    public int getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(int currentMonth) {
        this.currentMonth = currentMonth;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(int currentDay) {
        this.currentDay = currentDay;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public ArrayList<Milk> getM() {
        return milks;
    }

    public void setM(ArrayList<Milk> m) {
        this.milks = m;
    }


    public void insertMilk(Milk m){
        if(milks==null){
            milks=new ArrayList<>();
            milks.add(m);
        }
        int length=milks.size();
        boolean check=false;
        for(int i=0;i<length;i++){
            if(milks.get(i).getPerson()==m.getPerson()){
                milks.set(i,m);
                check=true;
                break;
            }
        }
        if(check==false){
            milks.add(m);
        }

    }
}
