public class Static {
    
    
    
    // Non-static method
    void display() {
        System.out.println("A non-static function is called.");
    }
    
    // Static method
    static void cube() {
        int x = 7 * 7 * 7;
        System.out.println("Cube of 7 is: " + x);
    }
    static {
        // Static block
        cube(); // Call to static method from static block
    }

    // Main method
    public static void main(String args[]) {
        Static obj = new Static();
        obj.display();
    }
}
