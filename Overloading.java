public class Overloading {
    void show(String b){
        System.out.println("This is String");
    }
    void show(int a){
        System.out.println("This is the integer "+1);
    }
    public static void main(String[] args) {
        Overloading poly = new Overloading();
        poly.show(1);
        poly.show("1");
    }
}
