package BasicJava;
//In Java, relationships describe how classes are connected to each other.
//1️⃣ IS-A Relationship (Inheritance)
//IS-A means one class is a type of another class. and Implemented using extends (class) or implements (interface).
//if we want to use all properties of another class we will use is-a relation
public class typesofRelationship extends User {

    public static void main(String[] args) {
        typesofRelationship t=new typesofRelationship();
        t.id=12;
        t.name="rishav";
        t.speak();
    }
}
class User {
    int id;
    String name;
    void speak(){
        System.out.println(id +name);
    }
}
