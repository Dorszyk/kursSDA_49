package Day2;

public class Zad2 {
    public static void main(String[] args) {

        System.out.println(jesliSlowoZawieraPrefix("Programowanie", "pro"));
        System.out.println(jesliSlowoZawieraPrefix("Programowanie", "nie"));
        System.out.println();
        System.out.println(jesliSlowoZawieraSuffix("Programowanie", "pro"));
        System.out.println(jesliSlowoZawieraSuffix("Programowanie", "pro1"));
    }

    private static boolean jesliSlowoZawieraPrefix(String input, String prefix) {
        return  input.startsWith(prefix);
    }

    private static boolean jesliSlowoZawieraSuffix(String input, String suffix) {
        return input.endsWith(suffix);
    }
}

