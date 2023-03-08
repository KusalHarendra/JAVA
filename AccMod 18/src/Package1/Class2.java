package Package1;
import Package2.Class3;  //importing package2

public class Class2 {
    public static void main(String[] args) {  //class2 can access both class1 and
                                                // class3 because they are public classes
        Class2 obj2 = new Class2();
        Class1 obj1 = new Class1();
        Class3 obj3 = new Class3();
    }
}
