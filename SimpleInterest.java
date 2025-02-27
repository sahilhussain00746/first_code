import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter the Principal Amount (P): ");
        int principal = sc.nextInt();
        
        System.out.print("Enter the Interest Rate (R%): ");
        float rate = sc.nextFloat();
        
        System.out.print("Enter the Time Duration (T years): ");
        int time = sc