// 🔹 Deep Copy using Copy Constructor
// 📌 Definition

// In deep copy, the copy constructor:

// Copies primitive data

// Creates new objects for all referenced objects

// So the copied object is fully independent.


class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    // Copy constructor
    Address(Address a) {
        this.city = a.city;
    }
}

class Person {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Copy constructor (Deep Copy)
    Person(Person p) {
        this.name = p.name;
        this.address = new Address(p.address); // new object
    }
}

public class DeepCopyUsingCopyConstructor {
    public static void main(String[] args) {
        Address addr = new Address("Mumbai");
        Person p1 = new Person("Ravin", addr);
        Person p2 = new Person(p1); // deep copy

        p2.address.city = "Pune";

        System.out.println(p1.address.city); // Mumbai
        System.out.println(p2.address.city); // Pune
    }
}
