package BasicJava;
//constructor with different parameters{i.e. num,types,order etc}.
public class constructorOverloading {
    int salary;
    String name;
    //constructor overloading
    constructorOverloading(int salary,String name){
        this.name=name;
        this.salary=salary;
        System.out.println(name + " " + salary);
    }

    constructorOverloading(String name){
        this.name=name;
        System.out.println(name+ " "+ this.salary);
    }
    public static void main(String[] args) {
        constructorOverloading c=new constructorOverloading(100000, "rishav");
        constructorOverloading c1=new constructorOverloading(1000000,"rishu");
        constructorOverloading c2=new constructorOverloading("ritik");
    }
}
