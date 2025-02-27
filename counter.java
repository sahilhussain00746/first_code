import java.util.*;
public class counter {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a sentence : ");
        String str = sc.nextLine(); 
        int characterCount = countCharacters(str);

        System.out.println("The number of characters in the string is: " + characterCount);
    }

    public static int countCharacters(String str) {
        int count = 0;
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            count++;
        }

        return count;
    }
}