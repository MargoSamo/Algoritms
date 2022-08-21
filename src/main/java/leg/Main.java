package leg;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        /*Leg leg = new Leg();
        System.out.println(leg.hasPain());
        leg.injure();
        leg.hasPain();
        System.out.println(leg.hasPain());*/

        //new Walk().startWalking();

        Incrementor incrementor = new Incrementor();
        Thread hm = new Thread(new Runnable() {
            @Override
            public void run() {
                callIncrementInLoop1000Times(incrementor);
            }
        });
        Thread hm1g = new Thread(() -> callIncrementInLoop1000Times(incrementor));

        hm.start();
        hm1g.start();

        hm.join();
        hm1g.join();
        System.out.println(incrementor.getValue());
    }

    public static void callIncrementInLoop1000Times(Incrementor incrementor) {
        int i = 0;
        while (i < 1000) {
            i++;
            incrementor.increment();
        }
    }
}
