package BasicJava;

import javax.print.Doc;

//write a driver class and write a method to print employee data.
//write a class employee with id and salaries as their properties.
//call the print method from main method.
//similar for product data.
public class driverMethod {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.id=12;
        e1.salary=100000;
        Product p1=new Product();
        p1.productId=17;
        p1.productPrice=2000;
        p1.productName="Dabur";
        Doctor dd=new Doctor();
        dd.doctorAge=34;
        dd.doctorName="Dr.Ashok ";
        driverMethod d=new driverMethod();
        d.printEmployeeData(e1);
        d.printProductData(p1);
        d.printDoctorData(dd);

    }
    void printEmployeeData(Employee e){
        System.out.println("Your id is :" +e.id);
        System.out.println("Your salary is :" +e.salary);
    }
    void printProductData(Product p){
        System.out.println("Product id: " +p.productId);
        System.out.println("Product name is: " +p.productName);
        System.out.println("Product price is : " +p.productPrice);

    }
    void printDoctorData(Doctor dd){
        System.out.println("Doctor name: "+ dd.doctorName);
        System.out.println("Doctor age: " + dd.doctorAge);
    }
}
class Doctor{
    String doctorName;
    int doctorAge;
}
class Product {
    int productId;
    String productName;
    int productPrice;
}
class Employee {
    int id;
    int salary;
}

