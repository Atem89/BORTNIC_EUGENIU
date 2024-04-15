package homework_nr_9;

public class Elephant extends Erbivor implements Animal{

    private String name;
    private double weight;
    private double height;
    private int age;

    public Elephant(String name, double weight, double height, int age) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " trumpets!");
    }

    @Override
    public void getType() {
        System.out.println(name + " is wild animal");
    }

    @Override
    public void description() {
        Animal.super.description();
        System.out.println("Elephants are the largest living land animals. \nThree living species are currently recognised: \nthe African bush elephant, the African forest elephant, \nand the Asian elephant.");
    }


    @Override
    public void food() {
        System.out.println("I eat nuts");
    }
}
