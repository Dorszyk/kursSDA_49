package itneo;

public class InstrukcjaWarunkowa {

    public static void main(String[] args) {

        deklaracja2zmiennych();
    }

    private static void deklaracja2zmiennych() {

        int zmienna1 = 70;
        int zmienna2 = 60;

        int a = 70, b = 60;
        int c = a > b ? a : b;
        int d = Math.max(a, b);

        System.out.println(c);
        System.out.println(d);

        if (zmienna1 < zmienna2) {
            System.out.print(zmienna2);
        } else if (zmienna2 > zmienna1) {
            System.out.print(zmienna2);
        } else if (zmienna1 > zmienna2) {
            System.out.println(zmienna1);
        } else if (zmienna2 < zmienna1)
            System.out.println(zmienna1);
    }

    private static boolean sprawdzCzyWartoscPrzypisanaJestParzysta() {
        int liczba = 20;
        return liczba % 2 != 0;
    }
}





