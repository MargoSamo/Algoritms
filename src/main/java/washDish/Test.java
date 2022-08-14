package washDish;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Test {

        public static void main(String[] args) {

        // Start each stack max 10 plates
        // how many stacks?
        // Given
        List<Plate> plates = new ArrayList<>();
        for(int i = 0; i < 60; i++) {
            plates.add(new Plate());
        }

        var maxPlatesInStack = 10;
        Deque<Deque<Plate>> platesStacks = new LinkedList<>();
        for (Plate plate : plates) {
            if (platesStacks.isEmpty()) {
                platesStacks.add(new LinkedList<>());
            }
            Deque<Plate> currentStack = platesStacks.getLast();
            if (currentStack.size() == 10) {
                platesStacks.add(new LinkedList<>());
                currentStack = platesStacks.getLast();
            }
            currentStack.push(plate);
        }

        System.out.println(platesStacks.size());


        var platesToRemove = 9;
        for (int i = 0; i < platesToRemove; i++) {
            if (platesStacks.isEmpty()) {
                System.out.println("No plates anymore");
                break;
            }
            Deque<Plate> currentStack = platesStacks.getLast();
            if (currentStack.isEmpty()) {
                platesStacks.removeLast();
                i--;
                continue;
            }

            currentStack.removeLast();
        }
        System.out.println(platesStacks.size());



    }

    private static class Plate {}
}