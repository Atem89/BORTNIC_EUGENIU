package homework_nr_14;

public class Car extends Vehicle{
    public Car(String manufacturer, String model, int yearMade) {
        super(manufacturer, model, yearMade);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearMade=" + yearMade +
                '}';
    }
}
