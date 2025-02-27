import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int n = sc.nextInt();
        int an = 0;
        int temp = n;

        while (n > 0) {
            int ld = n % 10; // Extract last digit
            an = an + (ld * ld * ld); // Cube and add
            n = n / 10; // Remove last digit
        }

        if (an == temp) {
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is not an Armstrong number.");
        }

        sc.close(); // Close scanner to prevent resource leaks
    }
}