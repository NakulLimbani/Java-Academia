import java.util.Scanner;

public class SeriesSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        int sumNatural = 0;
        double sumHarmonic = 0.0;
        int sumSquare = 0;

        for (int i = 1; i <= n; i++) {
            sumNatural += i;
            sumHarmonic += 1.0 / i;
            sumSquare += i * i;
        }

        System.out.println("Sum of the series 1 + 2 + 3 + ... + " + n + " = " + sumNatural);
        System.out.println("Sum of the series 1 + 1/2 + 1/3 + ... + 1/" + n + " = " + sumHarmonic);
        System.out.println("Sum of the series 1^2 + 2^2 + 3^2 + ... + " + n + "^2 = " + sumSquare);

        scanner.close();
    }
}