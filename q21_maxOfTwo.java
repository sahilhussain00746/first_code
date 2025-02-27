public class q21_maxOfTwo {
    public static void main(String args[]) {
        // Taking values as command line arguments and converting them to integers
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);

        // Comparing the two integers and printing the result
        if (i > j) {
            System.out.println(i + " is greater than " + j);
        } else if (i < j) {
            System.out.println(j + " is greater than " + i);
        } else {
            System.out.println("Both numbers are equal: " + i);
        }
    }
}