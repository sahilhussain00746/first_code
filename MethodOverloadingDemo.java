public class MethodOverloadingDemo {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String add(String a, String b) {
        return a.concat(b);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        int sum1 = obj.add(5, 10);
        System.out.println("Sum 1: " + sum1);

        double sum2 = obj.add(2.5, 3.7);
        System.out.println("Sum 2: " + sum2);

        String result = obj.add("Hello", " World!");
        System.out.println("Result: " + result);
    }
}