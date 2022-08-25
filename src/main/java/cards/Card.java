package cards;

import java.util.concurrent.atomic.AtomicInteger;

public class Card {
    private static final AtomicInteger counter = new AtomicInteger(1);
    private final int number;
    public Card() {
        number = counter.getAndIncrement();
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                '}';
    }
}
