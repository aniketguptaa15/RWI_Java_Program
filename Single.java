class Single {
    void eat(){
        System.out.println("Dog is eating");
    }
}
class  Dog extends  Single{
    void run(){
        System.out.println("Dog running");
    }
    public static void main (String args[]){
    Dog doing =new Dog();
    doing.eat();
    doing.run();

    }
}
