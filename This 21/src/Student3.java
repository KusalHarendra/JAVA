public class Student3 {
    String name;
    int age;

    Student3(String name,int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student3 obj3 = new Student3("Kusal",26);
        System.out.println(obj3.name);
        System.out.println(obj3.age);
    }
}
