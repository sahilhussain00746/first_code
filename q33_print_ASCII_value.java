public class q33_print_ASCII_value {
    public static void main(String[] args) {
        // Array of characters
        char[] characters = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '#', '@'};

        // Loop through each character and print its ASCII value
        for (char c : characters) {
            int asciiValue = (int) c; // Type casting character to integer to get ASCII value
            System.out.println("Character: " + c + ", ASCII value: " + asciiValue);
        }
    }
}