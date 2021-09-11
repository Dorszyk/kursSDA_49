public class Ex5 {

    public static void main(String[] args) {

        int sum = sumDigits(4, 11);
        System.out.println("Sum:" + sum);

    }
    private static int sumDigits(int min, int max) {
        int result = 0;
        for (int i = min; i <= max; i++) {
            result += i;
        }

        int counter = min;
        while (counter <= max) {
            result += counter;
            counter++;
        }
        return result;
    }
}
