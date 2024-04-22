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

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Age=" + Age +
                ", Department='" + Department + '\'' +
                '}';
    }


}
