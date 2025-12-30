package BasicJava;
//use of this keyword in a constructor.
//it is used to represent current class instance variable.
public class thisKeyword {
    String name;
    int salary;
    thisKeyword(int i,String j){
        this.salary=i;
        this.name=j;
        System.out.println(i);
        System.out.println(j);
        System.out.println(this.name);
    }
    public static void main(String[] args) {
        thisKeyword k = new thisKeyword(100000, "rishav");

    }
}
