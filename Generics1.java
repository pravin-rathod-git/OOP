// Generic class definition
// <T> is a type parameter (can represent any reference type like Integer, String, etc.)
class Box<T> {

    // T will be replaced by the actual type at compile time
    // This avoids using Object and prevents type casting issues
    T value;

    // Setter method
    // Accepts a value of type T (type-safe)
    void set(T value) {
        this.value = value;
    }

    // Getter method
    // Returns value of type T without explicit casting
    T get() {
        return value;
    }
}

public class Generics1 {
    public static void main(String[] args) {

        // Box<Integer> means:
        // T is replaced with Integer
        // This box can store ONLY Integer values
        Box<Integer> b1 = new Box<>();
        b1.set(10); // Auto-boxing: int → Integer

        // Box<String> means:
        // T is replaced with String
        // This box can store ONLY String values
        Box<String> b2 = new Box<>();
        b2.set("Kunal");

        // No type casting required while retrieving data
        // Compile-time type safety is ensured
        System.out.println(b1.get());
        System.out.println(b2.get());
    }
}
