package itneo;

import java.lang.reflect.Array;

public class iloscZliczen {
    public static void main(String[] args) {

        int count = iloscPowtorzenZnaku("Ala ma kota", 'a');
        System.out.println(count);
        long count1 = iloscPowtorzenZnakuStream("Ala ma kota", 'a');
        System.out.println(count1);

    }

    private static int iloscPowtorzenZnaku(String text, char szukanyZnak) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == szukanyZnak) {
                counter++;
            }
        }
        return counter;
    }

    private static long  iloscPowtorzenZnakuStream(String text, char szukanyZnak) {
        return text.chars()
                .filter(znak -> znak == szukanyZnak)
                .count();
    }
}
