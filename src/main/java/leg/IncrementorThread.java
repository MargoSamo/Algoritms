package leg;

public class IncrementorThread extends Thread {
    private final Incrementor incrementor;
    int i = 0;

    public IncrementorThread(Incrementor incrementor) {
        this.incrementor = incrementor;
    }

    @Override
    public void run() {
        while (i < 1000) {
            i++;
            incrementor.increment();
        }
    }
}
