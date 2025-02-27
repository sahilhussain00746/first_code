// Parent class with a final method
class Parent {
    public final void display() {
        System.out.println("This is the final method in the Parent class.");
    }
}

// Child class attempting to override the final method (will cause an error if uncommented)
class Child extends Parent {
    // Uncommenting the following code will result in a compilation error
    // @Override
    // public void display() {
    //     System.out.println("This is the overridden method in the Child class.");
    // }
}

// Main class to demonstrate the behavior of final methods
public class Q48_Final_Method {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); // Calls the final method in the Parent class

        Child child = new Child();
        child.display(); // Inherits and calls the final method from the Parent class
    }
}