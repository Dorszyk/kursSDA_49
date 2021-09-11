package itneo;

public class Main {

    protected static String imie = "Piotr";


    public static void main(String[] args) {
        imie = "Adam";
        long duzaWartos = 10000000000L;
        Long longObject = null;
        float liczbaZmiennoPrzecinkowa = 10.2f;
        double liczbaZmiennoPrzecinkowa1 = 10.3d;

        int wiek =20;
        boolean czyOsobajestTrzezwa = true;
        boolean czyOsobaMaZdanyEgzamin = true;
        boolean czOsobaMozeJechacSamochodem = czyOsobajestTrzezwa && czyOsobaMaZdanyEgzamin;
        char znakNowejLinii = '\n';
        char nieZnanyZnak = '\r';
        String text = "Osoba nie jest uprawiona do jazdy samochodem";

        if(czOsobaMozeJechacSamochodem){
            System.out.println("Osoba Jest" + nieZnanyZnak+ " uprawiona"  + znakNowejLinii+ " do jazdy samochodem.");
        }else {
            System.out.println("Osba nie jest uprawiona do jazdy samochodem.");
        }

        if (czyDanaOsobaMozePic(20)) {
            System.out.println("Jestes uprawiony do wypicia drinka.");
        }
        processZapisu();
    }

    private static boolean czyDanaOsobaMozePic(int wiek) {
        return wiek > 18;

    }

    private static void processZapisu() {
        System.out.println("Zapis do bazy danych");
    }


}
