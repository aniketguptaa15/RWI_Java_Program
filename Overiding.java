public class Overiding {
    void show(){
     System.out.println("1");
    }   
}
class Over extends Overiding{
      void show(){
        System.out.println("2");
      }
      public static void main(String[] args) {
        Over ride= new Over();
        ride.show();
        Overiding O= new Overiding();
        O.show();
      }

}
