 interface i1  {
  void show();
}
interface i2{
  void display();
}
class Interface implements i1, i2{
  public void show(){
    System.out.println("This is Interface 1");
  }
   public void display(){
    System.out.println("This is the 2nd Interface");
  }
  public static void main(String[] args) {
    Interface I =new Interface();
    I.show();
    I.display();
  }
    
}