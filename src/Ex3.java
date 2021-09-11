import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Proszę wprowadz pierwszą liczbę :");
        int firstDigit = scanner.nextInt();

        System.out.print("Proszę wpisać drugą liczbę ");
        int secondDigit = scanner.nextInt();
        boolean result;

        result = firstDigit > secondDigit ? true : false;
        System.out.println("Czy x jest większe od y: " + result);

        result = firstDigit * 3 > secondDigit ? true : false;
        System.out.println("Czy x*3 jest większe od y: " + result);

        result = (secondDigit++ < ++firstDigit) && (--firstDigit < secondDigit++);
        System.out.println(result);

        result = (firstDigit * secondDigit) % 2 == 0;
        System.out.println(result);

    }
}
