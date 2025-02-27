public class IterativeStatementDemo {
    public static void main(String[] args) {
        // While loop
        int i = 1;
        while (i <= 5) {
            System.out.println("While loop iteration: " + i);
            i++;
        }

        // For loop
        for (int j = 1; j <= 5; j++) {
            System.out.println("For loop iteration: " + j);
        }

        // Do-while loop
        int k = 1;
        do {
            System.out.println("Do-while loop iteration: " + k);
            k++;
        } while (k <= 5);
    }
}