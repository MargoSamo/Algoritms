package leg;

public class LegStepperThread extends Thread {
    private Leg leg;

    public LegStepperThread(Leg leg) {
        this.leg = leg;
    }

    @Override
    public void run() {
        while (true) {
            leg.step();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
