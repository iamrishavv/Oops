package BasicJava;
//wam to print data of object student.
public class methodQuestion {
    public static void main(String[] args) {
//        Student s=new Student();
//        s.id=18;
//        s.name="rishav";
//        System.out.println(s.id);
//        System.out.println(s.name);
//        Student s2=new Student();
//        System.out.println(s2.name);//null->because we don't initialize second object.
        methodQuestion d=new methodQuestion();
        Student s=new Student();
        s.id=18;
        s.name="rishav";
        d.printData(s);
    }
    //method to print student data using object.
    void printData(Student s){
        System.out.println(s.name +" " +  s.id);
    }

}
class Student{
    int id;
    String name;


}
