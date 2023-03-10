public class Student2 {
    String name;
    int age;

    Student2(String name,int age){
        name = name;           //varibale in the constructor is not equal to variable in class
        age = age;
    }

    public static void main(String[] args) {
        Student2 obj2 = new Student2("Kusal",26);
        System.out.println(obj2.name);
        System.out.println(obj2.age);
    }
}
