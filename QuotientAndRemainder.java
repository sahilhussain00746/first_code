import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter the Dividend value: ");
        int dividend = sc.nextInt();
        
        System.out.print("Enter the Divisor value: ");
        int divisor = sc.nextInt();
        
        // Calculating quotient and remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        
        // Displaying the results
        System.out.println("The value of quotient is " + quotient + " and remainder is " + remainder);
        
        sc.close();
    }
}