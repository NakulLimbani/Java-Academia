import java.util.Scanner;

public class MonthToDaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month name: ");
        String monthName = scanner.nextLine();

        int days = convertMonthToDays(monthName);

        if (days != -1) {
            System.out.println("Number of days in " + monthName + ": " + days);
        } else {
            System.out.println("Invalid month name.");
        }

        scanner.close();
    }

    public static int convertMonthToDays(String monthName) {
        String lowerCaseMonth = monthName.toLowerCase();

        switch (lowerCaseMonth) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                return 31;
            case "april":
            case "june":
            case "september":
            case "november":
                return 30;
            case "february":
                return 28; // Assuming non-leap year
            default:
                return -1; // Invalid month name
        }
    }
}
