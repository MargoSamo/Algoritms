package leg;

public class Leg {

    private boolean pain;
    private final Side side;

    public Leg(Side side) {
        this.side = side;
    }

    public void injure() {
        pain = true;
    }

    public boolean hasPain() {
        return pain;
    }

    public void heal() {
        pain = false;
    }

    public void step() {
        System.out.println("Step leg " + side);
    }

}
