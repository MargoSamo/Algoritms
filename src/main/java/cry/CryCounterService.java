package cry;

import java.util.HashMap;

public class CryCounterService {

    HashMap<String, Integer> nameToCrySumMap = new HashMap<>();

    public void cry(String name, int i) {
        var nameToCry = nameToCrySumMap.get(name);
        if (nameToCry != null) {
            nameToCrySumMap.put(name, nameToCry + i);
        }
        else {
            nameToCrySumMap.put(name, i);
        }
    }

    public int getSumCry(String name) {
       return nameToCrySumMap.get(name);
    }
}
