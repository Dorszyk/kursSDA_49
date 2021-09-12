package Day2;

public class Zad1zad1 {
    public static void main(String[] args) {

        System.out.println(getLastCharacter1("domek!"));
        System.out.println(getLastCharacter1("domek"));
        System.out.println(getLastCharacter2("ala     "));
        System.out.println(getLastCharacter2(null));


    }
    private  static char getLastCharacter1(String input){
        if(input == null || input.isBlank()){
            System.exit(-1);
        }
        input = input.trim();
        int lastPostion = input.length() -1;
        return input.charAt(lastPostion);
    }

    private static String getLastCharacter2(String input){
        if(input == null || input.isBlank()){
            System.exit(-1);
        }
        input = input.trim();
        int lastPostion = input.length() -1;
        return input.substring(lastPostion);
    }
}
