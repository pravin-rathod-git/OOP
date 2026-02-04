// 🔹 Deep Copy of an Object
// 📌 Definition

// A deep copy creates a new object and also copies all referenced objects recursively.

// Each object is fully independent.

// 🔎 Key Point

// Changes in nested objects do NOT affect the original

// Slower, more memory usage

// Safer for mutable objects

class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    protected Object clone() throws CloneNotSupportedException {
        Person p = (Person) super.clone();
        p.address = (Address) address.clone(); // deep copy
        return p;
    }
}

public class DeepCopy {
    public static void main(String[] args) throws Exception {
        Address addr = new Address("Mumbai");
        Person p1 = new Person("Ravin", addr);
        Person p2 = (Person) p1.clone();

        p2.address.city = "Pune";

        System.out.println(p1.address.city); // Mumbai
        System.out.println(p2.address.city); // Pune
    }
}
