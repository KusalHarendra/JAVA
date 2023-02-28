public class ConstructorTest1 {
    ConstructorTest1(){             //Constructor is automatically craeated witout any content.
        System.out.println("Hello!");
    }

    void meth1(){
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        ConstructorTest1 obj1 = new ConstructorTest1();     //call to constructor
        obj1.meth1();

        ConstructorTest1 obj2 = new ConstructorTest1();

    }
}
