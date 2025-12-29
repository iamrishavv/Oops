package Assignment;

import java.util.Scanner;

//wap for which takes id as input and return person data based on id;
public class q11 {
    Person getData(int id){
        Person p=new Person();
        if(id==101){
            p.name="Raju";
            p.age=30;
            p.id=101;
            return p;
        }else if(id ==102){
            p.name="Rani";
            p.age=32;
            p.id=102;
            return p;
        }else{
            return p;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id: ");
        int id=sc.nextInt();
        q11 q=new q11();
        Person p1=q.getData(id);
        System.out.println("Your name is: "+ p1.name);
        System.out.println("Your age is: "+ p1.age);
        System.out.println("Your id is: "+ p1.id);


    }
}
class Person{
    int id;
    String name;
    int age;
}
