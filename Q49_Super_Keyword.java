// Parent class
class Parent {
    protected String message;

    // Constructor for Parent class
    public Parent(String message) {
        this.message = message;
    }

    // Method to display message from Parent class
    public void display() {
        System.out.println("Parent class: " + message);
    }
}

// Child class extending Parent
class Child extends Parent {
    private String additionalMessage;

    // Constructor for Child class using super()
    public Child(String message, String additionalMessage) {
        super(message); // Calls Parent class constructor
        this.additionalMessage = additionalMessage;
    }

    // Overriding display() method
    @Override
    public void display() {
        super.display(); // Calls Parent class display() method
        System.out.println("Child class: " + additionalMessage);
    }
}

// Main class to demonstrate super keyword
public class Q49_Super_Keyword {
    public static void main(String[] args) {
        Child child = new Child("Hello", "World");
        child.display();
    }
}