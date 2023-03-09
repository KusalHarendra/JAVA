public class MethodOverloading {
    public void method1(){
        System.out.println("method 1");
    }
    public void method1(int x){
        System.out.println("method 2");
    }
    public void method1(int x,int y) {
        System.out.println("method 3");  //change the parameter type or number of parametrs
    }

    public static void main(String[] args) {
        MethodOverloading obj1 = new MethodOverloading();
        obj1.method1();
        obj1.method1(6);
        obj1.method1(9,4);
    }
}
