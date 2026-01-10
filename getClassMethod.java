package BasicJava;

import java.lang.reflect.Method;

//Returns runtime class of object.
public class getClassMethod {
    void r(){
        System.out.println("hi");
    }
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        getClassMethod g=new getClassMethod();
        Class cls=g.getClass();
        System.out.println(cls.getName());// gives the name of the class
        System.out.println(g.getClass().getName());//getClass--MethodChaning
       Object obj= cls.newInstance();//Deprecated for object creation
        System.out.println(obj);
        Method[] methods=  cls.getMethods();// to get the method available in the class
        System.out.println(methods);
    }
}
