package homework_nr_14;

public class Airplane extends Car{
    public Airplane(String manufacturer, String model, int yearMade) {
        super(manufacturer, model, yearMade);
    }
    @Override
    public String toString() {
        return "Airplane{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearMade=" + yearMade +
                '}';
    }
}
