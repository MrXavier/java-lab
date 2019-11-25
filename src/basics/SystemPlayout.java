package basics;

public class SystemPlayout {
    public void play(){
        System.out.println();
        System.out.println("System.getenv(): " + System.getenv());
        System.out.println("System.getProperties(): " + System.getProperties());
        System.out.println("System.getSecurityManager(): " + System.getSecurityManager());
    }
}
