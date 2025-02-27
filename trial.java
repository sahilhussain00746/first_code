import java.util.Scanner;

class BankDetails {
    private String accno;
    private String name;
    private String acc_type;
    private long balance;
    Scanner sc = new Scanner(System.in);

    // Method to open a new account
    public void openAccount() {
        printCentered("Enter Account No: ");
        accno = sc.next();
        printCentered("Enter Account type: ");
        acc_type = sc.next();
        printCentered("Enter Name: ");
        name = sc.next();
        printCentered("Enter Balance: ");
        balance = sc.nextLong();
    }

    // Method to display account details
    public void showAccount() {
        printCentered("Name of account holder: " + name);
        printCentered("Account no.: " + accno);
        printCentered("Account type: " + acc_type);
        printCentered("Balance: " + balance);
    }

    // Method to deposit money
    public void deposit() {
        long amt;
        printCentered("Enter the amount you want to deposit: ");
        amt = sc.nextLong();
        balance = balance + amt;
    }

    // Method to withdraw money
    public void withdrawal() {
        long amt;
        printCentered("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            printCentered("Balance after withdrawal: " + balance);
        } else {
            printCentered("Your balance is less than " + amt + "\tTransaction failed...!!");
        }
    }

    // Method to search an account by account number
    public boolean search(String ac_no) {
        if (accno.equals(ac_no)) {
            showAccount();
            return true;
        }
        return false;
    }

    // Method to print text centered
    public void printCentered(String message) {
        int width = 80;  // Set the width of your terminal (adjust as needed)
        int len = message.length();
        int spaces = (width - len) / 2;

        // Build the space string and print the message
        String space = " ".repeat(spaces);
        System.out.println(space + message);
    }
}

public class trial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create initial accounts
        BankDetails[] C;
        printCentered("How many number of customers do you want to input? ");
        int n = sc.nextInt();
        C = new BankDetails[n];

        for (int i = 0; i < C.length; i++) {
            C[i] = new BankDetails();
            C[i].openAccount();
        }

        // Loop runs until number 5 is pressed to exit
        int ch;
        do {
            printCentered("\n*** Banking System Application ***");
            printCentered("1. Display all account details");
            printCentered("2. Search by Account number");
            printCentered("3. Deposit the amount");
            printCentered("4. Withdraw the amount");
            printCentered("5. Exit");
            printCentered("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    for (int i = 0; i < C.length; i++) {
                        C[i].showAccount();
                    }
                    break;
                case 2:
                    printCentered("Enter account no. you want to search: ");
                    String ac_no = sc.next();
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        printCentered("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 3:
                    printCentered("Enter Account no.: ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        printCentered("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 4:
                    printCentered("Enter Account no.: ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        printCentered("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 5:
                    printCentered("See you soon...");
                    break;
            }
        } while (ch != 5);
    }

    // Method to print text centered in main class
    public static void printCentered(String message) {
        int width = 80;  // Set the width of your terminal (adjust as needed)
        int len = message.length();
        int spaces = (width - len) / 2;

        // Build the space string and print the message
        String space = " ".repeat(spaces);
        System.out.println(space + message);
    }
}
