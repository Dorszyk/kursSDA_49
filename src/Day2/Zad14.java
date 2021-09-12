package Day2;

public class Zad14 {
    public static void main(String[] args) {
        int[] arrays = {12, -7, 19, -5};
        int tmp = countNegativDigits(arrays);
        int lenght = countNegativDigits(arrays);
        int[] negativeDigits = createArrayWithNegativeDigits(lenght, arrays);

    }
    private static int countNegativDigits(int[] arrays) {
        int counter = 0;
        for (int i : arrays) {
            if (i < 0) {
                counter++;
            }
        }
        return counter;
    }
    private static int[] createArrayWithNegativeDigits(int lenght, int[] arrays) {
        int[] newArray = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            if (arrays[i] < 0) {
                newArray[i] = i;
            }
        }
        return newArray;
    }
}
