package BasicJava;
//Isis used to access parent clas properties (var/method/constructor)
//It is used to access direct parent properties.
public class superKeyword extends Parent{
    void m1(){
        super.m1();
        System.out.println("Child  class method called");

    }
    public static void main(String[] args) {
        superKeyword s=new superKeyword();
        s.m1();
    }
}
class Parent{
    void m1(){
        System.out.println("Parent class method called");
    }
}