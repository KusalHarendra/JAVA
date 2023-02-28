public class ConstructorOverloading {
    ConstructorOverloading(){
        System.out.println("xxxx");
    }
    ConstructorOverloading(int x){
        System.out.println("xxxxxxxx");

    }

    public static void main(String[] args) {
        ConstructorOverloading nimal = new ConstructorOverloading();
        ConstructorOverloading kamal = new ConstructorOverloading(200);
    }
}
