package BasicJava;

import java.util.Objects;

// it is used to compare object address by default and return boolean value..
//Used to compare content of objects.
//Default → reference comparison
//Overridden → logical comparison
public class equalsToMethod {
    int id;
    String name;

    equalsToMethod(int id, String name) {
        this.id = id;
        this.name = name;
    }
    // generate the override method..
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//compares e1 and e2
        if (o == null || getClass() != o.getClass()) return false;
        equalsToMethod that = (equalsToMethod) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        equalsToMethod e1=new equalsToMethod(1,"Rishav");
        equalsToMethod e2=new equalsToMethod(1,"Rishav");
        System.out.println(e1.equals(e2));//true
        System.out.println(e1==e2);//false
        String s1=new String("Hi");
        String s2=new String("Hi");
        System.out.println(s1.equals(s2));//true
    }
}
