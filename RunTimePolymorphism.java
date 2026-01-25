class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

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

public class RunTimePolymorphism {
    public static void main(String[] args) {

        Animal a1 = new Dog(); // Parent reference → Child object
        Animal a2 = new Cat();

        a1.makeSound();  // Dog's method called
        a2.makeSound();  // Cat's method called
    }
}
