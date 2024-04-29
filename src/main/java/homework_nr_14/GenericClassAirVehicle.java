package homework_nr_14;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class GenericClassAirVehicle <T extends Vehicle & Serializable> {
    private List<T> listOfAirVehicle = new ArrayList<>();
    public GenericClassAirVehicle() {
        this.listOfAirVehicle = listOfAirVehicle;
    }

    public void addNewVehicle(T inputAirVehicle) {
        listOfAirVehicle.add(inputAirVehicle);
    }

    public List<T> getListOfAirVehicle() {
        return listOfAirVehicle;
    }

    public void setListOfAirVehicle(List<T> listOfAirVehicle) {
        this.listOfAirVehicle = listOfAirVehicle;
    }

    @Override
    public String toString() {
        return "GenericClassAirVehicle{" +
                "listOfAirVehicle=" + listOfAirVehicle +
                '}';
    }
}
