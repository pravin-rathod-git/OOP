// ===== 1) Interfaces with DIFFERENT method names =====
interface A {
    void methodA();
}

interface B {
    void methodB();
}

// ===== 2) Interfaces with SAME ABSTRACT method name =====
interface C {
    void show();   // Abstract method
}

interface D {
    void show();   // Same abstract method
}

// ===== 3) Interfaces with SAME DEFAULT method name =====
interface E {
    default void display() {
        System.out.println("Default display from Interface E");
    }
}

interface F {
    default void display() {
        System.out.println("Default display from Interface F");
    }
}

// ===== Class implementing ALL interfaces =====
class Demo implements A, B, C, D, E, F {

    // Implementing different methods from A and B
    public void methodA() {
        System.out.println("MethodA from Interface A");
    }

    public void methodB() {
        System.out.println("MethodB from Interface B");
    }

    // Single implementation for same abstract method from C and D
    public void show() {
        System.out.println("Show method implemented for interfaces C and D");
    }

    // Overriding to resolve default method conflict from E and F
    @Override
    public void display() {
        E.super.display(); // Calling Interface E default method
        F.super.display(); // Calling Interface F default method
        System.out.println("Display method resolved in Demo class");
    }
}

// ===== Main Class =====
public class MultipleInheritance {
    public static void main(String[] args) {

        Demo obj = new Demo();

        // Different method interfaces
        obj.methodA();
        obj.methodB();

        // Same abstract method interfaces
        obj.show();

        // Default method conflict resolution
        obj.display();
    }
}
