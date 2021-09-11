import java.util.Scanner;

public class Ex2 {

    private final static float PI = 3.14f;
    public static void main(String[] args) {

        float diameter = getDiameterFromUser();
        float circumference = calculateCircumference(diameter);
        System.out.println("Obwód okręgu:" +circumference);
        float area =calculateOfArea(diameter);
        System.out.println("Pole okręgu:" + area);
    }
    private static float getDiameterFromUser(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę wstawić średnicę :");
        return scanner.nextFloat();
    }
    protected static float calculateCircumference(float diameter){
        return PI * diameter;
    }

    private static float calculateOfArea(float diameter){
        float radius = diameter /2;
        return PI * (float)Math.pow(radius,2);
    }

}
