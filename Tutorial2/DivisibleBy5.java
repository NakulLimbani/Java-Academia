import java.util.*;

public class DivisibleBy5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        if (n % 2 != 0) {
            System.out.println("Enter Even Size Of an Array!");
        }
        else 
        {

            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int generatedNumber = 0;
            for (int num = 0 ; num< arr.length ;num++) {
                int firstDigit = arr[num];
                while (firstDigit >= 10) {
                    firstDigit /= 10;
                }
                generatedNumber = generatedNumber * 10 + firstDigit;
            }
            System.out.println("Generated Number Is: " + generatedNumber);

            int reversedNumber = 0;
            int temp = generatedNumber;
            while (temp != 0) {
                int digit = temp % 10;
                reversedNumber = reversedNumber * 10 + digit;
                temp /= 10;
            }

            if (reversedNumber % 5 == 0) {
                System.out.println("Reversed number divisible by 5: " + reversedNumber);
            } else {
                System.out.println("Reversed number is not divisible by 5.");
            }

            scanner.close();
        }
    }
}