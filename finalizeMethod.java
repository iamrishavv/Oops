package BasicJava;
//when garbage collector is removing any object from jvm then it will call finalize method.
//Depreciated since java 9.
public class finalizeMethod {
    public static void main(String[] args) throws Throwable {
        finalizeMethod f=new finalizeMethod();
        f.finalize();
    }
}
