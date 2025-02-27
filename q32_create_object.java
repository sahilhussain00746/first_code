class Person {
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class q32_create_object {
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person = new Person("John Doe", 30);

        // Invoking the displayInfo() method on the object
        person.displayInfo();
    }
}