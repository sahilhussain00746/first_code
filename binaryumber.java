import java.util.Scanner;

public class binaryumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt user for the first binary number
        System.out.println("Enter First Binary Number:");
        String x = sc.next();

        // Prompt user for the second binary number
        System.out.println("Enter Second Binary Number:");
        String y = sc.next();

        // Convert binary numbers (strings) to integers
        int n1 = Integer.parseInt(x, 2);
        int n2 = Integer.parseInt(y, 2);

        // Add the numbers
        int n3 = n1 + n2;

        // Display the binary values
        System.out.println("n1 = " + Integer.toBinaryString(n1));
        System.out.println("n2 = " + Integer.toBinaryString(n2));
        System.out.println("n3 = n1 + n2 = " + Integer.toBinaryString(n3));

        // Close the scanner
        sc.close();
    }
}