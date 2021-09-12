package Day2;

public class Zad4 {
    public static void main(String[] args) {
        zamienPrzecinkiKropki("Ala.ma.kota,a.kot,ma Ale");
    }
    private static void zamienPrzecinkiKropki(String input) {
        String result = input
                .replace(",","-STOP-")
                .replace(".","-STOP-")
                .replace(" ","-STOP-");

        System.out.println("Zmieniony tekst: "+ result);
    }
}

