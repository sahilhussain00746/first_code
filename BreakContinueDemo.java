public class BreakContinueDemo {
    public static void main(String[] args) {
        // Demonstration of break statement
        System.out.println("Demonstration of break statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Exit the loop when i equals 3
            }
            System.out.println("i: " + i);
        }

        // Demonstration of continue statement
        System.out.println("\nDemonstration of continue statement:");

        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                continue; // Skip the current iteration when j equals 3
            }
            System.out.println("j: " + j);
        }
    }
}