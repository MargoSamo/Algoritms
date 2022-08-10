package bubble;
public class Bubble {
    static int[] number = {8, 3, 7, 1, 9, 4};
    public static void main(String[] args) {

        for(int i = 0; i < number.length; i++) {
            for(int j = i + 1; j < number.length; j++) {
                if(number[i] > number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
            System.out.println(number[i]);
        }
    }
}

