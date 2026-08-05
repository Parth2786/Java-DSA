package OOPS;

class Animal{
    void sound(){
        System.out.println("Hello");
    }
}
class Lion extends Animal{
    void sound(){
        System.out.println("Hi from the jungle King...");
    }
}
public class Methods{
    public static void main(String[] args) {
        Animal a = new Lion();
        a.sound();
        Lion lion = new Lion();
        lion.sound();
    }
}
