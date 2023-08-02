import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LoggerFactory.getLogger().log("=== Complex Number Calculator ===");

        LoggerFactory.getLogger().log("Enter the first complex number (a + bi):");
        ComplexNumber num1 = readComplexNumber(scanner);

        LoggerFactory.getLogger().log("Enter the second complex number (a + bi):");
        ComplexNumber num2 = readComplexNumber(scanner);

        Calculator calculator = new Calculator();
        calculator.setOperation(new AdditionStrategy()); // Можно заменить на MultiplicationStrategy или DivisionStrategy

        ComplexNumber result = calculator.calculate(num1, num2);

        LoggerFactory.getLogger().log("Result: " + result);
    }

    private static ComplexNumber readComplexNumber(Scanner scanner) {
        LoggerFactory.getLogger().log("Real part (a):");
        double realPart = scanner.nextDouble();

        LoggerFactory.getLogger().log("Imaginary part (b):");
        double imagPart = scanner.nextDouble();

        return new ComplexNumber(realPart, imagPart);
    }
}
