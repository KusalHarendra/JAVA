public class StaticTest4 {              //less lines of code
    String name;
    void call(){
        System.out.println("Take a call from "+name);
    }

    public static void main(String[] args) {
        StaticTest4 obj1 = new StaticTest4();
        obj1.name = "nokia";
        obj1.call();

        StaticTest4 obj2 = new StaticTest4();
        obj2.name = "huawei";
        obj2.call();

        StaticTest4 obj3 = new StaticTest4();
        obj3.name = "huawei";
        obj3.call();


    }
}
