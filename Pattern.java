import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int count = 1;

            // Print the decreasing number sequence
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(count + " ");
                count++;
            }

            // Print the asterisk (*) pattern
            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print("* ");
            }

            // Print the decreasing number sequence in reverse order
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        
        sc.close(); // Closing scanner outside the loop
    }
}