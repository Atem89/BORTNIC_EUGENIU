package homework_nr_14;

import java.io.Serializable;

public class Vehicle implements Serializable {
    String manufacturer;
    String model;
    int yearMade;

    public Vehicle(String manufacturer, String model, int yearMade) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearMade = yearMade;
    }
}
