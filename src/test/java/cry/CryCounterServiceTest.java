package cry;

import org.junit.jupiter.api.Test;

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

}