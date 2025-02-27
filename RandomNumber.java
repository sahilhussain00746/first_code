import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Range Of Values To Generate A Random Number:");

        System.out.print("Enter The Minimum Range: ");
        int min = sc.nextInt();

        System.out.print("Enter The Maximum Range: ");
        int max = sc.nextInt();

        if (min > max) {
            System.out.println("Invalid range! Minimum value must be less than or equal to Maximum value.");
        } else {
            int a = (int) (Math.random() * (max - min + 1) + min);
            System.out.println("Random Number Between " + min + " and " + max + " is: " + a);
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}