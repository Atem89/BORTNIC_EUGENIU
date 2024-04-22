package homework_nr_8;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        List<String> listToday = new ArrayList<>();
        listToday.add("Wake up");
        listToday.add("Light exercise");
        listToday.add("Have breakfast");
        listToday.add("Work");
        listToday.add("Study");
        listToday.add("Wake up");
        listToday.add("Light exercise");
        listToday.add("Have breakfast");
        listToday.add("Work");
        listToday.add("Study");

        for (String item : listToday){
            System.out.println("- " + item);
        }
        System.out.println("--------------------------------------------------------------------");
        printOriginalList(listToday);
    }


    public static void printOriginalList(List<String> listToday){
        Set<String> originalList = new HashSet<>(listToday);
        System.out.println(originalList);
    }


}
