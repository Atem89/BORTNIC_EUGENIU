package homework_nr_10;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //3
        List<Integer> numberList = List.of(4, 8, 12, 7, 9);
        Predicate<Integer> filterOddNumebers = e-> {
            return e % 2 == 1;
        };

        testOddNumbers(numberList, filterOddNumebers);
        System.out.println("------------------------------------------");
        //4
        Consumer<String> stringConsumer = e -> System.out.println("Tecmo " + e + " Fotball");
        stringConsumer.accept("Bo Jackson");
        System.out.println("------------------------------------------");

        //5

        Function<Integer, Integer> multiplyNumbers = e -> {
            return e*2;
        };
        multiplyNumbers(numberList, multiplyNumbers);

        //6
        Supplier<String> randomNumber = () -> {
            int number = (int) (Math.random() * 100);
            return String.valueOf(number);
        };
        System.out.println("------------------------------------------");
        System.out.println(randomNumber.get());
        System.out.println("------------------------------------------");
        //7
        Employee employeeObject1 = new Employee("Mark","Clayton",30,"Software Engineering");
        Employee employeeObject2 = new Employee("Adrian","Carter",21,"Python Developer");
        Employee employeeObject3 = new Employee("Walter","Payton",25,"Java Developer");

        List<Employee> employeeList = List.of(employeeObject1, employeeObject2, employeeObject3);

        Predicate<Employee> position = e -> e.getDepartment().equals("Software Engineering");
        testEmployee(employeeList, position);
        System.out.println("------------------------------------------");
        Predicate<Employee> age = e -> e.getAge() > 20;
        testEmployee(employeeList, age);
        System.out.println("------------------------------------------");
        Predicate<Employee> nameStartsWithA = e -> e.getName().startsWith("A");
        testEmployee(employeeList, nameStartsWithA);
        System.out.println("------------------------------------------");
    }

    public static void testOddNumbers (List<Integer> numbersList, Predicate<Integer> algoritm){
        for (Integer integer : numbersList) {
            if (integer % 2 == 1) {
                System.out.println(integer);
            }
        }
    }

    public static void multiplyNumbers (List<Integer> numbersList, Function<Integer, Integer> algoritm){
        int multiply;
        for (Integer integer : numbersList) {
            multiply = integer * 2;
            System.out.println(multiply);
        }
    }

    public static void testEmployee(List<Employee> e, Predicate<Employee> testMethod) {
        for (Employee employee : e) {
            if (testMethod.test(employee)) {
                Employee m = employee;
                System.out.println(m);
            }
        }
    }

}
