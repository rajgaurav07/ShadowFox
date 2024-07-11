import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Select operation:");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Square Root");
            System.out.println("6: Exponentiation");
            System.out.println("7: Temperature Conversion");
            System.out.println("8: Currency Conversion");
            System.out.println("9: Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performAddition(scanner);
                    break;
                case 2:
                    performSubtraction(scanner);
                    break;
                case 3:
                    performMultiplication(scanner);
                    break;
                case 4:
                    performDivision(scanner);
                    break;
                case 5:
                    performSquareRoot(scanner);
                    break;
                case 6:
                    performExponentiation(scanner);
                    break;
                case 7:
                    performTemperatureConversion(scanner);
                    break;
                case 8:
                    performCurrencyConversion(scanner);
                    break;
                case 9:
                    exit = true;
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void performAddition(Scanner scanner) {
        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    private static void performSubtraction(Scanner scanner) {
        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    private static void performMultiplication(Scanner scanner) {
        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    private static void performDivision(Scanner scanner) {
        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double result = num1 / num2;
            System.out.println("Result: " + result);
        }
    }

    private static void performSquareRoot(Scanner scanner) {
        System.out.println("Enter a number:");
        double num = scanner.nextDouble();
        double result = Math.sqrt(num);
        System.out.println("Result: " + result);
    }

    private static void performExponentiation(Scanner scanner) {
        System.out.println("Enter base and exponent:");
        double base = scanner.nextDouble();
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
    }

    private static void performTemperatureConversion(Scanner scanner) {
        System.out.println("Select conversion:");
        System.out.println("1: Celsius to Fahrenheit");
        System.out.println("2: Fahrenheit to Celsius");
        int choice = scanner.nextInt();
        System.out.println("Enter temperature:");
        double temperature = scanner.nextDouble();
        double convertedTemperature;
        switch (choice) {
            case 1:
                convertedTemperature = (temperature * 9/5) + 32;
                System.out.println("Result: " + convertedTemperature + "°F");
                break;
            case 2:
                convertedTemperature = (temperature - 32) * 5/9;
                System.out.println("Result: " + convertedTemperature + "°C");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void performCurrencyConversion(Scanner scanner) {
        // For simplicity, let's assume a fixed conversion rate.
        double usdToEurRate = 0.85;
        double eurToUsdRate = 1.18;
        System.out.println("Select conversion:");
        System.out.println("1: USD to EUR");
        System.out.println("2: EUR to USD");
        int choice = scanner.nextInt();
        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();
        double convertedAmount;
        switch (choice) {
            case 1:
                convertedAmount = amount * usdToEurRate;
                System.out.println("Result: " + convertedAmount + " EUR");
                break;
            case 2:
                convertedAmount = amount * eurToUsdRate;
                System.out.println("Result: " + convertedAmount + " USD");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
