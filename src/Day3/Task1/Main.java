package Day3.Task1;

public class Main {


    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        Cat cat1 = new Cat("Burek");
        Cat cat2 = new Cat("Filemon");
        Cat cat3 = new Cat("Bonifacy");
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;

        int mouses = 10;
        for (Cat element : cats) {
            element.print();
            System.out.println(element.toString());
            element.makeSound();
            element.eatMouses(mouses++);
            System.out.println();
        }

        Cat cat4 = new Cat("Bonifacy");
        System.out.println(cat3.getName());
        cat3.setName("Puszek");
        System.out.println(cat3.getName());
    }
}

