import java.util.Scanner;

public class q25_condnStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the case (1 or 2): ");
        int caseNO = sc.nextInt();
        
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        switch (caseNO) {
            case 1:
                if (number > 0) {
                    System.out.println("The number is positive.");
                } else if (number < 0) {
                    System.out.println("The number is negative.");
                } else {
                    System.out.println("The number is 0.");
                }
                break;

            case 2:
                if (number > 0) {
                    System.out.println("The number is positive.");
                } else {
                    System.out.println("The number is not positive.");
                }
                break;

            default:
                System.out.println("Choose a correct case.");
                break;
        }

        sc.close(); // Closing the scanner to prevent resource leaks
    }
}