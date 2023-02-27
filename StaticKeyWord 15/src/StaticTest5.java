public class StaticTest5 {

    void call(String name) {
        System.out.println("Take a call from "+ name);
    }

    public static void main(String[] args) {
        StaticTest5 obj = new StaticTest5();
        obj.call("nokia");
    }
}
