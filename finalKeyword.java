package BasicJava;
//The final keyword is used to restrict modification.
//final Can Be Used With:
//1️⃣ Variable:A final variable’s value cannot be changed once assigned.
//2️⃣ Method:A final method cannot be overridden by child classes
//3️⃣ Class:A final class cannot be inherited.
public class finalKeyword extends Car {
    final int x=10;
   // x=13; --error
//   @Override -error
//   void run(){
//        System.out.println("Not Run");
//    }



    public static void main(String[] args) {


    }
}
class Car{ //--will give error with final
    final void run(){
        System.out.println("Running");
    }
}
