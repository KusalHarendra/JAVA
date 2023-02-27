public class Phone {
    String type;
    String color;
    int ram;

    public void call()
    {
        System.out.println("take a call from "+type);
    }
    public void browseInternet()
    {
        System.out.println("brows the internet");
    }


    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.type = "Samsung";
        phone1.call();

        Phone phone2 = new Phone();
        phone2.browseInternet();
    }

}
