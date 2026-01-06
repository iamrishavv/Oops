package Assignment;
// object will call child class method first then it goes to parent class if not available then goes to super object class.
public class q14 {
    static class Parent{
        void m1(){
            System.out.println("Parent class m1 method called");
        }
        void m2(){
            System.out.println("Parent class m2 method called");
        }
    }
    static class Child extends Parent {
        void m1(){
            System.out.println("Child class m1 method called");
        }
        void m2(){

            System.out.println("Child class m2 method called");
            super.m2();

        }
//        public int hashCode(){
//            return 101;
//        }
    }
    public static void main(String[] args) {
        Child c=new Child();
        c.m1();
        c.m2();
        int hashcode=c.hashCode();
        System.out.println(hashcode);
    }
}
