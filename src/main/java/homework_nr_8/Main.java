package homework_nr_8;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

    public static void main(String[] args) {

        ToDoList toDo = new ToDoList();
        List<String> items = toDo.getToDoList();

        for (String item : items) {
            System.out.println(" - " + item);
        }

        System.out.println("--------------------------------------------------------------------");
        NoDuplicate listOriginal = new NoDuplicate();
        List<String> original = listOriginal.noDuplicate(items);

        System.out.println(" - " + original);

        System.out.println("--------------------------------------------------------------------");

    }
}
