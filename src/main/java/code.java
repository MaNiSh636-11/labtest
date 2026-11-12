import java.util.Scanner;

public class code {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException(
                "Temperature cannot be below absolute zero."
            );
        }
        return celsius + 273.15;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Temperature Converter =====");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");

        try {
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            System.out.print("Enter temperature: ");
            double temperature = sc.nextDouble();

            double result;

            switch (choice) {
                case 1:
                    result = celsiusToFahrenheit(temperature);
                    System.out.println("Temperature in Fahrenheit: " + result);
                    break;

                case 2:
                    result = fahrenheitToCelsius(temperature);
                    System.out.println("Temperature in Celsius: " + result);
                    break;

                case 3:
                    result = celsiusToKelvin(temperature);
                    System.out.println("Temperature in Kelvin: " + result);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
        }

        sc.close();
    }
}
