import java.util.Scanner;

public class q24_multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // Printing the multiplication table
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }

        sc.close(); // Closing the scanner to prevent resource leak
    }
}