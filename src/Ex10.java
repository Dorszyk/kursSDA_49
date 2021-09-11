import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Proszę wprowadź liczbę całkowią :");

        int number = scanner.nextInt();

        System.out.println(sumOfDigits(number));
    }
    private static int sumOfDigits(int number) {
        if(number <= 9){
            return number;
        }
        int sum = 0;
        do{
            sum += number%10;
            number /=10;
        }while (number !=0);

        return sum;
    }

}
