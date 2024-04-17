package homework_nr_10;
import java.util.List;
import java.util.function.Predicate;

public class Employee {
    String Name;
    String Surname;
    int Age;
    String Department;

    public Employee(String name, String surname, int age, String department) {
        Name = name;
        Surname = surname;
        Age = age;
        Department = department;
    }

    @Override
    public String toString() {
        return String.format("Employee{name='%s', surname='%s', age=%d, department='%s'}",
                Name, Surname, Age, Department);
    }

    public static void testEmployee(Employee e, Predicate<Employee> testMethod) {
        if (testMethod.test(e)) {
            System.out.println("Test passed for: " + e);
        } else {
            System.out.println("Test failed for: " + e);
        }
    }

}
