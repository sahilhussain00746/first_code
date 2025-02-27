import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt user for the number
        System.out.println("Enter the number N: ");
        int n = sc.nextInt();

        // Check if the number is even or odd
        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        // Close the scanner
        sc.close();
    }
}