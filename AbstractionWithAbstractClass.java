// Abstract class (hides implementation details)
abstract class Animal {
    // Abstract method (no implementation)
    abstract void makeSound();

    // Concrete method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child classes provide implementation
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class AbstractionWithAbstractClass {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();  // Dog's implementation
        a2.makeSound();  // Cat's implementation
        a1.sleep();      // Common method
    }
}
