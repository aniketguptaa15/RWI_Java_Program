public class Animal {
        public void run()
        {
            System.out.println("Now I am Running");
        }
        void eat(){
            System.out.println("i am eating leg piece");
        }
        public static void main(String args[]){
         System.out.println("Dog ");
         Animal doing= new Animal();
         doing.eat();
         doing.run();
         Bird doi = new Bird();
         doi.fly();
        }
}
class Bird{
    public void fly(){
        System.out.println("Sparrow \nI am Flying ");
    }
}
