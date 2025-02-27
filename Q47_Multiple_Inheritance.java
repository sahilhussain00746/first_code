// Defining the Animal interface
interface Animal {
    void eat();
}

// Defining the Mammal interface
interface Mammal {
    void move();
}

// Dog class implementing both Animal and Mammal interfaces
class Dog implements Animal, Mammal {
    @Override
    public void eat() {
        System.out.println("The dog is eating.");
    }

    @Override
    public void move() {
        System.out.println("The dog is moving.");
    }
}

// Main class to demonstrate multiple inheritance via interfaces
public class Q47_Multiple_Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Implemented from Animal interface
        dog.move(); // Implemented from Mammal interface
    }
}