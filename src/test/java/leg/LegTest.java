package leg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LegTest {
    private Leg leg;

    @BeforeEach
    public void setUp() {
        leg = new Leg();
    }

    @Test
    public void shouldPainIfInjured() {
        // When
        leg.injure();

        // Then
        assertThat(leg.hasPain()).isTrue();
    }

    @Test
    public void injuredLegShouldNotPainIfHeal() {
        // Given
        shouldPainIfInjured();

        // When
        leg.heal();

        // Then
        assertThat(leg.hasPain()).isFalse();
    }

}
