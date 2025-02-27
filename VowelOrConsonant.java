import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter The Character: ");
        char ch = sc.next().charAt(0);
        
        switch (Character.toLowerCase(ch)) { // Convert to lowercase for simpler cases
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println(ch + " is a Vowel");
                break;
            default:
                if (Character.isLetter(ch)) {
                    System.out.println(ch + " is a Consonant");
                } else {
                    System.out.println(ch + " is not a valid letter");
                }
        }
        
        sc.close();
    }
}