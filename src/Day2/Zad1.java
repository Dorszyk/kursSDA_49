package Day2;

public class Zad1 {
    public static void main(String[] args) {
        System.out.println("Last char: " + wezOstatniParametr1("ala "));
        System.out.println("Last char: " + wezOstatniParametr2("domek"));
    }

    private static char wezOstatniParametr1(String input) {
        int ostatniaPozycja = input.length() - 1;
        return input.charAt(ostatniaPozycja);
    }


    private static char wezOstatniParametr2(String input) {
        int ostaniaPozycja = input.length() - 1;
        return input.charAt(ostaniaPozycja);
    }

}


