package homework_nr_10;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //3
        List<Integer> numberList = List.of(4, 8, 12, 7, 9);

        IsOddTestable isOdd = (Number number) ->{
            return number.intValue() % 2 == 1;
        };

        testNumber(numberList, isOdd);

        //4
        String name = "Bo";
        String surname = "Jackson";

        printString(name);
        printString(surname);

        //5
        int firstNumber = 5;
        int secondNumber = 7;

        Multiplicationable multiply = (int x) -> {
          return x * 2;
        };

        System.out.println(multiply.apply(firstNumber));
        System.out.println(multiply.apply(secondNumber));

        //6
        System.out.println(randomNumber());

        //7
        Employee employeeObject1 = new Employee("Mark","Clayton",30,"Software Engineering");
        Employee employeeObject2 = new Employee("Adrian","Carter",21,"Python Developer");
        Employee employeeObject3 = new Employee("Walter","Payton",25,"Java Developer");

        List<Employee> employeeList = List.of(employeeObject1, employeeObject2, employeeObject3);

        Predicate<Employee> worksInSoftwareEngineering = e -> e.Department.equals("Software Engineering");
        Predicate<Employee> isOlder20= e -> e.Age > 20;
        Predicate<Employee> nameStartsWithA = e -> e.Name.startsWith("A");

        List<Predicate<Employee>> predicates = new ArrayList<>();
        predicates.add(e -> e.Department.equals("Software Engineering"));
        predicates.add(e -> e.Age > 20);
        predicates.add(e -> e.Name.startsWith("A"));

        for (Employee employee : employeeList) {
            for (Predicate<Employee> predicate : predicates) {
                Employee.testEmployee(employee, predicate);
            }
        }
    }

    public static void testNumber (List<Integer> numberList, IsOddTestable algoritm){
        for (int index = 0; index != numberList.size(); index++){
            if(algoritm.test(numberList.get(index))){
                System.out.println(numberList.get(index));
            }
        }
    }

    public static void printString (String string) {
        System.out.println(string);
    }

    public static int randomNumber() {
        Random random = new Random();
        int number = 100;
        return random.nextInt(number);
    }


}
