// Grandparent class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Parent class inheriting Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Child class inheriting Dog
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// Main class
public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy(); // Creating child of multilevel hierarchy

        p.eat();   // From Animal class
        p.bark();  // From Dog class
        p.weep();  // From Puppy class
    }
}
