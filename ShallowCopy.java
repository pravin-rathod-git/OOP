// 🔹 Shallow Copy of an Object
// 📌 Definition

// A shallow copy creates a new object, but does NOT create copies of referenced objects.
// 👉 It copies primitive fields directly and copies references for objects.

// So both original and copied objects point to the same inner objects.

// 🔎 Key Point

// Changes in nested objects affect both copies

// Faster, less memory usage


class Address {
    String city;
    Address(String city) {
        this.city = city;
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
        return super.clone(); // shallow copy
    }
}

public class ShallowCopy {
    public static void main(String[] args) throws Exception {
        Address addr = new Address("Mumbai");
        Person p1 = new Person("Ravin", addr);
        Person p2 = (Person) p1.clone();

        p2.address.city = "Pune";
        p2.name="kunal";

        System.out.println(p1.address.city); // Pune
        System.out.println(p2.address.city); // Pune
        

    }
}
