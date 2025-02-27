abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows");
    }
}

public class q42_abstract_class {
    public static void main(String[] args) {
        Animal dog = new Dog("Tommy");
        dog.makeSound();

        Animal cat = new Cat("Whiskers");
        cat.makeSound();
    }
}