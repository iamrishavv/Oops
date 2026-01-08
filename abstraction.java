package BasicJava;
//Abstraction is an OOP principle that means:
//Showing only what is necessary and hiding how it is done.
//How to Achieve Abstraction in Java?
//Java provides two ways:
//1️⃣ Abstract Class
//2️⃣ Interface
public class abstractionInterface implements Bank {
    @Override
    public void moneyTransfer() {
        System.out.println("Money transferred successfully");
    }

    @Override
    public void checkBalance() {
        System.out.println("Balance checked successfully");
    }
    public static void main(String[] args) {
        abstractionInterface a=new abstractionInterface();
        a.checkBalance();
        a.moneyTransfer();
        // we can create a reference var of an interface.
        Bank b;
        //storing impl object into reference variable.
        b=new abstractionInterface();
        //loosely coupled.
        Bank b1=new abstractionInterface();
        //tight coupled
        abstractionInterface a1=new abstractionInterface();
    }
}
interface Bank{
    abstract void  moneyTransfer();
    abstract void checkBalance();
}
