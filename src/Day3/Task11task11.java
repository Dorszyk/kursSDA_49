package Day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task11task11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert date [in format yyy-MM--dd HH:mm:ss ]]: ");
        String input = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime nextLesson = LocalDateTime.parse(input, formatter);
        LocalDateTime now = LocalDateTime.now();

        long days = Duration.between(now, nextLesson).toDays();

        System.out.println(String.format("You have %01d days to the next lesson", days));
        System.out.println(String.format("You have " + days + " days to the next lesson"));

    }
}
