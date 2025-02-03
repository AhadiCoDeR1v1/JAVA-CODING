package oop.interfaces;

public class car implements brake, media {
    public void on() {
        System.out.println("Media on");
    }

    public void off() {
        System.out.println("Media off");
    }

    public void apply() {
        System.out.println("Brake applied");
    }

    public void relaease() {
            System.out.println("Brake released");
        }
    
        public static void main(String[] args) {
            car c = new car();
            c.on();
            c.off();
            c.apply();
            c.relaease();
    }
}
