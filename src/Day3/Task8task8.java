package Day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8task8 {

    public static void main(String[] args) {

        String correctFormatNumber1 = "1234";
        String correctFormatNumber2 = "1234,12";
        String correctFormatNumber3 = "-1234,12";
        String inCorrectFormatNumber4 = "--1234";
        String inCorrectFormatNumber5 = "1234.12";
        String inCorrectFormatNumber6 = ",12";

        System.out.println(correctFormatNumber1 + " " + isCorrectNumberFormat(correctFormatNumber1));
        System.out.println(correctFormatNumber2 + " " + isCorrectNumberFormat(correctFormatNumber2));
        System.out.println(correctFormatNumber3 + " " + isCorrectNumberFormat(correctFormatNumber3));

        System.out.println(inCorrectFormatNumber4 + " " + isCorrectNumberFormat(inCorrectFormatNumber4));
        System.out.println(inCorrectFormatNumber5 + " " + isCorrectNumberFormat(inCorrectFormatNumber5));
        System.out.println(inCorrectFormatNumber6 + " " + isCorrectNumberFormat(inCorrectFormatNumber6));
    }

    private static Object isCorrectNumberFormat(String number) {
        String regex = "-?\\d+(,\\d+)?";
        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(number).matches();
    }
}
