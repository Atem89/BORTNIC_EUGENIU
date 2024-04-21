package homework_nr_13;

public class Main {
    public static void main(String[] args) {
        try {
            //LBYL
            Airplane airplane1 = createAirplaneLBYL("Boeing", "747", 4);
            System.out.println("Airplane LBYL: " + airplane1.getManufacturer() + " " + airplane1.getModel());
            /*Airplane airplane2 = createAirplaneLBYL("Boeing", "747", 3);
            System.out.println("Airplane LBYL: " + airplane2.getManufacturer() + " " + airplane2.getModel());*/

            //EAFP
            /*Airplane airplane3 = createAirplaneEAFP("Airbus", "", 4);
            System.out.println("Airplane EAFP: " + airplane3.getManufacturer() + " " + airplane3.getModel());*/
            Airplane airplane4 = createAirplaneEAFP("Airbus", "A380", 4);
            System.out.println("Airplane EAFP: " + airplane4.getManufacturer() + " " + airplane4.getModel());
        } catch (InvalidManufacturerException | InvalidModelException | InvalidNrOfEnginesException e) {
            System.out.println("Error creating airplane: " + e.getMessage());
        }

        System.out.println("------------------------------------------------------");

        int inferiorLimit = 10;
        int superiorLimit = 50;

        try {
            System.out.println("Numbers divisible by 7 in a given range: (" + inferiorLimit + "-" + superiorLimit + ") is count: " + countDivisibleBy7Numbers(inferiorLimit, superiorLimit));
            for (int i = inferiorLimit; i != superiorLimit; i++){
                if (i % 7 == 0){
                    System.out.println(i + " ");
                }
            }
        } catch (InvalidRangeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Airplane createAirplaneLBYL(String manufacturer, String model, int nrOfEngines)
            throws InvalidManufacturerException, InvalidModelException, InvalidNrOfEnginesException {
        if (manufacturer == null || manufacturer.isEmpty()) {
            throw new InvalidManufacturerException("Manufacturer cannot be null or empty");
        }
        if (model == null || model.isEmpty()) {
            throw new InvalidModelException("Model cannot be null or empty");
        }
        if (nrOfEngines <= 0 || nrOfEngines % 2 != 0) {
            throw new InvalidNrOfEnginesException("Number of engines must be a positive even number");
        }
        return new Airplane(manufacturer, model, nrOfEngines);
    }

    public static Airplane createAirplaneEAFP(String manufacturer, String model, int nrOfEngines) {
        try {
            return new Airplane(manufacturer, model, nrOfEngines);
        } catch (InvalidManufacturerException | InvalidModelException | InvalidNrOfEnginesException e) {
            System.out.println("Error creating airplane: " + e.getMessage());
            return null;
        }
    }

    public static int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException{
        if (inferiorLimit > superiorLimit) {
            throw new InvalidRangeException("The lower inferiorLimit is greater than the upper superiorLimit");
        }
        int count = 0;
        for (int i = inferiorLimit; i != superiorLimit; i++){
            if (i % 7 == 0){
                count++;
            }
        }
        return count;
    }
}
