package washdish;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static ArrayList<Plate> plate = new ArrayList<>();

    public static void main(String[] args) {

        List<Plate> plates = new MariaArrayList<>();
        for(int i = 0; i < 134; i++) {
            plates.add(new Plate());
        }

        Dishwasher dishwasher = new Dishwasher();
        dishwasher.putPlates(plates);
        int numberStacks = dishwasher.countPlates();
        System.out.println(numberStacks);

    }

}
