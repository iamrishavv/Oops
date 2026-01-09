package BasicJava;
//java.lang.Object is the root (topmost parent) class in Java.There are 11 methods available.
//String toString()--1
// it is used to represent object in string format.
public class toStringMethod {
    int id;
    String name;
    //constructor
    toStringMethod(int id, String name){
        this.id=id;
        this.name=name;
    }
    @Override//-overrides the object class to String method..
   public String toString(){
        return "Student{id=" + id + ", name='" + name + "'}";
    }
    public static void main(String[] args) {
        toStringMethod j=new toStringMethod(10,"rishav");
        //Both are same...by default

        System.out.println(j);//to string will be called
        System.out.println(j.toString());
        // String class is already overriding toString() method.
        String s=new String("rishav");
        System.out.println(s);

    }
}
