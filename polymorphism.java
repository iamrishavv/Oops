package BasicJava;
//Polymorphism means one thing, many forms.
//👉 In Java, it means the same method call behaves differently depending on the object.

public class polymorphism {
    //overloading:same name with different no ,types of parameters is known as overloading.
    //when methods are performing same operation then we should give same name to improve code readability.
    //Overloading belongs to same class.
     static class Calculator {

        int add(int a, int b) {
            return a + b;
        }
        int add(int a, int b, int c) {
            return a + b + c;
        }
    }
    //overriding:Child class provides its own implementation of a parent class method.
   static class RBIBank {
         boolean checkEligibility(){
             //Doc verifying logic
             return true;
        }
        double getHomeLoan(){
            return 10.4;
        }
        double getPersonalLoan(){
            return 14.5;
        }
    }

    static class SBI extends RBIBank {
        @Override
        double getHomeLoan(){
            return 12.4;
        }
         public String ApplyLoan(){
             boolean status =checkEligibility();

           if(status){
               double homeLoan=getHomeLoan();
               String mess="Your loan is approved "+getHomeLoan() ;
               return mess;
           }else{
               return "You are not eligible" ;
           }
         }
    }

    public static void main(String[] args) {
         Calculator c=new Calculator();
         int res=c.add(10,23);
        System.out.println(res);
         int result=c.add(10,20,12);
         System.out.println(result);
         SBI s=new SBI();
        String si= s.ApplyLoan();
        System.out.println(si);
    }
}
