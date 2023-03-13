class Parent {
    final public void meth1() {
        System.out.println("Hello!");
    }
}
class Child extends Parent{
   // public void meth1() {
       // System.out.println("Hii!");     //cannot override the method
    //}
}
public class Test2{
    public static void main(String[] args) {
        Child obj = new Child();
         obj.meth1();
     }


 }

        //also final word can be used to a class