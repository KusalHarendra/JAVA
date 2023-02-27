public class StaticTest3 {
    static String name1;
    static String name2;
    static String name3;

    static void call1(){
        System.out.println("Take a call from "+name1);
    }

    static void call2() {
        System.out.println("Take a call from " + name2);
    }
        static void call3 () {
            System.out.println("Take a call from " + name3);
    }

    public static void main(String[] args) {
        name1 = "nokia";
        name2 = "huawei";
        name3 = "samsung";

        call1();
        call2();
        call3();        //too many lines of code
    }

}