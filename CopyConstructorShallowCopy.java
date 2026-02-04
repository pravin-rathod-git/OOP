// 🔹 Shallow Copy using Copy Constructor
// 📌 Definition

// In shallow copy, the copy constructor:

// Copies primitive data

// Copies references of objects (not the actual objects)

// So both objects share the same referenced objects.


class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person {
    String name;
    Address address;

    // Normal constructor
    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Copy constructor (Shallow Copy)
    Person(Person p) {
        this.name = p.name;
        this.address = p.address; // same reference
    }
}

public class CopyConstructorShallowCopy {
    public static void main(String[] args) {
        Address addr = new Address("Mumbai");
        Person p1 = new Person("Ravin", addr);
        Person p2 = new Person(p1); // shallow copy

        p2.address.city = "Pune";

        System.out.println(p1.address.city); // Pune
        System.out.println(p2.address.city); // Pune
    }
}
