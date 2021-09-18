package Day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(isCorrectFormat("1234,1234"));
        System.out.println(isCorrectFormat("1234a1234"));
        System.out.println(isCorrectFormat("-1234a1234"));
        System.out.println(isCorrectFormat("---1234a1234"));
        System.out.println(isCorrectFormat("1234.1234"));
    }
    private static boolean isCorrectFormat(String input) {
        String regex = "-?\\d+(,\\d+)?";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}

