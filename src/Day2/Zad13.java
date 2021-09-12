package Day2;

public class Zad13 {
    public static void main(String[] args) {
        int[] arrays = {12, 7, 19};

        int minValue = getMinValue(arrays);
        int maxValue = getMaxValue(arrays);
        int sum = getSum(arrays);
        System.out.println("Najmniejsza liczba :" + minValue);
        System.out.println("Największa liczba :" + maxValue);
        System.out.println("Suma liczb :" + sum);
    }
    private static int getMinValue(int[] arrays) {

        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arrays.length; i++) {
            if (minValue > arrays[i]) {
                minValue = arrays[i];
            }
        }
        return minValue;
    }
    private static int getMaxValue(int[] arrays) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arrays.length; i++) {
            if (maxValue < arrays[i]) {
                maxValue = arrays[i];
            }
        }
        return maxValue;
    }
    private static int getSum(int[] arrays) {
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        for (int i : arrays) {
            sum += i;
        }
        return sum;

    }
}
