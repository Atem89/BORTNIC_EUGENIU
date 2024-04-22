package homework_nr_12;

public enum FuelTypes {
    PETROL_95,
    PETROL_98,
    PETROL_100,
    DIESEL_51,
    DIESEL_55,
    METAN,
    PROPANE,
    ELECTRIC;



    public boolean isLiquidFuel(){
        return this != ELECTRIC;
    }

}


