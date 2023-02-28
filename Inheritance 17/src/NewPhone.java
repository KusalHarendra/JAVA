public class NewPhone extends OldPhone{         //child class
    void browseInternet(){
        System.out.println("Browse Internet");
    }
    void camera(){
        System.out.println("Take photos");
    }

    public static void main(String[] args) {
        NewPhone phone1 = new NewPhone();
        phone1.call();
        phone1.message();
        phone1.browseInternet();
        phone1.camera();
    }

}
