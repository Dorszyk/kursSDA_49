package Day2;

public class Zad8 {
    public static void main(String[] args) {

        System.out.println(zamienZnak("Ala mA kOta"));
    }
    private static String zamienZnak(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (character >= 65 && character <= 90) {
                result.append((char) (character + 32));
            } else if (character >= 97 && character <= 122) {
                result.append((char) (character - 32));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}

