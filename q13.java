package Assignment;

import java.util.Scanner;

public class q13 {
    University getData(int id){
        University u=new University();
        if(id==101){
            u.id=101;
            u.name="Oxford";
            u.location="London(England)";
        } else if (id==102) {
            u.id=102;
            u.name="Stanford";
            u.location="California(United States)";
        }
        return u;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id:");
        int id=sc.nextInt();
        q13 q3=new q13();
        University u1= q3.getData(id);
        System.out.println("University id is: "+u1.id);
        System.out.println("University name is: "+u1.name);
        System.out.println("Location is:"+u1.location);
    }
}
class University{
    int id;
    String name;
    String location;
}
