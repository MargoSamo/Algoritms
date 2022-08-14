package washDish;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static ArrayList<Plate> plate = new ArrayList<>();

    public static void main(String[] args) {

        List<Plate> plates = new ArrayList<>();
        for(int i = 0; i < 134; i++) {
            plates.add(new Plate());
        }

    }

}
