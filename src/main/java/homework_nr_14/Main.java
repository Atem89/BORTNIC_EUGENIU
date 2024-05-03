package homework_nr_14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        GenericClass<Integer> integerGenericClass = new GenericClass<>(Arrays.asList(1, 4, 5, 8, 9, 10));
        GenericClass<Float> floatGenericClass = new GenericClass<>(Arrays.asList(2.10f, 5.12f, 102.10f,5.25f, 4.14f));

        System.out.println(integerGenericClass);
        System.out.println(floatGenericClass);
        System.out.println("----------------------------------------");


        Car c1 = new Car("Toyota","Camry", 2022);
        Car c2 = new Car ("Honda", "Accord",2021);
        Car c3 = new Car ("Ford", "Mustang", 2020);

        Airplane a1 = new Airplane("Boeing", "747", 1998);
        Airplane a2 = new Airplane("Airbus", "A380", 2005);
        Airplane a3 = new Airplane("Embraer", "ERJ-145", 1996);

        Helicopter h1 = new Helicopter("Bell", "206 JetRanger", 1967);
        Helicopter h2 = new Helicopter("Sikorsky", "UH-60 Black Hawk", 1979);
        Helicopter h3 = new Helicopter("Airbus Helicopters", "H145", 2002);

        GenericClassAirVehicle<Airplane> myAirplaneHome = new GenericClassAirVehicle<>();
        GenericClassAirVehicle<Helicopter> myHelicopterHome = new  GenericClassAirVehicle<>();
        myAirplaneHome.addNewVehicle(a1);
        myAirplaneHome.addNewVehicle(a1);
        System.out.println(myAirplaneHome);
        myHelicopterHome.addNewVehicle(h1);
        myHelicopterHome.addNewVehicle(h2);
        System.out.println(myHelicopterHome);


    }
}
