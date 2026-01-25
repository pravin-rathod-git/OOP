class Calculator {

    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Same method name with different parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(10, 20));      // Calls 2-parameter method
        System.out.println(calc.add(10, 20, 30));  // Calls 3-parameter method
    }
}
