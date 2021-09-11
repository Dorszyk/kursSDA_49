import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2ex2 {

    private final static float PI = 3.14f;

    public static void main(String[] args) {

        float radius = getDiameterFromUser() / 2;
        float circumferenceOfACircle = calculateCircumferenceOfACircle(radius);


        System.out.println("Circumference Of A Circle " + circumferenceOfACircle);
        System.out.println("Circumference Of A Circle: %2f \n" + circumferenceOfACircle);
        System.out.format("Circumference Of A Circle: %2f \n" + circumferenceOfACircle);


    }

    private static float calculateAreaOfACircle(float radius) {
        return PI * radius *radius;
    }

    private static float circumferenceOfACircle(float radius) {

        return PI * (radius / 2) * (radius / 2);
    }

    private static float calculateCircumferenceOfACircle(float radius) {

        return 2 * PI * radius ;
    }

    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        float diameter = 0;
        try {
            System.out.println("Proszę wstawić średnicę: ");
            diameter = scanner.nextFloat();
        } catch (InputMismatchException ex) {
            System.out.println("Proszę wstawić tylko liczby");
            System.exit(1);
        }
        return diameter;
    }
}
