package BasicJava;
import java.io.Serializable;
//marker interface is interface without body.
//The JVM or framework checks for this marker and gives special behavior to the class.
public class markerInterface {
    interface Demo{

    }
    class User implements Demo{

    }
    class Student implements Serializable {
        int id;
    }
    public static void main(String[] args) {

    }
}
