package homework_nr_8;

import java.util.HashMap;
import java.util.Map;

public class Translate {

    public static void main(String[] args) {
        Map<String, String> translate = new HashMap<>();

        translate.put("Hello", "Buna");
        translate.put("Goodbye", "La revedere");
        translate.put("Please", "Va rog");
        translate.put("Thank you", "Multumesc");
        translate.put("Yes", "Da");
        translate.put("No", "Nu");
        translate.put("Sorry", "Scuze");
        translate.put("Water", "Apa");
        translate.put("Food", "Mancare");
        translate.put("House", "Casa");

        System.out.println(translate);



    }
}
