    import java.util.Scanner;
    public class Pattern {
        public static void main(String[] args) {
            int rows;
            System.out.println("Enter Number Of Rows:");
            Scanner sc = new Scanner(System.in);
            rows = sc.nextInt();

            for (int i = 1; i <= rows; i++) {
                // Print spaces
                for (int j = 1; j <= rows-i; j++) {
                    System.out.print(" ");
                }
                
                // Print stars
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                
                // Move to the next line
                System.out.println();
            }
            sc.close();
        }
    }
