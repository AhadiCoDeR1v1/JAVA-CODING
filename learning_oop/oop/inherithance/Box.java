package inherithance;

public class Box {
    double l;
    double h;
    double w;

    Box() {
        this.l = 14;
        this.h = 0;
        this.w = 0;
    }

    Box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box oldBox) {
        this.l = oldBox.l;
        this.h = oldBox.h;
        this.w = oldBox.w;
    }

    public void display() {
        System.out.println("Length: " + l);
        System.out.println("Height: " + h);
        System.out.println("Width: " + w);
    }
}
