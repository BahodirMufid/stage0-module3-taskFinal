package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {

    public static void main(String[] args) {
        toFahrenheit(10);
    }
    public static void toFahrenheit(int temperatureCelsius){
        double  fahrenheit = 0.0;
        fahrenheit = (temperatureCelsius * 1.8) + 32;
        System.out.println(fahrenheit);
    }

}
