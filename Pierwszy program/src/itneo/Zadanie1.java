package itneo;

public class Zadanie1 {

    public static void main(String[] args) {
        wyswietlLiczbyOd5Do25();
        wyswietlLiczbyOd55Do80();
        wyswietlLiczbyOd1Do100zaczynajacOd100();
        wszystkieLiczbyParzysteOd0Do100();
        sumaLiczbOd01Do50();
        sumaWyrazowCiaguArytmetycznego();
    }

    private static void wyswietlLiczbyOd5Do25() {
        for (int i = 5; i <= 25; i++) {
            System.out.println("Numer: " + i);
        }
        System.out.println();
    }

    private static void wyswietlLiczbyOd55Do80() {
        for (int i = 55; i <= 80; i++) {
            System.out.println("Numer: " + i);
        }
        System.out.println();
    }

    private static void wyswietlLiczbyOd1Do100zaczynajacOd100() {
        for (int i = 100; i > 0; i--) {
            System.out.print("Numer: " + i);
        }
        System.out.println();
    }

    private static void wszystkieLiczbyParzysteOd0Do100() {
        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void sumaLiczbOd01Do50() {

        int suma = 1;
        for (int i = 1; i <= 50; i++) {
            suma = suma + i;
            System.out.println(suma);
        }
    }

    private static void sumaWyrazowCiaguArytmetycznego(){


    }
}

