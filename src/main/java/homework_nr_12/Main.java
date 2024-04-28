package homework_nr_12;

public class Main {
    public static void main(String[] args) {

        Months[] allMonths = Months.values();
        for (Months e : allMonths){
            System.out.println(e);
        }
        System.out.println("---------------------------------------");

        FuelTypes[] allFuelTypes = FuelTypes.values();
        for (FuelTypes e : allFuelTypes){
            System.out.println(e + " " + e.isLiquidFuel());
        }
        System.out.println("---------------------------------------");

        int x = -4;

        CheckInteger[] checkIntegers = CheckInteger.values();
        for (CheckInteger e : checkIntegers) {
            checkAndPrint(x, e);
        }
    }

    public static void checkAndPrint (int x, CheckInteger check) {
        System.out.println("The result of: " + check + " is " + check.algoritm.test(x));
    }

}
