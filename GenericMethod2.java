public class GenericMethod2 {

    // Generic method declaration
    // <T> → Type parameter (can be Integer, String, Double, etc.)
    // T[] arr → Array of type T
    public static <T> void PrintArray(T[] arr) {

        // Enhanced for-each loop
        // 'i' will be of type T
        for (T i : arr) {
            // Prints each element of the array
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        // Integer array
        // Wrapper class is used (not primitive int)
        Integer[] a = {1, 2, 3, 4};

        // String array
        String[] b = {"A", "B", "C"};

        // Generic method call with Integer array
        // Here T becomes Integer
        PrintArray(a);

        // Generic method call with String array
        // Here T becomes String
        PrintArray(b);
    }
}
