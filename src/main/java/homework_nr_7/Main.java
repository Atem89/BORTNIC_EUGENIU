package homework_nr_7;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Manager("Mark","Clayton", "Spirit", 4, "Fenix");
        Person person2 = new Programmer("Cris","Carter","Spirit", "Java", 5);
        Employee person3 = new Manager("Bo", "Jackson", "Spirit", 4, "Fenix");
        Employee person4 = new Programmer("Walter", "Payton", "Spirit", "C#", 5);

        person1.printMyName();
        person2.printMyName();
        person3.work();
        person4.work();

        Person [] personsArray = new Person[]{
                person1, person2, person3, person4
        };

        for (int i = 0; i != personsArray.length; i++) {
            Person person = personsArray[i];
            if (person instanceof Manager teamObject) {
                ((Manager) person).work();
            }
        }
    }
}
