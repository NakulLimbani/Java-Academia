import java.util.Scanner;

public class SumOfprimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();

        long sum = 0;

        for (int num = 2; num <= n; num++) {
            if (isPrime(num)) {
                sum += num;
            }
        }

        System.out.println("Sum of prime numbers not greater than " + n + ": " + sum);

        scanner.close();
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}