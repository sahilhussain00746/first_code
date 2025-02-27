import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while (n > 0) {
            int ld = n % 10; // Extract last digit
            sum = sum * 10 + ld; // Build reversed number
            n = n / 10; // Remove last digit
        }

        if (sum == temp) {
            System.out.println(temp + " is a palindrome");
        } else {
            System.out.println(temp + " is not a palindrome");
        }
        
        sc.close(); // Close scanner to prevent resource leak
    }
}