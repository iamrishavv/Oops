package BasicJava;
// create a duplicate object for the given object
// we  have to implement cloneable interface 
// //we can create an object by this approach also.
public class cloneMethod implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        cloneMethod c=new cloneMethod();
        System.out.println(c);
        Object clone = c.clone();
        System.out.println(clone);
    }
}
