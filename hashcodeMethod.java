package BasicJava;
// int hashcode() method--
public class hashcodeMethod {
    int id;
    hashcodeMethod(int id){
        this.id=id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public static void main(String[] args) {
        hashcodeMethod h=new hashcodeMethod(11);
        int res=  h.hashCode();
        System.out.println(res);
//        hashcodeMethod h1=new hashcodeMethod();
//        System.out.println(h1);
    }

}
