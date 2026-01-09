package BasicJava;
//Blocks means some part or some piece of info or some piece of code.
public class blocks {
    int i=10;
    static int j=11;
    blocks(){
        System.out.println("this is constructor");
    }
    //it is called after object creation and called many times as object gets called.
    //it is called before constructor.
    {
        System.out.println(j);
        System.out.println("This is Instance block");
    }

    // it executes after class is called and called once
    //it is called before instance block
    static {
//        blocks s=new blocks();
//        System.out.println(s.i);
        System.out.println("this is Static block");
    }
    public static void main(String[] args) {
        blocks b=new blocks();
    }
}
