public class StaticTest1 {
    int x;
    static int y;
    void method1(){

    }

    static void method2(){

    }

    public static void main(String[] args) {
        //x = 5;  cannot use without creating an object
        y = 10;  //can use static variable without creating an obeject

        //method1() cannot use non static methods
        method2();

        StaticTest1 obj = new StaticTest1();
        obj.x = 5;
        obj.method1();      // creating an object
    }
}
