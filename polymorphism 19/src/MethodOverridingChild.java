public class MethodOverridingChild extends MethodOverridingParent{

    @Override
    public void phone() {
        System.out.println("Nokia");  //override the phone() method
    }

    public static void main(String[] args) {
        MethodOverridingChild obj1 = new MethodOverridingChild();
        obj1.phone();
    }



}
