import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Declare the variables
        double ans = 0;
        char op;

        // Prompt user for the first value
        System.out.println("Enter the first value:");
        double num1 = sc.nextDouble();

        // Prompt user for the second value
        System.out.println("Enter the second value:");
        double num2 = sc.nextDouble();

        // Prompt user for the operator
        System.out.print("Enter an operator (+, -, *, /, %): ");
        op = sc.next().charAt(0);

        // Perform the calculation based on the operator entered
        switch(op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    ans = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            case '%':
                if (num2 != 0) {
                    ans = num1 % num2;  // Modulus operator
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Error! Enter a valid operator.");
                return;
        }

        // Output the result
        System.out.println("The final result is: " + num1 + " " + op + " " + num2 + " = " + ans);
    }
}