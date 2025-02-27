import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter the Principal Amount: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter the Rate of Interest (%): ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter the Time (years): ");
        double time = sc.nextDouble();
        
        // Calculating compound interest
        double compoundInterest = principal * (Math.pow(1 + rate / 100, time));
        
        // Displaying the result
        System.out.println("Compound Interest Amount: " + compoundInterest);
        
        sc.close();
    }
}