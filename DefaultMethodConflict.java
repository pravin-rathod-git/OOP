// First interface with default method
interface A {
    default void show() {
        System.out.println("Default show from Interface A");
    }
}

// Second interface with default method
interface B {
    default void show() {
        System.out.println("Default show from Interface B");
    }
}

// Class implementing both interfaces
class C implements A, B {

    // Must override show() to resolve conflict
    @Override
    public void show() {
        // Calling a specific interface default method using super
        A.super.show();  
        B.super.show();

        System.out.println("Show method resolved in Class C");
    }
}

// Main class
public class DefaultMethodConflict {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
