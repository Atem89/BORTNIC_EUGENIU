package homework_nr_9;

public class Main {
    public static void main(String[] args) {
        Animal elephantObject1 = new Elephant("Dumbo", 3, 7, 4);

        elephantObject1.getType();
        elephantObject1.makeSound();
        elephantObject1.description();
        System.out.println("Number of eyes in elephant is: " + Animal.EYES);
        Animal.category();

        Erbivor elephantObject2 = new Elephant("Hathi", 4, 7, 6);

        elephantObject2.food();
        elephantObject2.whatIsHeDoing();

    }
}
