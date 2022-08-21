package leg;

public class LegStepperThread extends Thread {
    private final Leg leg;
    private final Leg otherLeg;
        int i = 0;

    public LegStepperThread(Leg leg, Leg otherLeg) {
        this.leg = leg;
        this.otherLeg = otherLeg;
    }

    @Override
    public void run() {
        while (i < 1000) {
            i++;
            synchronized (leg) {
                try {
                    synchronized (otherLeg) {
                        otherLeg.notify();
                    }
                    leg.step();
                    leg.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
