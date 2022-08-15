package washDish;

import java.util.LinkedList;
import java.util.List;

public class Dishwasher {

    List<Plate> list = new MariaArrayList<>();

    public int countPlates() {
        return list.size();
    }

    public void putPlates(List<Plate> plates) {
        list.addAll(plates);

    }

    /*public int countPlates() {
        return plate;
    }

    public int countStacks() {
        return plate;
    }*/

 }

