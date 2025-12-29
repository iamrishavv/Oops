package BasicJava;
//To return multiple data we will use return type object as datatype.
public class mulitpleReturnMethod {

    Person getDetails(){
        Person p=new Person();
        p. age=12;
        p. id=13;
        p.name="sonu";
        return p;
    }
    public static void main(String[] args) {
        mulitpleReturnMethod m=new mulitpleReturnMethod();
        Person p =m.getDetails();
        System.out.println(p.id);
        System.out.println(p.name);
        System.out.println(p.age);
        College c1= m.getCollegeData();
        System.out.println(c1.id);
        System.out.println(c1.name);
    }
    College getCollegeData(){
        College c=new College();
        c.id=101;
        c.name="Galgotias ";
        return c;
    }
}
 class Person{
    String name;
    int age;
    int id;
}
class College{
    int id;
    String name;
}