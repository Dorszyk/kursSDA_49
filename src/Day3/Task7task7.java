package Day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7task7 {
    public static void main(String[] args) {
        String correctIban = "PL10105000997603123456789123";
        String inCorrectIban = "PL123456";
        System.out.println(correctIban + " " + isCorrectIbanFormat(correctIban));
        System.out.println(inCorrectIban + "" + isCorrectIbanFormat(inCorrectIban));
    }

    private static boolean isCorrectIbanFormat(String iban) {

        String regex = "PL[0-9]{26}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(iban);
        return matcher.matches();
    }
}
