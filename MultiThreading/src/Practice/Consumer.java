package Practice;

public class Consumer implements Runnable {
    private Data data;
    int datac;
    public Consumer(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int datac = data.consume();

        }
    }
}
