import basics.Basics;

public class application {

    public static void main(String... args) {
        System.out.println();
        System.out.println(System.getenv());
        System.out.println(System.getProperties());
        System.out.println(System.getSecurityManager());

        Basics basics = new Basics();
        basics.finalKeyword();
    }

}
