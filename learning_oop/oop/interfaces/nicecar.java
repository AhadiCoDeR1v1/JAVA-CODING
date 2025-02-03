package interfaces;

public class nicecar {
    private engine e;

    public nicecar(engine e) {

        this.e = new auto();
    }

    public void upgradeto(engine e) {
        this.e = e;
    }

    public static void main(String[] args) {
        nicecar n = new nicecar(new auto());
        n.e.start();
        n.e.stop();
        n.upgradeto(new auto());
        n.e.start();
        n.e.stop();
    }
}
