import java.util.Scanner;

public class CircleArea{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = computeCircleArea(radius);

        System.out.println("The area of the circle is: " + area);
    }

    public static double computeCircleArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }

        return Math.PI * radius * radius;
    }
}
