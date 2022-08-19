package leg;

public class Walk {

    public void startWalking() {
        Leg leftLeg = new Leg(Side.LEFT);
        Leg rightLeg = new Leg(Side.RIGHT);

        LegStepperThread leftThread = new LegStepperThread(leftLeg, rightLeg);
        LegStepperThread rightThread = new LegStepperThread(rightLeg, leftLeg);

        leftThread.start();
        rightThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
