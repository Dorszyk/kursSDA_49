package itneo;

public class StringExample {

    public static void main(String[] args) {
        String text = "Ala";
        String text2 = "Ala";
        String text3 = new String("Ala");

        System.out.println(text.equals(text2));
        System.out.println(text.equals(text3));

        System.out.println(text == text2);
        System.out.println(text == text3);
    }

}