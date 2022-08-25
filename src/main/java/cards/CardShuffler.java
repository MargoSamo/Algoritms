package cards;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CardShuffler {

    public static void main(String[] args) {
        // Create data structure with 64 cards
        // Create 4 lists
        // give all cards to these lists
        // in sequence first, last, first, last ...
        LinkedList<Card> cardList = Stream.generate(Card::new).limit(64).collect(Collectors.toCollection(LinkedList::new));
        System.out.println(cardList.size());

        var listOfLists = new ArrayList<List<Card>>();
        for (int i = 0; i < 5; i++) {
            listOfLists.add(new ArrayList<>());
        }

        while (!cardList.isEmpty()) {
            listOfLists.forEach(player -> {
                if (!cardList.isEmpty()) {
                    if (cardList.size() % 2 == 0) {
                        player.add(cardList.removeFirst());
                    } else {
                        player.add(cardList.removeLast());
                    }
                }
            });
        }

        listOfLists.forEach(player -> System.out.println("Player cards " +player));
    }
}
