package Practice;

public class Data {
    private int data;
    private boolean hasdata;

    public synchronized void produce(int data) {
        while (hasdata)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.data = data;
        System.out.println(Thread.currentThread().getName()+"produced:" + data);
        hasdata = true;
        notify();
    }
    public synchronized int consume() {
        while (!hasdata)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasdata = false;
        System.out.println(Thread.currentThread().getName()+"consumed:" + data);
        notify();
        return data;
    }
}
