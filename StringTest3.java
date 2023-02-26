public class StringTest3 {
    public static void main(String[] args) {
        String s = "My Name is Kusal";
        String s1 = "My age ";
        String s2 = "is 26";


        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));
        System.out.println(s.isEmpty());
        System.out.println(s2.replace("26","27"));
        System.out.println(s1.contains("26"));

    }
}
