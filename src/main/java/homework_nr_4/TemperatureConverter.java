package homework_nr_4;

public class TemperatureConverter {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        float fahrenheit = converter.toCelsius(70.5f);
        System.out.println("Fahrenheit is " + fahrenheit);
        float celsius = converter.toFahrenheit(30.51f);
        System.out.println("Fahrenheit is " + celsius);
    }

    public float toCelsius(float tempFahrenheit){
        return (tempFahrenheit - 32) * 5/9;
    }
    public float toFahrenheit(float tempCelsius){
        return (tempCelsius * 9/5) + 32;
    }

}
