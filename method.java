package BasicJava;

import java.lang.reflect.Array;
import java.util.Arrays;

//static method is called by class
//non-static method is called by object
// to run our method we have to call in main method
public class method {
    int add(int x,int y){
        int c=x+y;
        return c;
    }
    void sub(int a,int b){
        System.out.println("Subtracting....");
        return;
    }
    boolean checkAge(int age){
        if(age>18){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello EveryOne");
        //calling non-static method by creating an object
        method m=new method();
        m.greet();
        //calling static method by class
        method.hello();
        // pass an array without creating a variable
        m.print(new int[]{1,2,3,4,5});
        m.fullName("rishav","sinha");
    }
    //non-static/instance method
    void greet(){
        System.out.println("good Morning");
    }
    //static method
    static void hello(){
        System.out.println("hello");
    }
    //valid method
    void print(int []arr){
        System.out.println(Arrays.toString(arr));
    }
    void fullName(String firstName,String lastName){
        String res=firstName+" "+lastName;
        System.out.println(res);
    }
}
