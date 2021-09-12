package Day2;

public class Zad11 {
    public static void main(String[] args) {

        System.out.println(ifPalindrome("kajak"));
        System.out.println(ifPalindrome("dod"));
        System.out.println(ifPalindrome("atlalta"));
    }
        private static boolean ifPalindrome(String input) {
            StringBuilder sb = new StringBuilder(input);
            sb.reverse();
            return sb.reverse().toString().equals(input);
        }
    }

