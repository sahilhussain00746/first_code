import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        
        // Initializing first two numbers of the Fibonacci series
        int a = 0, b = 1, sum;
        
        // Generating Fibonacci series
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            sum = a + b;
            a = b;
            b = sum;
        }
        
        sc.close();
    }
}