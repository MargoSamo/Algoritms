package minMaxAvg;

public class MinMaxAvg {

    public static void main(String[] args) {

        int n = 20;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 * Math.random();
        }

        double max = array[0];
        double min = array[0];
        double avg = 0;

        for (int i =0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            avg += array[i] / array.length;
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Avg = " + avg);

    }

}
