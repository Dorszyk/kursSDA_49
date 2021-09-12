package Day2;


public class Zad8zad8 {

    private static final int VALUE_UPPER_A_IN_ASCII = 65;
    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_UPPER_Z_IN_ASCII = 90;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    private static final int DIFF_UPPER_AND_LOWER = 32;

    public static void main(String[] args) {
        System.out.println(wymienZnakZMalejNaDuza("Ala ma Kota!"));
        String str ="ala";
        str = str.toUpperCase();
        str += "kot";

        StringBuilder str2 = new StringBuilder("kot");
        str2
                .append("kot2")
                .append("kot2");
        System.out.println(str2);
    }

    private static String wymienZnakZMalejNaDuza(String input){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            char zamienZnak = input.charAt(i);
            if(zamienZnak >= VALUE_UPPER_A_IN_ASCII && zamienZnak <= VALUE_UPPER_Z_IN_ASCII){
                result.append((char)(zamienZnak + DIFF_UPPER_AND_LOWER));
            }else if(zamienZnak <= VALUE_LOWER_A_IN_ASCII && zamienZnak >= VALUE_LOWER_Z_IN_ASCII){
                result.append((char)(zamienZnak - DIFF_UPPER_AND_LOWER));

            }else {
                result.append(zamienZnak);
            }
        }
        return result.toString();
    }
}
