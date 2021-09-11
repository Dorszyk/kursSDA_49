public class Ex6 {

    public static void main(String[] args) {

        printMultiplicationTable(6, 0, 5);

    }

    private static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMultiplicand) {

        for (; minMultiplicand <= maxMultiplicand; minMultiplicand++) {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " * " + minMultiplicand + " = " + result);
        }

    }
}
