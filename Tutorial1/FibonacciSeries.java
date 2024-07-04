import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();

        System.out.println("Fibonacci series up to " + numTerms + " terms:");
        for (int i = 0; i < numTerms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}





/*
 import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();

        System.out.println("Fibonacci series up to " + numTerms + " terms:");
        for (int i = 0; i < numTerms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int prev1 = 0;
            int prev2 = 1;
            int fib = 0;
            for (int i = 2; i <= n; i++) {
                fib = prev1 + prev2;
                prev1 = prev2;
                prev2 = fib;
            }
            return fib;
        }
    }
}

 */
