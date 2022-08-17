package cry;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
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
        var nameToCry = nameToCrySumMap.get(name);
        if (nameToCry == null) {
            return nameToCrySumMap.put(name, 0);
        }
        return nameToCrySumMap.get(name);
    }
}
