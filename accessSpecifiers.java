package BasicJava;
/*access specifiers.--who can access our variables,methods,class.
Access specifiers define the visibility (scope) of classes, variables, methods, and constructors in Java.
Java has 4 access specifiers:
public
protected
default (no keyword)
private
 */
public class accessSpecifiers {
    //var
    private int  x=12 ;
    public int y=11;
    //constructor
    public accessSpecifiers(){
        System.out.println("Calling public constructor: ");
    }
    private accessSpecifiers(int x){
        System.out.println("I am a private constructor:" +x);
    }
    //methods
    private void m1(){
        System.out.println("i am a private method");
    }
    public void m2(){
        m1();//we can directly call an instance method inside an instance method  in same class.same for static method.
    }
    public static void main(String[] args) {
        accessSpecifiers a=new accessSpecifiers();
        accessSpecifiers a1=new accessSpecifiers(1000);
        a.m1();
        a.m2();

    }
}
