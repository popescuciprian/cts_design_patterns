package creationale.singleton.implementations;

public class Singleton1 {
    public static Singleton1 instance = null;

    private Singleton1() {
        System.out.println("Singleton instance created!");
    }

    public static synchronized Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
