public class OuterClass {
    private static final String message = "Hello from OuterClass";

    // Static nested class
    static class NestedStaticClass {
        void displayMessage() {
            // Accessing a static member of the enclosing class
            System.out.println("Message from OuterClass: " + message);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the static nested class
        OuterClass.NestedStaticClass nested = new OuterClass.NestedStaticClass();
        
        // Calling method of the static nested class
        nested.displayMessage();
    }
}
