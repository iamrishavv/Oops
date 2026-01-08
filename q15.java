package Assignment;
//equal() method
public class q15 {
    public static void main(String[] args) {
        q15 q1=new q15();
        q15 q2=new q15();
        //here object class is checking the hashcode value and its different for every object so its giving false.
        boolean checkStatus= q1.equals(q2);
        System.out.println(checkStatus);
        //here string class override object class equal method because string has its own implementation of equal method
        //and its comparing content.
        String s1="rishav";
        String s2="rishav";

        boolean stringStatus =s1.equals(s2);
        System.out.println(stringStatus);
    }
}
