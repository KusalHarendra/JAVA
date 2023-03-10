public class Student1 {
    String name;
    int age;

    Student1(String x,int y){
        name = x;
        age =y;
    }

    public static void main(String[] args) {
        Student1 obj1 = new Student1("Kusal",26);
        System.out.println(obj1.age);
        System.out.println(obj1.name);

    }
}
