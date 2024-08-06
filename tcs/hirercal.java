
class Animal{
    void eat() {
    System.out.println("This animal eats food.");
}

void sleep() {
    System.out.println("This animal sleeps.");
}
}
class Lion extends Animal{
    void roar(){
        System.out.println("The lion roars.");

    }
}
class Elephant extends Animal{
    void trp(){
        System.out.println("The elephant trumpets.");
    }
}
public class hirercal {
    public static void main(String[] args) {

    Lion lion=new Lion();
    Elephant elephant=new Elephant();


    lion.eat();
    lion.sleep();
    lion.roar();
    elephant.eat();
    elephant.sleep();
    elephant.trp();
    }
    
}
