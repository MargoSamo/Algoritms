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
        IncrementorThread hm = new IncrementorThread(incrementor);
        IncrementorThread hm1g = new IncrementorThread(incrementor);

        hm.join();
        hm1g.join();
        System.out.println(incrementor.getValue());
    }
}
