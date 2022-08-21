package leg;

public class Incrementor {

    private int a = 0;

    public synchronized void increment() {
        a++;
    }

    public int getValue() {
        return a;
    }


}
