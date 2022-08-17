package cry;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CryCounterServiceTest {

    @Test
    public void shouldSumCriesForName() {
        // Given
        String name = "Vasa";
        CryCounterService service = new CryCounterService();

        // When
        service.cry(name, 5);
        service.cry(name, 10);

        // Then
        assertThat(service.getSumCry(name)).isEqualTo(15);
    }

    @Test
    public void shouldCriesForName() {
        // Given
        String name = "Sava";
        CryCounterService service = new CryCounterService();

        // When
        service.cry(name, 5);
        // service.cry(name, 10);

        // Then
        assertThat(service.getSumCry(name)).isEqualTo(5);
    }

    @Test
    public void whenSerializingAndDeserializing_ThenObjectIsTheSame() throws IOException, ClassNotFoundException {
        // Given
        var map = new HashMap<String, Integer>();
        map.put("Vasia", 4);
        CryDTO cryDTO = new CryDTO(map);

        FileOutputStream fileOutputStream
                = new FileOutputStream("yourfile.txt");
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(cryDTO);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream
                = new FileInputStream("yourfile.txt");
        ObjectInputStream objectInputStream
                = new ObjectInputStream(fileInputStream);
        CryDTO p2 = (CryDTO) objectInputStream.readObject();
        objectInputStream.close();
        assertThat(p2.nameToCrySumMap).isNotEmpty();
    }


}