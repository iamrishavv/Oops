package BasicJava;
//An abstract class is a class that:
//Is declared using the abstract keyword
//Cannot be instantiated
//May contain abstract methods (without body) and concrete methods (with body)
//abstract keyword is mandatory for abstract method.
//we cant create an object for an abstract class.
public class abstractClasses extends Animal {

    @Override
    void sound() {
        System.out.println("Barking..");
    }

    public static void main(String[] args) {
        abstractClasses c=new abstractClasses();
        c.sound();
        c.sleep();
    }
}
abstract class Animal {
    Animal(){
        System.out.println("Animal Constructor");
    }
    abstract void sound();  // abstract method

    void sleep() {           // concrete method
        System.out.println("Sleeping");
    }
}

