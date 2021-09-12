package Day2;

public class Zad3 {
    public static void main(String[] args) {
        System.out.println(getIndex("Ala ma kota","ma"));
        System.out.println(getIndex("Ala ma kota"," "));
        System.out.println(getIndex("Ala ma kota","kota"));
        System.out.println(getIndex("Ala ma kota","Ala"));

    }

    private static int getIndex(String input,String word) {
        if(word.isBlank()){
            return -1;
        }
        return input.contains(word) ? input.indexOf(word) : -1;
    }

}

