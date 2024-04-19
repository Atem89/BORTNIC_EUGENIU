package homework_nr_11;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
public class HomeWorkNr11 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.addAll(Arrays.asList(
                "Butterfly",
                "Adventure",
                "Horizon",
                "Whisper",
                "Harmony",
                "Galaxy",
                "Sky",
                "Home",
                "Wilderness",
                "Aqua"
        ));

        List<String> stringHaveLetterAandLess5Characters = stringList.stream()
                .filter(e -> e.contains("A") && e.length() < 5)
                .collect(Collectors.toList());

        System.out.println(stringHaveLetterAandLess5Characters);

        List<Person> personList = new ArrayList<>();
        personList.addAll(Arrays.asList(
                new Person("Ivan","Ivanov",30, true),
                new Person("Maria","Smirnova", 25, false),
                new Person("Alexey", "Petrov", 35, true),
                new Person("Ecaterina", "Socolova", 28, false),
                new Person("Sergey", "Vasiliev", 40, true),
                new Person("Anna", "Kuznetsova", 32, false),
                new Person("Dmitrii", "Fedorov", 27, true),
                new Person("Elena", "Popova", 29, false),
                new Person("Nicolai", "Vodov",34, false),
                new Person("Tatiana", "Volkova", 31, false)
        ));

        System.out.println("--------------------------------------------------");

        List<String> listNameisMaleAndAgeMore30 = personList.stream()
                .filter(e-> e.isMale() && e.getAge()>30)
                .map(e->e.getName())
                .toList();

        System.out.println(listNameisMaleAndAgeMore30);

        System.out.println("--------------------------------------------------");

        Optional<Person> personOptional = personList.stream()
                .filter(e-> !e.isMale() && e.getAge()<30 && e.getSurname().contains("P"))
                .findFirst();

        if(personOptional.isPresent()){
            System.out.println(personOptional);
        } else {
            System.out.println("Error! Employee optional is empty");
        }

    }
}
