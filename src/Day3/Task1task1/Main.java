package Day3.Task1task1;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Mruczek");
        cat1.print();
        cat1.makeSound();
        cat1.eatMice(6);
        System.out.println();

        Cat cat2 = new Cat("Filemon");
        cat1.print();
        cat1.makeSound();
        cat1.eatMice(12);
        System.out.println();

        Cat cat3 = new Cat("Bonifacy");
        cat1.print();
        cat1.makeSound();
        cat1.eatMice(20);

        cat1.setName("Rudy");
        System.out.println("Nowe imie dla cat1: " + cat1.getName());

     }

}
