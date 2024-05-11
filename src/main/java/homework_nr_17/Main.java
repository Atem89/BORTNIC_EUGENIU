package homework_nr_17;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String letters = "abcdefghijklmnoprstuvwxyz";

        Runnable runnable1 = () -> printLetters(letters);
        Runnable runnable2 = () -> printLettersDelay(letters);

        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable1);
        Thread t3 = new Thread(runnable2);
        Thread t4 = new Thread(runnable2);

        t1.start();
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thw thread was interrupted " + e);
        }

        System.out.println("---------------------------------------");
        t3.start();
        t4.start();
        t3.interrupt();
    }

    public synchronized static void printLetters(String letters){
        for (char c : letters.toCharArray()){
            System.out.print(c + " ");
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void printLettersDelay(String letters){
        for (char c : letters.toCharArray()){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e){
                System.out.println("The " + Thread.currentThread().getName() + " was interrupted");
            }
            System.out.print(c + " ");
            System.out.println(Thread.currentThread().getName());
        }
    }

}

