package BasicJava;

import java.io.Serializable;

//A functional interface is an interface that contains exactly ONE abstract method.
//👉 It is mainly used to support Lambda Expressions (Java 8+).
public class functionalInterface implements Demo {
    @Override
    public void run(){
        System.out.println();
    }
    public static void main(String[] args) {

    }
}
@FunctionalInterface
interface Demo{
    int i=10;
    abstract void run();
}
//interface can use multiple inheritance using multiple extends interfaces.
interface User2 extends Demo, Serializable {
    void walk();
}
