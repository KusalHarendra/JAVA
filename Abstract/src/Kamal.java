public class Kamal extends Nimal{
    void drink(){
        System.out.println("drinking");
    }

    void run(){
        System.out.println("running");      //method overriding
    }

    public static void main(String[] args) {
        Kamal obj1 = new Kamal();
        obj1.drink();
        obj1.eat();
        obj1.run();
    }

}