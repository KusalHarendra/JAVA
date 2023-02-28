public class LatestPhone extends NewPhone {
    void bluetooth(){
        System.out.println("Use Bluetooth");
    }
    public static void main(String[] args) {
        LatestPhone phone2 = new LatestPhone();
        phone2.call();
        phone2.message();
        phone2.browseInternet();
        phone2.camera();
        phone2.bluetooth();
    }
}
