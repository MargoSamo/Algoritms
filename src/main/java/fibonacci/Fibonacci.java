package fibonacci;

import java.util.Arrays;

public class Fibonacci {

    private static int arrayLength = 8;

    public static void main(String[] args) {
        var expected = new int[] {0, 1, 1, 2, 3, 5, 8, 13};
        int[] result = calculate();
        System.out.println(">>> " + Arrays.equals(expected, result));
    }

    public static int[] calculate() {
        int[] data = new int[8];
        data[0] = 0;
        data[1] = 1;
        for (int i = 2; i<data.length; i++) {
            data[i] = data[i-1] + data[i-2];
        }
        return data;
    }
}
