package itneo;

import java.sql.SQLOutput;
import java.util.Random;

public class Petla {

    public static void main(String[] args) {
        wyswietlLiczbyOd1Do10();
        wyswietlWszystkieImniona();
        int count = iloscWystapienLiteryWTekscie("alaa ma kota", 'a');
        System.out.println(count);
        int count1 = iloscWystapienLiteryWTekscieWhile("alaa ma kota", 'a');
        System.out.println(count1);
        int iloscRzutow = iloscRzutowKostka();
        System.out.println("Ilosc rzutów kostką, aby otrzymać 6 " + "to : "+ iloscRzutow);
        wyswietlLiteryAlfabetu();
        wyswietlImionaDoWhile();
        wyswietleLiczbyBreakDyrektywa();
        wyswietleLiczbyContinueDyrektywa();

    }

    private static void wyswietlLiczbyOd1Do10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Numer: " + i);
        }
        System.out.println();
    }

    private static void wyswietlWszystkieImniona() {
        String[] imiona = {"Ala", "Adam", "Piotr", "Ola", "Paweł", "Zbigniew", "Alojzy"};
        for (String imie : imiona) {
            if (imie.startsWith("A"))
                System.out.println("Imię: " + imie);
        }

    }

    private static int iloscWystapienLiteryWTekscie(String text, char szukanyZnak) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == szukanyZnak) {
                counter++;

            }
        }
        return counter;
    }

    private static int iloscWystapienLiteryWTekscieWhile(String text, char szukanyZnak) {
        int counter = 0, i = 0;
        while ((i < text.length())) {
            if (text.charAt(i) == szukanyZnak) {
                counter++;
            }
            i++;
        }
        return counter;
    }

    private static int iloscRzutowKostka() {
        Random random = new Random();
        int counter = 1;
        while (true) {
            int kostkaNumer = random.nextInt(6) + 1;
            if (kostkaNumer == 6) {
                System.out.println("Sukces wyrzucono na kostce 6. ");
                break;
            } else {
                System.out.println("Przegrana. Spróbuj ponownie. Wyrzucona liczba teraz to : " + kostkaNumer);
                counter++;
            }
        }
        return counter;
    }

    private static void wyswietlLiteryAlfabetu() {
        char poczatek = 'a';
        char koniec = 'z';
        int poczatekPetli = poczatek;
        int koniecPetli = koniec;

        for (int i = poczatekPetli; i < koniecPetli; i++){
            char znak =(char) i;
            System.out.print(i + " : " + znak);
            System.out.print(znak + ", ");
        }

        System.out.println();

    }
    private static void wyswietlImionaDoWhile(){
        String[] imiona = {"Ala", "Szymon", "Piotrek", "Andrzej"};
        int i = imiona.length;
        int index = 0;
        do{
            System.out.println(imiona[index]);
            index++;
        }while (i < imiona.length);
    }
    private static  void wyswietleLiczbyBreakDyrektywa(){
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            if(i == 1){
                break;
            }
        }
    }
    private static  void wyswietleLiczbyContinueDyrektywa(){
        for (int i = 0; i < 10; i++) {
            if(i == 8){
                continue;
            }
            System.out.println(i);
        }
    }


}




