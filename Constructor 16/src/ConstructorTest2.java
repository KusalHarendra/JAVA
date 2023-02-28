public class ConstructorTest2 {
    String name;
    ConstructorTest2(){
        name  = "Kusal";
        System.out.println("Hello!");
    }

    void meth1(){
        System.out.println("Welcome "+ name );
    }

    public static void main(String[] args) {
        ConstructorTest2 obj1 = new ConstructorTest2();
        obj1.meth1();


    }
}

