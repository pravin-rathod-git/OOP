// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class
public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog(); // Creating child object

        d.eat();  // Calling parent class method
        d.bark(); // Calling child class method
    }
}
