import java.util.*;

public class CelsiusToFahreneit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = convertCelsiusToFahrenheit(celsius);

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }
}
