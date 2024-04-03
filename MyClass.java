// MyClass.java

public class MyClass {
    // Fields
    private int myField;
    public String anotherField;

    // Constructor
    public MyClass(int initialValue) {
        myField = initialValue;
    }

    // Method
    public void myMethod() {
        // Block example
        {
            int x = 10;         //local variable
            System.out.println("Inside block: " + x);
        }
    }

    // Method with parameters and return type
    public int add(int a, int b) {
        return a + b;
    }

    // Nested Class
    public class InnerClass {
        public void innerMethod() {
            // Accessing outerField
            System.out.println("Accessing outerField from InnerClass: " + myField);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyClass myObject = new MyClass(5);

        // Accessing fields
        System.out.println("myField: " + myObject.myField);
        System.out.println("anotherField: " + myObject.anotherField);

        // Invoking methods
        myObject.myMethod();
        System.out.println("Result of addition: " + myObject.add(3, 4));

        // Creating an instance of the nested class
        InnerClass innerObject = myObject.new InnerClass();
        innerObject.innerMethod();
    }
}
