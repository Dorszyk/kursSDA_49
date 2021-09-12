package Day2;

public class Zad6 {

    public static void main(String[] args) {
        int result = zwrocIndeksNaKorymJestZnak("Ala ma kota", 'z');
        System.out.println(result);
    }

    private static int zwrocIndeksNaKorymJestZnak(String input, char znak) {
        if (input != null && !input.isBlank()) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == znak) {
                    return i;
                }
            }
        }
        return -1;
    }

}
