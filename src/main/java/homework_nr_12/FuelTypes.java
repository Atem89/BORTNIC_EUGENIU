package homework_nr_12;

public enum FuelTypes {
    PETROL_95(true),
    PETROL_98(true),
    PETROL_100(true),
    DIESEL_51(true),
    DIESEL_55(true),
    METAN(false),
    PROPANE(false),
    ELECTRIC(false);

    public final boolean isLiquidFuel;

    FuelTypes(boolean isLiquidFuel) {
        this.isLiquidFuel = isLiquidFuel;
    }

}


