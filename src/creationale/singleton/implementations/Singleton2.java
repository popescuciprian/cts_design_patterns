package creationale.singleton.implementations;

public class Singleton2 {
    public static final Singleton2 instance;

    private Singleton2() {
        System.out.println("Singleton instance created!");
    }

    static {
        instance = new Singleton2();
    }
}
