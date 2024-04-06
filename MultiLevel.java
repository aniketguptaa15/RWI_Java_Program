class MultiLevel {
    void eat(){
        System.out.println("Dog is eating");
    }
}
class B extends MultiLevel{
    void sleep(){
        System.out.println("Dog Sleeping");
    }
    
}

class  Dog extends  B{
    void run(){
        System.out.println("Dog running");
    }
    public static void main (String args[]){
    Dog doing =new Dog();
    doing.eat();
    doing.run();
    doing.sleep();

    }
}

