package homework_nr_13;

public class Airplane {
    private String manufacturer;
    private String model;
    private int nrOfEngines;

    public Airplane(String manufacturer, String model, int nrOfEngines) throws InvalidManufacturerException, InvalidModelException, InvalidNrOfEnginesException {
        if (manufacturer == null || manufacturer.isEmpty()) {
            throw new InvalidManufacturerException("Manufacturer cannot be null or empty");
        }
        if (model == null || model.isEmpty()) {
            throw new InvalidModelException("Model cannot be null or empty");
        }
        if (nrOfEngines <= 0 || nrOfEngines % 2 != 0) {
            throw new InvalidNrOfEnginesException("Number of engines must be a positive even number");
        }
        this.manufacturer = manufacturer;
        this.model = model;
        this.nrOfEngines = nrOfEngines;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNrOfEngines() {
        return nrOfEngines;
    }

    public void setNrOfEngines(int nrOfEngines) {
        this.nrOfEngines = nrOfEngines;
    }
}
