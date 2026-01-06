package BasicJava;

import org.w3c.dom.ls.LSOutput;

//a)single level:one parent one child
//b)multi level: one parent one child one sub-child...
//c)Hierarchical level : one parent many child from it
//d)multiple inheritance: One class inherits from multiple parent classes.
//e)hybrid inheritance:Combination of two or more types of inheritance.
//note ❌ Not supported using classes in Java(d&e)
//✔ Supported using interfaces(d&e)
public class typesOfInheritance {
    //single level
    static class Car{
        void m1(){
            System.out.println(" parent class method of single level");
        }
    }
    static class BMW extends Car{
        void m2(){
            System.out.println("Child class method of single level");
        }
    }
    //Multi-level
    static class Animal{
        void eat(){
            System.out.println("Eating");
        }
    }
    static class Dog extends Animal{
        void bark(){
            System.out.println("Barking");
        }
    }
    static class Libra extends Dog{
        void type(){
            System.out.println("Libra");
        }
    }
    //Hierarchical  level
    static class Country{
        void printCountry(){
            System.out.println("India");
        }
    }
    static class capitalCity extends Country{
        void printCapital(){
            System.out.println("New Delhi");
        }
    }
    static class otherCity extends Country{
        void printOtherCity(){
            System.out.println("Bengaluru , Mumbai");
        }
    }

    public static void main(String[] args) {
        BMW b=new BMW();
        b.m2();
        b.m1();
        Libra l =new Libra();
        l.type();
        l.eat();
        l.bark();
        capitalCity c=new capitalCity();
        c.printCountry();
        c.printCapital();
        otherCity o=new otherCity();
        o.printOtherCity();
    }

}
