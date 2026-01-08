package BasicJava;
//2️⃣ HAS-A Relationship (Association)
//HAS-A means one class contains an object of another class.
//Achieved using instance variables.
////if we want to use some properties of another class we will use is-a relation
public class typesofRelationship2 {
    void drive(){
        Engine e=new Engine();
        e.start();
        System.out.println("Journey Started");
    }
    public static void main(String[] args) {
        typesofRelationship2 t=new typesofRelationship2();
        t.drive();

    }
}
class Engine{
    int id;
    String name;
    String fuelType;
    void start(){
        System.out.println("Engine starting...");
    }

}