package Day2;

import java.util.Arrays;
import java.util.logging.SocketHandler;

public class Zad16 {
    public static void main(String[] args) {
        int[] inputs = {12, 7, 19,};
        reverseArray(inputs);
        reverseArray1(inputs);
        Arrays.stream(reverseArray(inputs)).forEach(System.out::println);
        System.out.println();
        Arrays.stream(reverseArray1(inputs)).forEach(System.out::println);
    }
    private static int[] reverseArray(int[] inputs) {
        int tmp = inputs[0];
        inputs[0] = inputs[2];
        inputs[2] = tmp;
        return inputs;
    }
    private  static  int[] reverseArray1(int[] inputs){
        for (int i = 0; i < inputs.length/2; i++){
            int temp = inputs [i];
            int nextPosition = (inputs.length -1) -1;
            inputs[i] = inputs[nextPosition];
            inputs[nextPosition] = temp;

        }
        return inputs;
    }
}
