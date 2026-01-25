// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// First child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Second child class
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Main class
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();   // Dog accessing parent method
        d.bark();  // Dog's own method

        c.eat();   // Cat accessing parent method
        c.meow();  // Cat's own method
    }
}
