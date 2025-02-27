import java.util.Scanner;

public class q22_swapNum {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the Value of X: ");
        int x = input.nextInt();

        System.out.print("Enter the Value of Y: ");
        int y = input.nextInt();

        // Display values before swapping
        System.out.println("Before swapping:");
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);

        // Swapping without using a third variable
        x = x + y;
        y = x - y;
        x = x - y;

        // Display values after swapping
        System.out.println("After swapping:");
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);

        input.close(); // Closing the scanner to prevent resource leak
    }
}