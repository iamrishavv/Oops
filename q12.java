package Assignment;
//return player detail based on id.
import java.util.Scanner;

public class q12 {
    Player getData(int id){
        Player p=new Player();
        if(id==18){
            p.name="Virat ";
            p.age=37;
            p.id=18;
        }else if(id==17){
            p.name="abd";
            p.age=38;
            p.id=17;
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id: ");
        int id=sc.nextInt();
        q12 q=new q12();
        Player p1=q.getData(id);
        System.out.println("Your name is:"+p1.name);
        System.out.println("Your id is:"+p1.id);
        System.out.println("Your age is:"+p1.age);

    }
}
class Player{
    int id;
    String name;
    int age;
}
