package homework_nr_9;

public interface Animal {
    void makeSound();

    void getType(); //"domestic" is "wild"

    default void description() {
    }

    static void category() {
        System.out.println("Im Walking!!!");
    }

    static final Integer EYES = 2;


}
