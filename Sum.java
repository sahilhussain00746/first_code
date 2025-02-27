
import java.util.*;
public class Sum {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
	int x=sc.nextInt();

        int sum = 0;
        int product = 1;

        int temp = x;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        
        System.out.println("Number: " + x);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Product of digits: " + product);
    }
}