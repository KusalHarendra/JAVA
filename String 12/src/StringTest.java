public class StringTest {
    public static void main(String[] args) {
        String s1 = "Kusal";
        String s2 = "Kusal";

        if(s1==s2){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}

//in this method both s1 and s2 get equal. no separate memory locations for s1 and s2.