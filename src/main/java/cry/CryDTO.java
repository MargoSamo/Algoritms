package cry;

import java.io.Serializable;
import java.util.HashMap;

public class CryDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    HashMap<String, Integer> nameToCrySumMap = new HashMap<>();

    public CryDTO(HashMap<String, Integer> nameToCrySumMap) {
        this.nameToCrySumMap = nameToCrySumMap;
    }

    public HashMap<String, Integer> getNameToCrySumMap() {
        return nameToCrySumMap;
    }

}

