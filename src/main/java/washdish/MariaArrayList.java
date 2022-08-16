package washdish;

import java.util.ArrayList;

public class MariaArrayList<T> extends ArrayList<T> {

    @Override
    public boolean add(T element) {
        System.out.println("Ya array list dlya Marii. Element" + element + "Byl dobavlen!!!!");
        return super.add(element);
    }
}
