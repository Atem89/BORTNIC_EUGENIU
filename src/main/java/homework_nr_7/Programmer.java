package homework_nr_7;

public class Programmer extends Employee {

    public String programmingLanguage;
    public int yearsOfExperience;

    public Programmer(String name, String surname, String companyName, String programmingLanguage, int yearsOfExperience) {
        super(name, surname, companyName);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void work() {
        System.out.println("Programmer is work");
    }
}
