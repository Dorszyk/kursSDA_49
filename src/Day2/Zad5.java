package Day2;

public class Zad5 {
    public static void main(String[] args) {
        int result = zwrocLiczbeznakow("Ala ma kota", 'a');
        System.out.println(result);
    }

    private static int zwrocLiczbeznakow(String input, char znak) {
        if (input.isEmpty()) {
            return 0;
        }
        int licznik = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == znak) {
                licznik++;
            }
        }
        return licznik;
    }

}
