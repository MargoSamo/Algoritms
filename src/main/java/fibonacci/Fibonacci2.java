package fibonacci;

import java.util.Arrays;

public class Fibonacci2 {

    public static void main(String[] args) {
        // 0,1,1,2,3,5,8,13,21
        int[] array = new int[9];

        array[0] = 0;
        array[1] = 1;

        for(int i = 2; i < array.length; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        for (int j : array) {
            System.out.print(j + " ");
        }

        Arrays.stream(array).forEach(

                (a) -> {
                    System.out.println(a);
                }

        );

    }
}
