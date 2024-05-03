package homework_nr_14;

public class Helicopter extends Car{
    public Helicopter(String manufacturer, String model, int yearMade) {
        super(manufacturer, model, yearMade);
    }
    @Override
    public String toString() {
        return "Helicopter{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearMade=" + yearMade +
                '}';
    }
}
