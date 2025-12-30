package BasicJava;
//constructor is used to crate an object.It is called when object is created.If we dont create any constructor then it will
//call a default constructor which is zero argument constructor.
public class constructor {
    //zero argument constructor
    constructor(){
        System.out.println("Hello");
    }
    //parametrized constructor.
    //constructor overloading.
    constructor(int i){
        System.out.println("Hi");
    }
    constructor(int i,int j){
        System.out.println(i+j);
    }
    public static void main(String[] args) {
        constructor c=new constructor(100,200);
        constructor c1=new constructor(110,220);


    }
}
