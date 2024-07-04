import java.util.Scanner;

public class CharacterPercentage {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int t = 0, u = 0, l = 0, d = 0, s = 0;
        for (char c : input.toCharArray()) {
            if (c >= 65 && c <= 90) u++;
            else if (c >= 97 && c <= 122) l++;
            else if (c >= 48 && c <= 57) d++;
            else s++;
            t++;
        }
        double up = u * 100.0 / t;
        double low = l * 100.0 / t;
        double dig = d * 100.0 / t;
        double spec = s * 100.0 / t;

        System.out.println("Uppercase Percentage: " + up + "%");
        System.out.println("Lowercase Percentage: " + low + "%");
        System.out.println("Digit Percentage: " + dig + "%");
        System.out.println("Special Character Percentage: " + spec + "%");

        scanner.close();
    }
}