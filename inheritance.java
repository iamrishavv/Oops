package BasicJava;
//inheritance using variable ,method  and constructor.
public class inheritance {
   static class User{
        int id;
        String name;
        void m1(){
            System.out.println("Parent class m1 method  called");
        }
        User(){
            System.out.println("Parent class constructor called");
        }
    }
    //using variable
   static class Student extends User{
        int rank;
    }
    //using method
   static class Employee extends User{
       void m2(){
           System.out.println("Child class M2 method called");
       }
       //zero param constructor
       Employee(){
           System.out.println("Child class constructor called");
       }
       //param constructor
       Employee(int id,String name, int rank){
           System.out.println("Param 3 of child class called");
       }
   }
    public static void main(String[] args) {
        Student s=new Student();
        s.id=101;
        s.rank=1;
        s.name="rishav";
        s.m1();
        System.out.println(s.name);
        System.out.println(s.id);
        System.out.println(s.rank);
        Employee e=new Employee(101,"rishav",1);
        e.m2();
        e.m1();


    }
}
