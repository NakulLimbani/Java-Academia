import java.util.Scanner;

public class MaxAdjacentProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int maxProduct = findMaxAdjacentProduct(arr);
        System.out.println("Maximum product of two adjacent elements: " + maxProduct);
        
        scanner.close();
    }
    
    public static int findMaxAdjacentProduct(int[] arr) {
        int maxProduct = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            int product = arr[i] * arr[i + 1];
            maxProduct = Math.max(maxProduct, product);
        }
        
        return maxProduct;
    }
}
