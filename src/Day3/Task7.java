package Day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {

    public static void main(String[] args) {
        String correctNRBFormat = "PL10105000997603123456789123";
        String inCorrectNRBFormat = "123123";

        System.out.println(correctNRBFormat + " " + isCorrectNRBFormat(correctNRBFormat));
        System.out.println(inCorrectNRBFormat + " " + isCorrectNRBFormat(inCorrectNRBFormat));
    }
    private static boolean isCorrectNRBFormat(String nrbFormat) {
        // + -> jeden lub wiele znaków
        // * -> zero lub wiele znaków
        // ? -> zero lub jeden znak

        String regex = "PL[0-9]{26}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nrbFormat);
        return matcher.matches();
    }

}
